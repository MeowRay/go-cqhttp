package com.zhuangxv.bot.handler.meta;

import com.alibaba.fastjson.JSONObject;
import com.zhuangxv.bot.annotation.GroupRequestHandler;
import com.zhuangxv.bot.core.Bot;
import com.zhuangxv.bot.core.component.BotFactory;
import com.zhuangxv.bot.event.meta.GroupRequestEvent;
import com.zhuangxv.bot.handler.EventHandler;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author xiaoxu
 * @since 2022-05-24 10:19
 */
@Slf4j
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class GroupRequestEventHandler implements EventHandler {

    @Override
    public void handle(JSONObject jsonObject, Bot bot) {
        if (!GroupRequestEvent.isSupport(jsonObject)) {
            return;
        }
        GroupRequestEvent event = jsonObject.toJavaObject(GroupRequestEvent.class);


        List<Object> resultList = BotFactory.handleMethod(bot, event, handlerMethod -> {
            if (!handlerMethod.getMethod().isAnnotationPresent(GroupRequestHandler.class)) {
                return false;
            }
            GroupRequestHandler handler = handlerMethod.getMethod().getAnnotation(GroupRequestHandler.class);
            if (handler.bot() != 0 && handler.bot() != event.getSelfId()) {
                return false;
            }
            return true;
        }, "message");
    }

}
