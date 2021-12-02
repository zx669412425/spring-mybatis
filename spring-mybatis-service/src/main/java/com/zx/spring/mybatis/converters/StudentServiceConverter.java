package com.zx.spring.mybatis.converters;

import com.zx.spring.mybatis.model.StudentInfoBO;
import com.zx.spring.mybatis.requestDTO.AddStudentInfoReqDTO;

/**
 * <p>
 *
 * </p>
 *
 * @title: StudentServiceConverter
 * @Author zx
 * @Date: 2021/12/2/0002 22:42
 * @Version 1.0
 */
public class StudentServiceConverter {

    public static StudentInfoBO convertToStudentInfoBO(AddStudentInfoReqDTO addStudentInfoReqDTO){
        if (addStudentInfoReqDTO == null){
            return null;
        }
        StudentInfoBO studentInfoBO = new StudentInfoBO();
        studentInfoBO.setName(addStudentInfoReqDTO.getName());
        studentInfoBO.setPhone(addStudentInfoReqDTO.getPhone());
        studentInfoBO.setAge(addStudentInfoReqDTO.getAge());
        studentInfoBO.setSex(addStudentInfoReqDTO.getSex());
        studentInfoBO.setHeight(addStudentInfoReqDTO.getHeight());
        studentInfoBO.setWeight(addStudentInfoReqDTO.getWeight());
        studentInfoBO.setRegisterDate(addStudentInfoReqDTO.getRegisterDate());
        studentInfoBO.setRemarks(addStudentInfoReqDTO.getRemarks());
        studentInfoBO.setAddress(addStudentInfoReqDTO.getAddress());
        return studentInfoBO;
    }
}
