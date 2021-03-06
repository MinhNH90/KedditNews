package jp.robust.kedditnews.features.news

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import jp.robust.kedditnews.R
import jp.robust.kedditnews.commons.RedditNewsItem
import jp.robust.kedditnews.commons.extensions.inflate
import jp.robust.kedditnews.features.news.adapter.NewsAdapter
import kotlinx.android.synthetic.main.fragment_news.*

/**
 * Created by Nguyen Huu Minh on 2017/12/08
 * Robust inc
 */

class NewsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return container?.inflate(R.layout.fragment_news)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        news_list.setHasFixedSize(true)
        news_list.layoutManager = LinearLayoutManager(context)

        initAdapter()

        if (savedInstanceState == null) {
            val news = mutableListOf<RedditNewsItem>()
            for (i in 1..50) {
                news.add(RedditNewsItem(
                        "author $i",
                        "Title $i",
                        i,
                        1457207701L - i * 200,
                        "http://lorempixel.com/200/200/technics/$i",
                        "url"
                ))
            }
            (news_list.adapter as NewsAdapter).addNews(news)
        }
    }

    private fun initAdapter() {
        if (news_list.adapter == null) {
            news_list.adapter = NewsAdapter()
        }
    }
}