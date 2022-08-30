package com.msc.DTwinBackend.mapper;

import com.msc.DTwinBackend.entity.pojo.DatabaseTest;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author mSc
 * @version 1.0
 * @Package com.msc.DTwinBackend.mapper
 * @Description:
 */
@Mapper
@Repository
public interface DatabaseMapper {
    List<DatabaseTest> findAll();

    void add(DatabaseTest databaseTest);
}
