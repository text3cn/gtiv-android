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
 * @param page 第几页
 * @param rows 每页显示多少条
 */


data class T3imapiv1SubscribeUserListReq (

    /* 第几页 */
    @Json(name = "Page")
    val page: java.math.BigDecimal? = null,

    /* 每页显示多少条 */
    @Json(name = "Rows")
    val rows: java.math.BigDecimal? = null

)

