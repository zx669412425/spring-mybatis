package com.zx.spring.mybatis;

import com.zx.spring.mybatis.requestDTO.AddStudentInfoReqDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @title: StudentServiceTest
 * @Author zx
 * @Date: 2021/12/2/0002 22:50
 * @Version 1.0
 */
@Slf4j
public class StudentServiceTest extends BaseTest{

    @Autowired
    StudentServiceImpl studentService;

    @Test
    public void addStudentInfoTest(){

        AddStudentInfoReqDTO addStudentInfoReqDTO = new AddStudentInfoReqDTO();
        addStudentInfoReqDTO.setName("123");
        addStudentInfoReqDTO.setPhone("13414");
        addStudentInfoReqDTO.setAge(12);
        addStudentInfoReqDTO.setSex("123");
        addStudentInfoReqDTO.setHeight(23L);
        addStudentInfoReqDTO.setWeight(23L);
        addStudentInfoReqDTO.setRegisterDate(new Date());
        addStudentInfoReqDTO.setRemarks("qwer");
        addStudentInfoReqDTO.setAddress("werqwe");

        studentService.addStudentInfo(addStudentInfoReqDTO);


    }
}
