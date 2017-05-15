package net.iclassmate.sample.springboot.utils;

import net.iclassmate.sample.springboot.web.conf.GlobalProperties;
import net.iclassmate.sample.springboot.web.conf.SpringLocator;

/**
 * 常量
 *
 * @author zhiqsyr
 * @since 2017/5/11
 */
public class Constants {

    public static GlobalProperties globalProperties;

    public static String[] ignoreUris;      // 忽略安全校验的 URI 集合

    static {
        globalProperties = SpringLocator.getBean(GlobalProperties.class);

        ignoreUris = globalProperties.getIgnoreUris().split(",");
    }

}
