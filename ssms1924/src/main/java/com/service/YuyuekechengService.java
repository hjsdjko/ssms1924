package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuyuekechengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuyuekechengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuyuekechengView;


/**
 * 预约课程
 *
 * @author 
 * @email 
 * @date 2021-05-08 16:37:26
 */
public interface YuyuekechengService extends IService<YuyuekechengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuyuekechengVO> selectListVO(Wrapper<YuyuekechengEntity> wrapper);
   	
   	YuyuekechengVO selectVO(@Param("ew") Wrapper<YuyuekechengEntity> wrapper);
   	
   	List<YuyuekechengView> selectListView(Wrapper<YuyuekechengEntity> wrapper);
   	
   	YuyuekechengView selectView(@Param("ew") Wrapper<YuyuekechengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuyuekechengEntity> wrapper);
   	
}

