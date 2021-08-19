package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ViewActivity extends AppCompatActivity {

    private TextView textView;
    private Button show_toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        textView = findViewById(R.id.textView);
        show_toast = findViewById(R.id.show_toast);

        Intent intentThatStartedThisActivity = getIntent();

        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            String textEntered = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT);

            textView.setText(textEntered);
        }
        show_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = ViewActivity.this;
                String message = "текст введен";
                Toast.makeText(context, message, Toast.LENGTH_LONG).show();
            }

        });
    }
}