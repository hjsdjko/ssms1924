package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YudingshiyanshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YudingshiyanshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YudingshiyanshiView;


/**
 * 预定实验室
 *
 * @author 
 * @email 
 * @date 2021-05-08 16:37:26
 */
public interface YudingshiyanshiService extends IService<YudingshiyanshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YudingshiyanshiVO> selectListVO(Wrapper<YudingshiyanshiEntity> wrapper);
   	
   	YudingshiyanshiVO selectVO(@Param("ew") Wrapper<YudingshiyanshiEntity> wrapper);
   	
   	List<YudingshiyanshiView> selectListView(Wrapper<YudingshiyanshiEntity> wrapper);
   	
   	YudingshiyanshiView selectView(@Param("ew") Wrapper<YudingshiyanshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YudingshiyanshiEntity> wrapper);
   	
}

