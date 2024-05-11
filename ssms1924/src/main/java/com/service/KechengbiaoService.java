package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KechengbiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KechengbiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KechengbiaoView;


/**
 * 课程表
 *
 * @author 
 * @email 
 * @date 2021-05-08 16:37:26
 */
public interface KechengbiaoService extends IService<KechengbiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KechengbiaoVO> selectListVO(Wrapper<KechengbiaoEntity> wrapper);
   	
   	KechengbiaoVO selectVO(@Param("ew") Wrapper<KechengbiaoEntity> wrapper);
   	
   	List<KechengbiaoView> selectListView(Wrapper<KechengbiaoEntity> wrapper);
   	
   	KechengbiaoView selectView(@Param("ew") Wrapper<KechengbiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KechengbiaoEntity> wrapper);
   	
}

