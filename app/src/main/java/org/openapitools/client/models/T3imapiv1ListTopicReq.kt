/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param type 列表类型：0.全部 1.关注的人。默认 0
 * @param userId 用户 ID，如果有传则只取这一个用户的数据
 * @param topicId 帖子 id，如果有传则只取这一条数据
 * @param page 页码，默认 1
 */


data class T3imapiv1ListTopicReq (

    /* 列表类型：0.全部 1.关注的人。默认 0 */
    @Json(name = "Type")
    val type: java.math.BigDecimal? = null,

    /* 用户 ID，如果有传则只取这一个用户的数据 */
    @Json(name = "UserId")
    val userId: kotlin.String? = null,

    /* 帖子 id，如果有传则只取这一条数据 */
    @Json(name = "TopicId")
    val topicId: java.math.BigDecimal? = null,

    /* 页码，默认 1 */
    @Json(name = "Page")
    val page: java.math.BigDecimal? = null

)

