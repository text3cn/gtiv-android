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
 * @param username 
 * @param password 
 */


data class T3imapiv1DeleteAccountReq (

    @Json(name = "Username")
    val username: java.math.BigDecimal,

    @Json(name = "Password")
    val password: kotlin.String

)

