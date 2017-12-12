package jp.robust.kedditnews.commons

import jp.robust.kedditnews.commons.adapter.AdapterConstants
import jp.robust.kedditnews.commons.adapter.ViewType

/**
 * Created by Nguyen Huu Minh on 2017/12/11
 * Robust inc
 */

data class RedditNewsItem(
        val author: String,
        val title: String,
        val numComments: Int,
        val created: Long,
        val thumbnail: String,
        val url: String
) : ViewType {
    override fun getViewType() = AdapterConstants.NEWS
}