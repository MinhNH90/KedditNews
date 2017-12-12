package jp.robust.kedditnews.features.news.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import jp.robust.kedditnews.R
import jp.robust.kedditnews.commons.adapter.ViewType
import jp.robust.kedditnews.commons.adapter.ViewTypeDelegateAdapter
import jp.robust.kedditnews.commons.extensions.inflate

/**
 * Created by Nguyen Huu Minh on 2017/12/11
 * Robust inc
 */

class LoadingDelegateAdapter : ViewTypeDelegateAdapter {

    override fun onCreateViewHolder(parent: ViewGroup) = TurnsViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {

    }

    class TurnsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(parent.inflate(R.layout.item_news_loading)) {

    }
}