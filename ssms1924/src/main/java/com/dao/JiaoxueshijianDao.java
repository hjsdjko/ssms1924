package com.dao;

import com.entity.JiaoxueshijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoxueshijianVO;
import com.entity.view.JiaoxueshijianView;


/**
 * 教学实践
 * 
 * @author 
 * @email 
 * @date 2021-05-08 16:37:26
 */
public interface JiaoxueshijianDao extends BaseMapper<JiaoxueshijianEntity> {
	
	List<JiaoxueshijianVO> selectListVO(@Param("ew") Wrapper<JiaoxueshijianEntity> wrapper);
	
	JiaoxueshijianVO selectVO(@Param("ew") Wrapper<JiaoxueshijianEntity> wrapper);
	
	List<JiaoxueshijianView> selectListView(@Param("ew") Wrapper<JiaoxueshijianEntity> wrapper);

	List<JiaoxueshijianView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoxueshijianEntity> wrapper);
	
	JiaoxueshijianView selectView(@Param("ew") Wrapper<JiaoxueshijianEntity> wrapper);
	
}
