package com.zhuangxv.bot.api.support

import com.alibaba.fastjson.annotation.JSONField
import com.zhuangxv.bot.api.BaseApi

/**
 * @author  MeowRay
 * @date  2022/12/28 1:53
 * @version 1.0
 */
class GroupKick(val groupId: Long, val userId: Long, val rejectAddRequest: Boolean) : BaseApi() {

    private val param = Param().also {
        it.groupId = groupId
        it.userId = userId
        it.rejectAddRequest = rejectAddRequest
    }

    override fun getAction(): String {
        return "set_group_kick"
    }

    override fun getParams(): Any {
        return param
    }

    class Param {

        @JSONField(name = "group_id")
         var groupId: Long = 0

        @JSONField(name = "user_id")
        var userId: Long = 0

        @JSONField(name = "reject_add_request")
         var rejectAddRequest: Boolean = false

    }


}