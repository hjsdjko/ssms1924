package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiaoxueshijianDao;
import com.entity.JiaoxueshijianEntity;
import com.service.JiaoxueshijianService;
import com.entity.vo.JiaoxueshijianVO;
import com.entity.view.JiaoxueshijianView;

@Service("jiaoxueshijianService")
public class JiaoxueshijianServiceImpl extends ServiceImpl<JiaoxueshijianDao, JiaoxueshijianEntity> implements JiaoxueshijianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoxueshijianEntity> page = this.selectPage(
                new Query<JiaoxueshijianEntity>(params).getPage(),
                new EntityWrapper<JiaoxueshijianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoxueshijianEntity> wrapper) {
		  Page<JiaoxueshijianView> page =new Query<JiaoxueshijianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoxueshijianVO> selectListVO(Wrapper<JiaoxueshijianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoxueshijianVO selectVO(Wrapper<JiaoxueshijianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoxueshijianView> selectListView(Wrapper<JiaoxueshijianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoxueshijianView selectView(Wrapper<JiaoxueshijianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
