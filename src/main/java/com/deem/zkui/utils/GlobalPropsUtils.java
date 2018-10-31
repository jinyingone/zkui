package com.deem.zkui.utils;

import java.util.Properties;

/**
 * 全局配置工具类
 * 引用config.cfg
 *
 * @author jy
 * @create 2018-10-31 下午5:12
 **/
public class GlobalPropsUtils {
    private static Properties globalProps;

    public static Properties getGlobalProps() {
        return globalProps;
    }

    public static void setGlobalProps(Properties globalProps) {
        GlobalPropsUtils.globalProps = globalProps;
    }
}
