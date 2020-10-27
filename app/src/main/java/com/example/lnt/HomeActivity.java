package com.example.lnt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        String data = getIntent().getExtras().getString("mykey");
        TextView greetingTextView =findViewById(R.id.textView_greeting);
        greetingTextView.setText(data);
    }

}