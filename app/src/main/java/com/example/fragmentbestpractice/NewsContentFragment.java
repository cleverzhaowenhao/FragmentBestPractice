package com.example.fragmentbestpractice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class NewsContentFragment extends Fragment {
//    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.news_content_frag, container, false);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        TextView newsTitleText = (TextView) getActivity().findViewById(R.id.news_title);
        TextView newsContentText = (TextView) getActivity().findViewById(R.id.news_content);
        String newsTitle = getArguments().getString(NEWS_TITLE);
        String newsContent = getArguments().getString(NEWS_CONTENT);
        newsTitleText.setText(newsTitle);
        newsContentText.setText(newsContent);


    }

//    public void refresh(String newsTitle, String newsContent) {
//        View visibilityLayout = view.findViewById(R.id.visibility_layout);
//        visibilityLayout.setVisibility(View.VISIBLE);
//        TextView newsTitleText = (TextView) view.findViewById(R.id.news_title);
//        TextView newsContentText = (TextView) view.findViewById(R.id.news_content);
//        newsTitleText.setText(newsTitle);
//        newsContentText.setText(newsContent);
//    }

    public static final String NEWS_TITLE = "news_title";
    public static final String NEWS_CONTENT = "news_content";

    public static NewsContentFragment newInstance(String newsTitle, String newsContent) {
        NewsContentFragment fragment = new NewsContentFragment();
        Bundle arguments = new Bundle();
        arguments.putString(NEWS_TITLE, newsTitle);
        arguments.putString(NEWS_CONTENT, newsContent);
        fragment.setArguments(arguments);
        return fragment;
    }
}
