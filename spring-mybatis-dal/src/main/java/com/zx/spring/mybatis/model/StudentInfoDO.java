package com.zx.spring.mybatis.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * <p>
 *  学生信息DO
 * </p>
 *
 * @title: StudentInfoDO
 * @Author zx
 * @Date: 2021/11/30/0030 21:48
 * @Version 1.0
 */
@Setter
@Getter
@ToString
public class StudentInfoDO extends BaseDO{

    /**
     * 姓名
     */
    private String name;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private String sex;

    /**
     * 身高
     */
    private Long height;

    /**
     * 体重
     */
    private Long weight;

    /**
     * 注册日期
     */
    private Date registerDate;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 地址
     */
    private String address;

}
