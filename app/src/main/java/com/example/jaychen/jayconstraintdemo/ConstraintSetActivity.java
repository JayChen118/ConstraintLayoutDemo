package com.example.jaychen.jayconstraintdemo;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.transition.AutoTransition;
import android.support.transition.Transition;
import android.support.transition.TransitionManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ConstraintSetActivity extends AppCompatActivity {

    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_set);
        constraintLayout = findViewById(R.id.constraint_layout);
        findViewById(R.id.button41).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animate();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    private void animate() {
        ConstraintSet set = new ConstraintSet();
        set.clone(this, R.layout.activity_constraint_set2);
        Transition transition = new AutoTransition();
        transition.setDuration(5000);
        TransitionManager.beginDelayedTransition(constraintLayout, transition);
        set.applyTo(constraintLayout);
    }


}
