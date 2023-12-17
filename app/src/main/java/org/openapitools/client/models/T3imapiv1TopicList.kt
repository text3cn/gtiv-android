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

import org.openapitools.client.models.T3imapiv1TopicCommentList

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 帖子 id
 * @param userId 发布者 id
 * @param avatar 头像
 * @param nickname 昵称
 * @param commentList 评论列表
 * @param comments 几条评论数据
 * @param supports 点赞数
 * @param isSupported 我是否已点赞
 * @param photos 图片
 * @param content 评论内容
 * @param createTime 发布时间
 */


data class T3imapiv1TopicList (

    /* 帖子 id */
    @Json(name = "Id")
    val id: java.math.BigDecimal,

    /* 发布者 id */
    @Json(name = "UserId")
    val userId: java.math.BigDecimal,

    /* 头像 */
    @Json(name = "Avatar")
    val avatar: kotlin.String,

    /* 昵称 */
    @Json(name = "Nickname")
    val nickname: kotlin.String,

    /* 评论列表 */
    @Json(name = "CommentList")
    val commentList: kotlin.collections.List<T3imapiv1TopicCommentList>,

    /* 几条评论数据 */
    @Json(name = "Comments")
    val comments: java.math.BigDecimal,

    /* 点赞数 */
    @Json(name = "Supports")
    val supports: java.math.BigDecimal,

    /* 我是否已点赞 */
    @Json(name = "IsSupported")
    val isSupported: kotlin.Boolean,

    /* 图片 */
    @Json(name = "Photos")
    val photos: kotlin.String,

    /* 评论内容 */
    @Json(name = "Content")
    val content: kotlin.String,

    /* 发布时间 */
    @Json(name = "CreateTime")
    val createTime: java.math.BigDecimal

)

