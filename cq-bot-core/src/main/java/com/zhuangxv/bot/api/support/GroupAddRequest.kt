package com.zhuangxv.bot.api.support

import com.alibaba.fastjson.annotation.JSONField
import com.zhuangxv.bot.api.BaseApi

/**
 * @author  MeowRay
 * @date  2022/12/28 1:53
 * @version 1.0
 */
class GroupAddRequest(var param: Param) : BaseApi() {

    override fun getAction(): String {
        return "set_group_add_request"
    }

    override fun getParams(): Any {
        return param
    }

    data class Param(
        @JSONField(name = "flag")
        var flag: String = "",

        @JSONField(name = "sub_type")
        var subType: String = "",

        @JSONField(name = "approve")
        var approve: Boolean = false,

        @JSONField(name = "reason")
        var reason: String = "",
    ) {

    }


}