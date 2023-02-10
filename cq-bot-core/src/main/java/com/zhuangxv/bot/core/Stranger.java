package com.zhuangxv.bot.core;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author xiaoxu
 * @since 2021/5/27 11:36
 */
@AllArgsConstructor
@Getter
public class Stranger  {

    private final long userId;

    private final String nickname;

    private final String sex;
    private final int age;
    private final String qid;
    private final int level;
    private final int loginDays;

    private final Bot bot;

}
