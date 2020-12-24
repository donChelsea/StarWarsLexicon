package com.katsidzira.starswarslexicon.network

import android.text.TextUtils

data class ResponseResult<T>(
    val count: Int,
    val next: String,
    val previous: String,
    val results: List<T>
) {
    fun hasMore(): Boolean {
        return !TextUtils.isEmpty(next)
    }
}