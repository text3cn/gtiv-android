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
 * @param nickname 按名称搜索
 * @param page 第几页
 * @param rows 每页显示多少条
 */


data class T3imapiv1RoomMemberListReq (

    /* 群 ID */
    @Json(name = "RoomId")
    val roomId: kotlin.String,

    /* 按名称搜索 */
    @Json(name = "Nickname")
    val nickname: kotlin.String? = null,

    /* 第几页 */
    @Json(name = "Page")
    val page: kotlin.Int? = null,

    /* 每页显示多少条 */
    @Json(name = "Rows")
    val rows: kotlin.Int? = null

)

