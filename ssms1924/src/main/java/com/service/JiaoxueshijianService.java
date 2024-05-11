package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoxueshijianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoxueshijianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoxueshijianView;


/**
 * 教学实践
 *
 * @author 
 * @email 
 * @date 2021-05-08 16:37:26
 */
public interface JiaoxueshijianService extends IService<JiaoxueshijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoxueshijianVO> selectListVO(Wrapper<JiaoxueshijianEntity> wrapper);
   	
   	JiaoxueshijianVO selectVO(@Param("ew") Wrapper<JiaoxueshijianEntity> wrapper);
   	
   	List<JiaoxueshijianView> selectListView(Wrapper<JiaoxueshijianEntity> wrapper);
   	
   	JiaoxueshijianView selectView(@Param("ew") Wrapper<JiaoxueshijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoxueshijianEntity> wrapper);
   	
}

