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


import com.dao.KechengbiaoDao;
import com.entity.KechengbiaoEntity;
import com.service.KechengbiaoService;
import com.entity.vo.KechengbiaoVO;
import com.entity.view.KechengbiaoView;

@Service("kechengbiaoService")
public class KechengbiaoServiceImpl extends ServiceImpl<KechengbiaoDao, KechengbiaoEntity> implements KechengbiaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KechengbiaoEntity> page = this.selectPage(
                new Query<KechengbiaoEntity>(params).getPage(),
                new EntityWrapper<KechengbiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KechengbiaoEntity> wrapper) {
		  Page<KechengbiaoView> page =new Query<KechengbiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KechengbiaoVO> selectListVO(Wrapper<KechengbiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KechengbiaoVO selectVO(Wrapper<KechengbiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KechengbiaoView> selectListView(Wrapper<KechengbiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KechengbiaoView selectView(Wrapper<KechengbiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
