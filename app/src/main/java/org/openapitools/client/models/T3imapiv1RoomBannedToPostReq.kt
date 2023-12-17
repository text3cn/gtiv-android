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
 * @param roomId 群 ID
 * @param userId 被禁的用户 ID
 * @param type 禁言类型 1、10分钟 2、1小时 3、12小时 4、1天 5、永久禁言
 */


data class T3imapiv1RoomBannedToPostReq (

    /* 群 ID */
    @Json(name = "RoomId")
    val roomId: kotlin.String,

    /* 被禁的用户 ID */
    @Json(name = "UserId")
    val userId: kotlin.String,

    /* 禁言类型 1、10分钟 2、1小时 3、12小时 4、1天 5、永久禁言 */
    @Json(name = "Type")
    val type: kotlin.Int

)
