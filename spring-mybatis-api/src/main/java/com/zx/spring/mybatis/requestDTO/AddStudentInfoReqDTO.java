package com.zx.spring.mybatis.requestDTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @title: AddStudentInfoReqDTO
 * @Author zx
 * @Date: 2021/12/2/0002 22:22
 * @Version 1.0
 */
@Setter
@Getter
@ToString
public class AddStudentInfoReqDTO implements Serializable {

    private static final long serialVersionUID = 9017652350047668790L;

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
