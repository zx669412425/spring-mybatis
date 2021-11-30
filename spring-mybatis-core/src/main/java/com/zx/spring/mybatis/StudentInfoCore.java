package com.zx.spring.mybatis;

import com.zx.spring.mybatis.constants.StudentConstants;
import com.zx.spring.mybatis.enums.ErrorEnum;
import com.zx.spring.mybatis.exceptions.ServiceException;
import com.zx.spring.mybatis.impl.StudentInfoManager;
import com.zx.spring.mybatis.model.StudentInfoBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <p>
 *
 * </p>
 *
 * @title: StudentInfoCore
 * @Author zx
 * @Date: 2021/11/17/0017 22:14
 * @Version 1.0
 */
@Component
public class StudentInfoCore {

    @Autowired
    private StudentInfoManager studentInfoManager;

    public void addStudentInfo(StudentInfoBO studentInfoBO){
        long i = studentInfoManager.addStudentInfo(studentInfoBO);
        if (StudentConstants.INT_ONE != i){
            throw new ServiceException(ErrorEnum.DB_ERROR);
        }
    }

    public String modifyStudentInfo(){
        return null;
    }
}
