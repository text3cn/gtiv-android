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
 * @param telCode 国际区号
 * @param tel 电话
 * @param verifyCode 验证码
 * @param inviteCode 邀请码
 */


data class T3imapiv1CheckRigiterReq (

    /* 国际区号 */
    @Json(name = "TelCode")
    val telCode: java.math.BigDecimal,

    /* 电话 */
    @Json(name = "Tel")
    val tel: kotlin.String,

    /* 验证码 */
    @Json(name = "VerifyCode")
    val verifyCode: java.math.BigDecimal,

    /* 邀请码 */
    @Json(name = "InviteCode")
    val inviteCode: kotlin.String? = null

)

