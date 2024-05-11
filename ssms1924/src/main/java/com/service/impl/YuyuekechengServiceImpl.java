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


import com.dao.YuyuekechengDao;
import com.entity.YuyuekechengEntity;
import com.service.YuyuekechengService;
import com.entity.vo.YuyuekechengVO;
import com.entity.view.YuyuekechengView;

@Service("yuyuekechengService")
public class YuyuekechengServiceImpl extends ServiceImpl<YuyuekechengDao, YuyuekechengEntity> implements YuyuekechengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuyuekechengEntity> page = this.selectPage(
                new Query<YuyuekechengEntity>(params).getPage(),
                new EntityWrapper<YuyuekechengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuyuekechengEntity> wrapper) {
		  Page<YuyuekechengView> page =new Query<YuyuekechengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuyuekechengVO> selectListVO(Wrapper<YuyuekechengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuyuekechengVO selectVO(Wrapper<YuyuekechengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuyuekechengView> selectListView(Wrapper<YuyuekechengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuyuekechengView selectView(Wrapper<YuyuekechengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
