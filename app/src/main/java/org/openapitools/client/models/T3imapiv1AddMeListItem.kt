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
 * @param userId 
 * @param avatar 
 * @param nick 
 * @param msg 
 * @param time 
 * @param username 
 * @param gender 
 */


data class T3imapiv1AddMeListItem (

    @Json(name = "UserId")
    val userId: java.math.BigDecimal? = null,

    @Json(name = "Avatar")
    val avatar: kotlin.String? = null,

    @Json(name = "Nick")
    val nick: kotlin.String? = null,

    @Json(name = "Msg")
    val msg: kotlin.String? = null,

    @Json(name = "Time")
    val time: java.math.BigDecimal? = null,

    @Json(name = "Username")
    val username: kotlin.String? = null,

    @Json(name = "Gender")
    val gender: java.math.BigDecimal? = null

)

