package com.example.jaychen.jayconstraintdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.barrier);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v instanceof TextView) {
                    String string = ((TextView) v).getText().toString();
                    ((TextView) v).setText(String.format("%s1", string));
                }
            }
        };

        findViewById(R.id.button38).setOnClickListener(listener);
        findViewById(R.id.button39).setOnClickListener(listener);

        findViewById(R.id.button40).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ConstraintSetActivity.class));
            }
        });
    }
}
