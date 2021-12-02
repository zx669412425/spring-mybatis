package com.zx.spring.mybatis.responseDTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <p>
 *
 * </p>
 *
 * @title: Result
 * @Author zx
 * @Date: 2021/12/2/0002 22:37
 * @Version 1.0
 */
@Setter
@Getter
@ToString
public class Result <T>{

    Boolean isSuccess = true;

    T result;

    String errorCode;

    String errorMessage;
}
