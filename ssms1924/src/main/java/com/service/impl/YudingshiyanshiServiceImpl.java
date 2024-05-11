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


import com.dao.YudingshiyanshiDao;
import com.entity.YudingshiyanshiEntity;
import com.service.YudingshiyanshiService;
import com.entity.vo.YudingshiyanshiVO;
import com.entity.view.YudingshiyanshiView;

@Service("yudingshiyanshiService")
public class YudingshiyanshiServiceImpl extends ServiceImpl<YudingshiyanshiDao, YudingshiyanshiEntity> implements YudingshiyanshiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YudingshiyanshiEntity> page = this.selectPage(
                new Query<YudingshiyanshiEntity>(params).getPage(),
                new EntityWrapper<YudingshiyanshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YudingshiyanshiEntity> wrapper) {
		  Page<YudingshiyanshiView> page =new Query<YudingshiyanshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YudingshiyanshiVO> selectListVO(Wrapper<YudingshiyanshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YudingshiyanshiVO selectVO(Wrapper<YudingshiyanshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YudingshiyanshiView> selectListView(Wrapper<YudingshiyanshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YudingshiyanshiView selectView(Wrapper<YudingshiyanshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
