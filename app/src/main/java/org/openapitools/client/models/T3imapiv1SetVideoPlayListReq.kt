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
 * @param videoIds 视频 id 列表
 */


data class T3imapiv1SetVideoPlayListReq (

    /* 群 ID */
    @Json(name = "RoomId")
    val roomId: kotlin.String,

    /* 视频 id 列表 */
    @Json(name = "VideoIds")
    val videoIds: kotlin.String

)
