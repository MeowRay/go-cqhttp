package com.zhuangxv.bot.api.support;

import com.alibaba.fastjson.annotation.JSONField;
import com.zhuangxv.bot.api.BaseApi;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xiaoxu
 * @since 2022-05-24 10:19
 */
public class GetStranger extends BaseApi {

    private final Param param;

    public GetStranger( long userId) {
        this.param = new GetStranger.Param();
        this.param.setUserId(userId);
        this.param.setNoCache(false);
    }

    @Override
    public String getAction() {
        return "get_stranger_info";
    }

    @Override
    public Object getParams() {
        return param;
    }

    @Data
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class Param {

        @JSONField(name = "user_id")
        private long userId;

        @JSONField(name = "no_cache")
        private boolean noCache = true;

    }
}
