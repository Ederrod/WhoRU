package com.eder.rodriguez.whoru.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.eder.rodriguez.whoru.Model.ChatMessage;

import java.util.List;

/**
 * Created by ederr on 6/4/2018.
 */

public class Adapter extends BaseAdapter{
    private List<ChatMessage> messageList;
    private Context context;
    private LayoutInflater layoutInflater;

    public Adapter(List<ChatMessage> messageList, Context context) {
        this.messageList = messageList;
        this.context = context;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return messageList.size();
    }

    @Override
    public Object getItem(int position) {
        return messageList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(view == null) {
        }
        return view;
    }
}
