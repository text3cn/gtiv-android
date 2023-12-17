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
 * @param fromUser 
 * @param toUsers 
 * @param message 
 * @param type 
 * @param userVersion 
 * @param msgId 
 */


data class T3imapiv1RoomMessageItem (

    @Json(name = "RoomId")
    val roomId: java.math.BigDecimal,

    @Json(name = "FromUser")
    val fromUser: java.math.BigDecimal,

    @Json(name = "ToUsers")
    val toUsers: kotlin.String,

    @Json(name = "Message")
    val message: kotlin.String,

    @Json(name = "Type")
    val type: java.math.BigDecimal,

    @Json(name = "UserVersion")
    val userVersion: java.math.BigDecimal,

    @Json(name = "MsgId")
    val msgId: kotlin.String

)
