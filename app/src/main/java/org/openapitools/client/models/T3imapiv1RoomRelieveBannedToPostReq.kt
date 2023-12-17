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
 * @param userId 被禁的用户 ID，为 0 代表全体禁言
 */


data class T3imapiv1RoomRelieveBannedToPostReq (

    /* 群 ID */
    @Json(name = "RoomId")
    val roomId: kotlin.String,

    /* 被禁的用户 ID，为 0 代表全体禁言 */
    @Json(name = "UserId")
    val userId: kotlin.String

)

