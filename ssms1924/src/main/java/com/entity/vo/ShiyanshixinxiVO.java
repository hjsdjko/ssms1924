package com.entity.vo;

import com.entity.ShiyanshixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 实验室信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-08 16:37:26
 */
public class ShiyanshixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 实验室名称
	 */
	
	private String shiyanshimingcheng;
		
	/**
	 * 实验室图片
	 */
	
	private String shiyanshitupian;
		
	/**
	 * 实验室位置
	 */
	
	private String shiyanshiweizhi;
		
	/**
	 * 实验室状态
	 */
	
	private String shiyanshizhuangtai;
				
	
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
	 * 设置：实验室图片
	 */
	 
	public void setShiyanshitupian(String shiyanshitupian) {
		this.shiyanshitupian = shiyanshitupian;
	}
	
	/**
	 * 获取：实验室图片
	 */
	public String getShiyanshitupian() {
		return shiyanshitupian;
	}
				
	
	/**
	 * 设置：实验室位置
	 */
	 
	public void setShiyanshiweizhi(String shiyanshiweizhi) {
		this.shiyanshiweizhi = shiyanshiweizhi;
	}
	
	/**
	 * 获取：实验室位置
	 */
	public String getShiyanshiweizhi() {
		return shiyanshiweizhi;
	}
				
	
	/**
	 * 设置：实验室状态
	 */
	 
	public void setShiyanshizhuangtai(String shiyanshizhuangtai) {
		this.shiyanshizhuangtai = shiyanshizhuangtai;
	}
	
	/**
	 * 获取：实验室状态
	 */
	public String getShiyanshizhuangtai() {
		return shiyanshizhuangtai;
	}
			
}
