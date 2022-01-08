package com.ahmedhossny61.newsapp;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
public class NewsAdapter extends ArrayAdapter<News> {
    public static final String LOG_TAG = NewsAdapter.class.getName();
    public NewsAdapter(Activity context, ArrayList<News> androidWord) {
        super(context, 0, androidWord);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View ListItemView = convertView;
        if (ListItemView == null) {
            ListItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view, parent, false);
        }
        News Current_news = getItem(position);

        TextView News_title = (TextView) ListItemView.findViewById(R.id.news_title);
        News_title.setText(Current_news.getTitle()+"");

        TextView News_author = (TextView) ListItemView.findViewById(R.id.news_Author);
        if (!Current_news.getAuthor().isEmpty()) {
            News_author.setText(Current_news.getAuthor());

        }
        else{
            News_author.setVisibility(View.INVISIBLE);
            TextView label_author=(TextView)ListItemView.findViewById(R.id.label_author);
            label_author.setText("");
            label_author.setVisibility(View.INVISIBLE);
        }

        TextView news_date = (TextView) ListItemView.findViewById(R.id.news_date);
        if(Current_news.getDate()!=null)
        news_date.setText(Current_news.getDate());

        TextView news_section = (TextView) ListItemView.findViewById(R.id.news_section);
        news_section.setText(Current_news.getSection());

        return ListItemView;

    }
}
