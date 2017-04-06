package com.sunsharing.base.sys;

import com.sunsharing.component.resvalidate.config.annotation.Configuration;
import com.sunsharing.component.resvalidate.config.annotation.ParamField;

/**
 * Created by criss on 15/10/25.
 */
@Configuration(value = "config.properties")
public class SysParam {

    @ParamField(name = "db_driver",required = true)
    public static String dbDriver;

}
