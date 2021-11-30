package com.zx.spring.mybatis.impl;

import com.zx.spring.mybatis.convert.StudentInfoConverter;
import com.zx.spring.mybatis.mapper.StudentInfoMapper;
import com.zx.spring.mybatis.model.StudentInfoBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <p>
 *
 * </p>
 *
 * @title: StudentInfoManager
 * @Author zx
 * @Date: 2021/11/17/0017 22:19
 * @Version 1.0
 */
@Component
public class StudentInfoManager {

    @Autowired
    private StudentInfoMapper studentInfoMapper;

    public long addStudentInfo(StudentInfoBO studentInfoBO) {
        return studentInfoMapper.addStudentInfo(
                StudentInfoConverter.convertStudentInfoBOToDO(studentInfoBO));
    }

    public String modifyStudentInfo(){
        return null;
    }
}
