package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghuxinxiView;


/**
 * 用户信息
 *
 * @author 
 * @email 
 * @date 2021-05-08 16:37:26
 */
public interface YonghuxinxiService extends IService<YonghuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghuxinxiVO> selectListVO(Wrapper<YonghuxinxiEntity> wrapper);
   	
   	YonghuxinxiVO selectVO(@Param("ew") Wrapper<YonghuxinxiEntity> wrapper);
   	
   	List<YonghuxinxiView> selectListView(Wrapper<YonghuxinxiEntity> wrapper);
   	
   	YonghuxinxiView selectView(@Param("ew") Wrapper<YonghuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghuxinxiEntity> wrapper);
   	
}

