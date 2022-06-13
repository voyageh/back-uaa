package com.zephyr.uaa.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;

import java.time.ZonedDateTime;
import java.util.Date;

public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("CREATED_DATE", Date.from(ZonedDateTime.now().toInstant()), metaObject);
        this.setFieldValByName("CREATED_BY", "admin", metaObject);
        this.updateFill(metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("UPDATED_DATE", Date.from(ZonedDateTime.now().toInstant()), metaObject);
        this.setFieldValByName("UPDATED_BY", "admin", metaObject);
    }
}
