package com.zx.spring.mybatis.mapper;

import com.zx.spring.mybatis.model.StudentInfoDO;
import org.springframework.stereotype.Component;

/**
 * <p>
 *
 * </p>
 *
 * @title: StudentInfoMapper
 * @Author zx
 * @Date: 2021/11/17/0017 22:20
 * @Version 1.0
 */
@Component
public interface StudentInfoMapper {

    public long addStudentInfo(StudentInfoDO studentInfoDO);

    public String modifyStudentInfo(int id);
}
