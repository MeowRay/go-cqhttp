package com.zhuangxv.bot.annotation;

import com.zhuangxv.bot.event.EventPriority;

import java.lang.annotation.*;

/**
 * @author xiaoxu
 * @since 2022-05-24 10:19
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EventHandler {

    EventPriority priority() default EventPriority.NORMAL;

}
