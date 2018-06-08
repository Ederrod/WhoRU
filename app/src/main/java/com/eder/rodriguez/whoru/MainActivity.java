package com.eder.rodriguez.whoru;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import com.eder.rodriguez.whoru.Model.ChatMessage;
import com.github.library.bubbleview.BubbleTextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    

    private ListView listView;
    private BubbleTextView bubbleTextView;
    private EditText textToSend;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.chatMessageList);
        bubbleTextView = (BubbleTextView) findViewById(R.id.messageText);
        textToSend = (EditText) findViewById(R.id.userMessageText);
        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(this::sendButtonClicked);
    }

    private void sendButtonClicked(View view) {
        String text = textToSend.getText().toString().trim();

        if(TextUtils.isEmpty(text))
            return;

    }
}
