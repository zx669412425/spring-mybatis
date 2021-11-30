package com.zx.spring.mybatis;

import com.zx.spring.mybatis.model.StudentInfoBO;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 *
 * </p>
 *
 * @title: StudentInfoBiz
 * @Author zx
 * @Date: 2021/11/17/0017 22:17
 * @Version 1.0
 */
public class StudentInfoBiz {

    @Autowired
    StudentInfoCore studentInfoCore;

    public String addStudentInfo(StudentInfoBO studentInfoBO){
        String s ;
        try{
            studentInfoCore.addStudentInfo(studentInfoBO);
            s = "success";
        }catch (Exception e){
            return "fail";
        }
        return s;
    }

    public String modifyStudentInfo(){
        return null;
    }
}
