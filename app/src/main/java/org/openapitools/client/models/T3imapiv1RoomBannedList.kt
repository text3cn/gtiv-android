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
 * @param userId 用户 id
 * @param expire 禁言结束时间
 * @param nickname 昵称
 * @param avatar 头像
 */


data class T3imapiv1RoomBannedList (

    /* 用户 id */
    @Json(name = "UserId")
    val userId: kotlin.String,

    /* 禁言结束时间 */
    @Json(name = "Expire")
    val expire: java.math.BigDecimal,

    /* 昵称 */
    @Json(name = "Nickname")
    val nickname: kotlin.String,

    /* 头像 */
    @Json(name = "Avatar")
    val avatar: kotlin.String

)

