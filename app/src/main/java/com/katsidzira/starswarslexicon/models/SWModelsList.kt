package com.katsidzira.starswarslexicon.models

import android.text.TextUtils

data class SWModelsList(
    val count: Int = 0,
    val next: String,
    val previous: String,
    val results: List<Any>
) {
    fun hasMore(): Boolean {
        return !TextUtils.isEmpty(next)
    }
}