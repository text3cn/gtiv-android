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
 * @param roomId 
 * @param roomName 
 * @param avatar 
 * @param memberNum 
 */


data class T3imapiv1RoomList (

    @Json(name = "RoomId")
    val roomId: kotlin.String,

    @Json(name = "RoomName")
    val roomName: kotlin.String,

    @Json(name = "Avatar")
    val avatar: kotlin.String,

    @Json(name = "MemberNum")
    val memberNum: java.math.BigDecimal

)

