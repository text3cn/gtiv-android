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

import org.openapitools.client.models.T3imapiv1Userinfo

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param apiCode 业务代码
 * @param apiMessage 接口描述信息
 * @param userinfo 
 */


data class T3imapiv1UserLoginRes (

    /* 业务代码 */
    @Json(name = "ApiCode")
    val apiCode: kotlin.Int,

    /* 接口描述信息 */
    @Json(name = "ApiMessage")
    val apiMessage: kotlin.String,

    @Json(name = "Userinfo")
    val userinfo: T3imapiv1Userinfo? = null

)

