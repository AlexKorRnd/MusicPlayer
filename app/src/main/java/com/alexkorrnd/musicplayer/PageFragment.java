package com.alexkorrnd.musicplayer;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by Алексей on 17.07.2015.
 */
public class PageFragment extends Fragment {

    static final String ARGUMENT_PAGE_NUMBER = "arg_page_number";

    private int pageNumber;

    static PageFragment newInstance(int page) {
        PageFragment pageFragment = new PageFragment();
        Bundle arguments = new Bundle();
        arguments.putInt(ARGUMENT_PAGE_NUMBER, page);
        pageFragment.setArguments(arguments);

        return pageFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageNumber = getArguments().getInt(ARGUMENT_PAGE_NUMBER);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        switch (pageNumber) {
            case 0:
                createViewEqualizer(inflater, container, savedInstanceState);
                break;
            case 1:
                createViewPlayer(inflater, container, savedInstanceState);
                break;
            case 2:
                createViewListSongs(inflater, container, savedInstanceState);
                break;

        }

        View view = inflater.inflate(R.layout.fragment, null);

        TextView tvPage = (TextView) view.findViewById(R.id.tvPage);
        tvPage.setText("Page " + pageNumber);


        return view;
    }

    private void createViewEqualizer(LayoutInflater inflater, ViewGroup container,
                                     Bundle savedInstanceState){

    }

    private void createViewPlayer(LayoutInflater inflater, ViewGroup container,
                                  Bundle savedInstanceState){


    }


    private void createViewListSongs(LayoutInflater inflater, ViewGroup container,
                                     Bundle savedInstanceState){

    }
}
