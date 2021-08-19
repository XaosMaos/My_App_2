package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText user_text;
    private Button button_nav;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user_text = findViewById(R.id.user_text);
        image = findViewById(R.id.image);
        button_nav = findViewById(R.id.button_nav);

        button_nav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (user_text.getText().toString().trim().equals("")) {
                    Toast.makeText(MainActivity.this, R.string.not_text, Toast.LENGTH_LONG).show();
                    image.setImageResource(R.drawable.wrong1);

                } else {

                    String textEntered = user_text.getText().toString();
                    Context context = MainActivity.this;

                    Class destinationActivity = ViewActivity.class;
                    Intent viewActivityIntent = new Intent(context, destinationActivity);
                    viewActivityIntent.putExtra(Intent.EXTRA_TEXT, textEntered);
                    startActivity(viewActivityIntent);

                }

            }
        });
    }
}