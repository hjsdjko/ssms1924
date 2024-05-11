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


import com.dao.YonghuxinxiDao;
import com.entity.YonghuxinxiEntity;
import com.service.YonghuxinxiService;
import com.entity.vo.YonghuxinxiVO;
import com.entity.view.YonghuxinxiView;

@Service("yonghuxinxiService")
public class YonghuxinxiServiceImpl extends ServiceImpl<YonghuxinxiDao, YonghuxinxiEntity> implements YonghuxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghuxinxiEntity> page = this.selectPage(
                new Query<YonghuxinxiEntity>(params).getPage(),
                new EntityWrapper<YonghuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghuxinxiEntity> wrapper) {
		  Page<YonghuxinxiView> page =new Query<YonghuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghuxinxiVO> selectListVO(Wrapper<YonghuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghuxinxiVO selectVO(Wrapper<YonghuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghuxinxiView> selectListView(Wrapper<YonghuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghuxinxiView selectView(Wrapper<YonghuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
