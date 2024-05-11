package com.entity.view;

import com.entity.YudingshiyanshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 预定实验室
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-08 16:37:26
 */
@TableName("yudingshiyanshi")
public class YudingshiyanshiView  extends YudingshiyanshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YudingshiyanshiView(){
	}
 
 	public YudingshiyanshiView(YudingshiyanshiEntity yudingshiyanshiEntity){
 	try {
			BeanUtils.copyProperties(this, yudingshiyanshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
