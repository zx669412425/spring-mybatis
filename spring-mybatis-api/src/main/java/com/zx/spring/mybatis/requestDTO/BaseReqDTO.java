package com.zx.spring.mybatis.requestDTO;

import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @title: BaseReqDTO
 * @Author zx
 * @Date: 2021/12/2/0002 22:16
 * @Version 1.0
 */
@Setter
@Getter
@ToString
public class BaseReqDTO implements Serializable {

    private static final long serialVersionUID = -6340608940399456707L;

    private String requestNo;

    private String requestDate;

    private String requestSystem;

    private String traceLogId ;
}
