package com.zx.spring.mybatis;


import com.zx.spring.mybatis.converters.StudentServiceConverter;
import com.zx.spring.mybatis.model.StudentInfoBO;
import com.zx.spring.mybatis.requestDTO.AddStudentInfoReqDTO;
import com.zx.spring.mybatis.responseDTO.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *
 * </p>
 *
 * @title: StudentServiceImpl
 * @Author zx
 * @Date: 2021/11/14/0014 13:38
 * @Version 1.0
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentInfoBiz studentInfoBiz;


    @Override
    public Result<String> addStudentInfo(AddStudentInfoReqDTO addStudentInfoReqDTO) {
        StudentInfoBO studentInfoBO = StudentServiceConverter.convertToStudentInfoBO(addStudentInfoReqDTO);
        Result<String> result = new Result<>();
        String isSuccess = studentInfoBiz.addStudentInfo(studentInfoBO);
        result.setResult(isSuccess);
        return result;
    }

    @Override
    public String modifyStudentInfo() {
        return null;
    }
}
