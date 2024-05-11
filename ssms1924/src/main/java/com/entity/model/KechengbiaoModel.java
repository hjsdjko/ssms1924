package com.entity.model;

import com.entity.KechengbiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 课程表
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-08 16:37:26
 */
public class KechengbiaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 课表
	 */
	
	private String kebiao;
		
	/**
	 * 院系
	 */
	
	private String yuanxi;
		
	/**
	 * 年级
	 */
	
	private String nianji;
		
	/**
	 * 班级
	 */
	
	private String banji;
		
	/**
	 * 课表简介
	 */
	
	private String kebiaojianjie;
				
	
	/**
	 * 设置：课表
	 */
	 
	public void setKebiao(String kebiao) {
		this.kebiao = kebiao;
	}
	
	/**
	 * 获取：课表
	 */
	public String getKebiao() {
		return kebiao;
	}
				
	
	/**
	 * 设置：院系
	 */
	 
	public void setYuanxi(String yuanxi) {
		this.yuanxi = yuanxi;
	}
	
	/**
	 * 获取：院系
	 */
	public String getYuanxi() {
		return yuanxi;
	}
				
	
	/**
	 * 设置：年级
	 */
	 
	public void setNianji(String nianji) {
		this.nianji = nianji;
	}
	
	/**
	 * 获取：年级
	 */
	public String getNianji() {
		return nianji;
	}
				
	
	/**
	 * 设置：班级
	 */
	 
	public void setBanji(String banji) {
		this.banji = banji;
	}
	
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
				
	
	/**
	 * 设置：课表简介
	 */
	 
	public void setKebiaojianjie(String kebiaojianjie) {
		this.kebiaojianjie = kebiaojianjie;
	}
	
	/**
	 * 获取：课表简介
	 */
	public String getKebiaojianjie() {
		return kebiaojianjie;
	}
			
}
