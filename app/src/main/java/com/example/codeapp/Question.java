package com.example.codeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Question extends AppCompatActivity {

    private Button firstButton;
    private Button secondButton;
    private Button thirdButton;
    private Button fourthButton;
    private boolean answered = false;
    private int question;
    private int score;
    private Button nextButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_question);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        createButton();
        createText();
    }

    private void createText() {
        question = getIntent().getIntExtra("QuestionNo",1);
        score = getIntent().getIntExtra("Score",0);

        TextView questionText = findViewById(R.id.questionText);
        questionText.setText("Question :" + question);
        TextView scoreText = findViewById(R.id.scoreText);
        scoreText.setText("Score :" + score);
    }

    private void createButton() {
        firstButton = findViewById(R.id.firstButton);
        secondButton = findViewById(R.id.secondButton);
        thirdButton = findViewById(R.id.thirdButton);
        fourthButton = findViewById(R.id.fourthButton);

        nextButton = findViewById(R.id.nextButton);
        nextButton.setVisibility(View.INVISIBLE);

        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!answered) {
                    fadeInButton();
                }
            }
        });
        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!answered) {
                    fadeInButton();
                }
            }
        });
        thirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!answered) {
                    fadeInButton();
                }
            }
        });
        fourthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!answered) {
                    fadeInButton();
                }
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answered){
                    if(question < 10){
                        Intent intent = new Intent(Question.this, Question.class);
                        intent.putExtra("QuestionNo", question+1);
                        intent.putExtra("Score", score);
                        startActivity(intent);
                        finish();
                    }
                }
            }
        });
    }

    private void fadeInButton() {
        if(!answered){
            answered = true;
            Animation animation = new AlphaAnimation(0.0f,1.0f);
            animation.setDuration(1000);
            nextButton.startAnimation(animation);
            nextButton.setVisibility(View.VISIBLE);
        }
    }
}