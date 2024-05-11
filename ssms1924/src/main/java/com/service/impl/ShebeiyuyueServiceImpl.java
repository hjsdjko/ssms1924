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


import com.dao.ShebeiyuyueDao;
import com.entity.ShebeiyuyueEntity;
import com.service.ShebeiyuyueService;
import com.entity.vo.ShebeiyuyueVO;
import com.entity.view.ShebeiyuyueView;

@Service("shebeiyuyueService")
public class ShebeiyuyueServiceImpl extends ServiceImpl<ShebeiyuyueDao, ShebeiyuyueEntity> implements ShebeiyuyueService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShebeiyuyueEntity> page = this.selectPage(
                new Query<ShebeiyuyueEntity>(params).getPage(),
                new EntityWrapper<ShebeiyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShebeiyuyueEntity> wrapper) {
		  Page<ShebeiyuyueView> page =new Query<ShebeiyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShebeiyuyueVO> selectListVO(Wrapper<ShebeiyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShebeiyuyueVO selectVO(Wrapper<ShebeiyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShebeiyuyueView> selectListView(Wrapper<ShebeiyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShebeiyuyueView selectView(Wrapper<ShebeiyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
