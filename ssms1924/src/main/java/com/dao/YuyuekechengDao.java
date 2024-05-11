package com.dao;

import com.entity.YuyuekechengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuyuekechengVO;
import com.entity.view.YuyuekechengView;


/**
 * 预约课程
 * 
 * @author 
 * @email 
 * @date 2021-05-08 16:37:26
 */
public interface YuyuekechengDao extends BaseMapper<YuyuekechengEntity> {
	
	List<YuyuekechengVO> selectListVO(@Param("ew") Wrapper<YuyuekechengEntity> wrapper);
	
	YuyuekechengVO selectVO(@Param("ew") Wrapper<YuyuekechengEntity> wrapper);
	
	List<YuyuekechengView> selectListView(@Param("ew") Wrapper<YuyuekechengEntity> wrapper);

	List<YuyuekechengView> selectListView(Pagination page,@Param("ew") Wrapper<YuyuekechengEntity> wrapper);
	
	YuyuekechengView selectView(@Param("ew") Wrapper<YuyuekechengEntity> wrapper);
	
}
