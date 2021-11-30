package com.zx.spring.mybatis.convert;

import com.zx.spring.mybatis.model.StudentInfoBO;
import com.zx.spring.mybatis.model.StudentInfoDO;

/**
 * <p>
 *
 * </p>
 *
 * @title: StudentInfoConverter
 * @Author zx
 * @Date: 2021/11/30/0030 22:12
 * @Version 1.0
 */
public class StudentInfoConverter {

    public static StudentInfoDO convertStudentInfoBOToDO(StudentInfoBO studentInfoBO){
        if (studentInfoBO == null){
            return null;
        }
        StudentInfoDO studentInfoDO = new StudentInfoDO();
        studentInfoDO.setName(studentInfoBO.getName());
        studentInfoDO.setPhone(studentInfoBO.getPhone());
        studentInfoDO.setAge(studentInfoBO.getAge());
        studentInfoDO.setSex(studentInfoBO.getSex());
        studentInfoDO.setHeight(studentInfoBO.getHeight());
        studentInfoDO.setWeight(studentInfoBO.getWeight());
        studentInfoDO.setRegisterDate(studentInfoBO.getRegisterDate());
        studentInfoDO.setRemarks(studentInfoBO.getRemarks());
        studentInfoDO.setAddress(studentInfoBO.getAddress());
        return studentInfoDO;
    }
}
