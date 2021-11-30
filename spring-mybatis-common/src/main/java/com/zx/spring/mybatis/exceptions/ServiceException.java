package com.zx.spring.mybatis.exceptions;

import com.zx.spring.mybatis.enums.ErrorEnum;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 *
 * </p>
 *
 * @title: ServiceException
 * @Author zx
 * @Date: 2021/11/30/0030 22:33
 * @Version 1.0
 */
@Setter
@Getter
public class ServiceException extends RuntimeException{

    private String errorCode;

    private String errorDesc;

    public ServiceException(String errorCode,String errorDesc){
        this.errorCode = errorCode;
        this.errorDesc = errorDesc;
    }

    public ServiceException(ErrorEnum errorEnum){
        this.errorCode = errorEnum.getCode();
        this.errorDesc = errorEnum.getCode();
    }

}
