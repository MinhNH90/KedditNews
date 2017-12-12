package jp.robust.kedditnews.features.news.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import jp.robust.kedditnews.R
import jp.robust.kedditnews.commons.RedditNewsItem
import jp.robust.kedditnews.commons.adapter.ViewType
import jp.robust.kedditnews.commons.adapter.ViewTypeDelegateAdapter
import jp.robust.kedditnews.commons.extensions.getFriendlyTime
import jp.robust.kedditnews.commons.extensions.inflate
import jp.robust.kedditnews.commons.extensions.loadImg
import kotlinx.android.synthetic.main.item_news.view.*

/**
 * Created by Nguyen Huu Minh on 2017/12/11
 * Robust inc
 */

class NewsDelegateAdapter : ViewTypeDelegateAdapter {

    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return TurnsViewHolder(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
        holder as TurnsViewHolder
        holder.bind(item as RedditNewsItem)
    }

    class TurnsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.item_news)) {

        fun bind(item: RedditNewsItem) = with(itemView) {
            img_thumbnail.loadImg(item.thumbnail)
            description.text = item.title
            author.text = item.author
            comments.text = "${item.numComments} comments"
            time.text = item.created.getFriendlyTime()
        }
    }
}