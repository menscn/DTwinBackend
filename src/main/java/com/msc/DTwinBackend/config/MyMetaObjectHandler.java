package com.msc.DTwinBackend.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;


/**
 * @author mSc
 * @version 1.0
 * @Package com.msc.DTwinBackend.config
 * @Description:
 */
@Component
@Slf4j
public class MyMetaObjectHandler implements MetaObjectHandler {
    //添加时候自动填充 setFieldValByName三个参数为：映射类字段，填充值，原对象
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("createTime", new Date(), metaObject);
        this.setFieldValByName("updateTime", new Date(), metaObject);
    }

    //修改时候自动填充
    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updateTime", new Date(), metaObject);
    }
}

