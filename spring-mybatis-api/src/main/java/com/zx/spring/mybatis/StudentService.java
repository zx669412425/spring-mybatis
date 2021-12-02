package com.zx.spring.mybatis;


import com.zx.spring.mybatis.requestDTO.AddStudentInfoReqDTO;
import com.zx.spring.mybatis.responseDTO.Result;

/**
 * <p>
 *
 * </p>
 *
 * @title: StudentService
 * @Author zx
 * @Date: 2021/11/10/0010 22:29
 * @Version 1.0
 */
public interface StudentService {

    Result<String> addStudentInfo(AddStudentInfoReqDTO addStudentInfoReqDTO);

    String modifyStudentInfo();




}
