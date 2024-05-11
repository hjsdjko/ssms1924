package com.entity.model;

import com.entity.JiaoxueshijianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 教学实践
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-08 16:37:26
 */
public class JiaoxueshijianModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 教学内容
	 */
	
	private String jiaoxueneirong;
		
	/**
	 * 授课老师
	 */
	
	private String shoukelaoshi;
		
	/**
	 * 教学时间
	 */
	
	private String jiaoxueshijian;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 实验室号
	 */
	
	private String shiyanshihao;
		
	/**
	 * 实验室名称
	 */
	
	private String shiyanshimingcheng;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：教学内容
	 */
	 
	public void setJiaoxueneirong(String jiaoxueneirong) {
		this.jiaoxueneirong = jiaoxueneirong;
	}
	
	/**
	 * 获取：教学内容
	 */
	public String getJiaoxueneirong() {
		return jiaoxueneirong;
	}
				
	
	/**
	 * 设置：授课老师
	 */
	 
	public void setShoukelaoshi(String shoukelaoshi) {
		this.shoukelaoshi = shoukelaoshi;
	}
	
	/**
	 * 获取：授课老师
	 */
	public String getShoukelaoshi() {
		return shoukelaoshi;
	}
				
	
	/**
	 * 设置：教学时间
	 */
	 
	public void setJiaoxueshijian(String jiaoxueshijian) {
		this.jiaoxueshijian = jiaoxueshijian;
	}
	
	/**
	 * 获取：教学时间
	 */
	public String getJiaoxueshijian() {
		return jiaoxueshijian;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：实验室号
	 */
	 
	public void setShiyanshihao(String shiyanshihao) {
		this.shiyanshihao = shiyanshihao;
	}
	
	/**
	 * 获取：实验室号
	 */
	public String getShiyanshihao() {
		return shiyanshihao;
	}
				
	
	/**
	 * 设置：实验室名称
	 */
	 
	public void setShiyanshimingcheng(String shiyanshimingcheng) {
		this.shiyanshimingcheng = shiyanshimingcheng;
	}
	
	/**
	 * 获取：实验室名称
	 */
	public String getShiyanshimingcheng() {
		return shiyanshimingcheng;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
