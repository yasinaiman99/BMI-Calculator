package com.example.labindiviualyasin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        setupHyperlink();
    }

    private void setupHyperlink(){
        TextView LinkTextView = findViewById(R.id.textView2);
        LinkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}