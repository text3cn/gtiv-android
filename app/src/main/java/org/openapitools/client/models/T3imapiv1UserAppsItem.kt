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
 * @param id 
 * @param title 
 * @param url 
 * @param logo 
 */


data class T3imapiv1UserAppsItem (

    @Json(name = "Id")
    val id: java.math.BigDecimal,

    @Json(name = "Title")
    val title: kotlin.String,

    @Json(name = "Url")
    val url: kotlin.String,

    @Json(name = "Logo")
    val logo: kotlin.String

)

