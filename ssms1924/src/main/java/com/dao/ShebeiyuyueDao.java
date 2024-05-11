package com.dao;

import com.entity.ShebeiyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShebeiyuyueVO;
import com.entity.view.ShebeiyuyueView;


/**
 * 设备预约
 * 
 * @author 
 * @email 
 * @date 2021-05-08 16:37:26
 */
public interface ShebeiyuyueDao extends BaseMapper<ShebeiyuyueEntity> {
	
	List<ShebeiyuyueVO> selectListVO(@Param("ew") Wrapper<ShebeiyuyueEntity> wrapper);
	
	ShebeiyuyueVO selectVO(@Param("ew") Wrapper<ShebeiyuyueEntity> wrapper);
	
	List<ShebeiyuyueView> selectListView(@Param("ew") Wrapper<ShebeiyuyueEntity> wrapper);

	List<ShebeiyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<ShebeiyuyueEntity> wrapper);
	
	ShebeiyuyueView selectView(@Param("ew") Wrapper<ShebeiyuyueEntity> wrapper);
	
}
