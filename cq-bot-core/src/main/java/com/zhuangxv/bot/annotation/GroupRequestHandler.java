package com.zhuangxv.bot.annotation;

import com.zhuangxv.bot.utilEnum.IgnoreItselfEnum;

import java.lang.annotation.*;

/**
 * @author xiaoxu
 * @since 2022-05-24 10:19
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface GroupRequestHandler {

    /**
     * 限制bot 参数为bot qq  0为不限制
     */
    long bot() default 0;


}
