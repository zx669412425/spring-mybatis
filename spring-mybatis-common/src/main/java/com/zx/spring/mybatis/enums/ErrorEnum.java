package com.zx.spring.mybatis.enums;

import lombok.Getter;

/**
 * <p>
 *
 * </p>
 *
 * @title: ErrorEnum
 * @Author zx
 * @Date: 2021/11/30/0030 22:44
 * @Version 1.0
 */
@Getter
public enum ErrorEnum {

    DB_ERROR("DB_ERROR","数据库操作异常"),
    ;

    private String code;

    private String desc;

    ErrorEnum(String code,String desc){
        this.code = code;
        this.desc = desc;
    }
}
