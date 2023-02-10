package com.zhuangxv.bot.event.meta;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.zhuangxv.bot.event.message.MessageEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author xiaoxu
 * @since 2022-05-24 10:19
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class GroupRequestEvent extends MessageEvent {

    @JSONField(name = "sub_type")
    private String subType;

    @JSONField(name = "group_id")
    private Long groupId;

    @JSONField(name = "self_id")
    private Long selfId;

    @JSONField(name = "user_id")
    private Long userId;

    @JSONField(name = "comment")
    private String comment;

    @JSONField(name = "flag")
    private String flag;


    public static boolean isSupport(JSONObject jsonObject) {
        return (("request".equals(jsonObject.getString("post_type")))&& "group".equals(jsonObject.getString("request_type")));
    }

}
