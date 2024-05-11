package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShebeiyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShebeiyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShebeiyuyueView;


/**
 * 设备预约
 *
 * @author 
 * @email 
 * @date 2021-05-08 16:37:26
 */
public interface ShebeiyuyueService extends IService<ShebeiyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShebeiyuyueVO> selectListVO(Wrapper<ShebeiyuyueEntity> wrapper);
   	
   	ShebeiyuyueVO selectVO(@Param("ew") Wrapper<ShebeiyuyueEntity> wrapper);
   	
   	List<ShebeiyuyueView> selectListView(Wrapper<ShebeiyuyueEntity> wrapper);
   	
   	ShebeiyuyueView selectView(@Param("ew") Wrapper<ShebeiyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShebeiyuyueEntity> wrapper);
   	
}

