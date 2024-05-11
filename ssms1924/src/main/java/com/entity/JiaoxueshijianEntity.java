package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 教学实践
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-08 16:37:26
 */
@TableName("jiaoxueshijian")
public class JiaoxueshijianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaoxueshijianEntity() {
		
	}
	
	public JiaoxueshijianEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 教学名称
	 */
					
	private String jiaoxuemingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：教学名称
	 */
	public void setJiaoxuemingcheng(String jiaoxuemingcheng) {
		this.jiaoxuemingcheng = jiaoxuemingcheng;
	}
	/**
	 * 获取：教学名称
	 */
	public String getJiaoxuemingcheng() {
		return jiaoxuemingcheng;
	}
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
