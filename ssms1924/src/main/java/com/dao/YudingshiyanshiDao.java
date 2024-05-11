package com.dao;

import com.entity.YudingshiyanshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YudingshiyanshiVO;
import com.entity.view.YudingshiyanshiView;


/**
 * 预定实验室
 * 
 * @author 
 * @email 
 * @date 2021-05-08 16:37:26
 */
public interface YudingshiyanshiDao extends BaseMapper<YudingshiyanshiEntity> {
	
	List<YudingshiyanshiVO> selectListVO(@Param("ew") Wrapper<YudingshiyanshiEntity> wrapper);
	
	YudingshiyanshiVO selectVO(@Param("ew") Wrapper<YudingshiyanshiEntity> wrapper);
	
	List<YudingshiyanshiView> selectListView(@Param("ew") Wrapper<YudingshiyanshiEntity> wrapper);

	List<YudingshiyanshiView> selectListView(Pagination page,@Param("ew") Wrapper<YudingshiyanshiEntity> wrapper);
	
	YudingshiyanshiView selectView(@Param("ew") Wrapper<YudingshiyanshiEntity> wrapper);
	
}
