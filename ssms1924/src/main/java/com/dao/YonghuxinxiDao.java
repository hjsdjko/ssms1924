package com.dao;

import com.entity.YonghuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghuxinxiVO;
import com.entity.view.YonghuxinxiView;


/**
 * 用户信息
 * 
 * @author 
 * @email 
 * @date 2021-05-08 16:37:26
 */
public interface YonghuxinxiDao extends BaseMapper<YonghuxinxiEntity> {
	
	List<YonghuxinxiVO> selectListVO(@Param("ew") Wrapper<YonghuxinxiEntity> wrapper);
	
	YonghuxinxiVO selectVO(@Param("ew") Wrapper<YonghuxinxiEntity> wrapper);
	
	List<YonghuxinxiView> selectListView(@Param("ew") Wrapper<YonghuxinxiEntity> wrapper);

	List<YonghuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YonghuxinxiEntity> wrapper);
	
	YonghuxinxiView selectView(@Param("ew") Wrapper<YonghuxinxiEntity> wrapper);
	
}
