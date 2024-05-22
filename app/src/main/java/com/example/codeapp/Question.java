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

import java.util.Random;

public class Question extends AppCompatActivity {

    private Button firstButton;
    private Button secondButton;
    private Button thirdButton;
    private Button fourthButton;
    private boolean answered = false;
    private int questionNo;
    private int score;
    private Button nextButton;
    private QuestionCreator question;
    private int questionType;
    private TextView scoreText;
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
        questionType = getIntent().getIntExtra("QuestionType",0);
        int rand = questionType;
        if (questionType == 0){
            Random randGen = new Random();
            rand = randGen.nextInt(3);
        }
        question = new QuestionCreator( rand );
        createButton();
        createText();
    }

    private void createText() {

        questionNo = getIntent().getIntExtra("QuestionNo",1);
        score = getIntent().getIntExtra("Score",0);

        TextView questionText = findViewById(R.id.questionText);
        questionText.setText("Question :" + questionNo);
        scoreText = findViewById(R.id.scoreText);
        scoreText.setText("Score :" + score);
        TextView questionType = findViewById(R.id.questionType);
        questionType.setText(question.getQuestionHead());
        TextView questionExample = findViewById(R.id.example);
        questionExample.setText(question.getQuestionBody());

        firstButton.setText(question.getAnswer1());
        secondButton.setText(question.getAnswer2());
        thirdButton.setText(question.getAnswer3());
        fourthButton.setText(question.getAnswer4());
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
                    if (question.getCorrectAnswer() == 1) {
                        score++;
                    }
                }
            }
        });
        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!answered) {
                    fadeInButton();
                    if (question.getCorrectAnswer() == 2) {
                        score++;
                    }
                }
            }
        });
        thirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!answered) {
                    fadeInButton();
                    if (question.getCorrectAnswer() == 3) {
                        score++;
                    }
                }
            }
        });
        fourthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!answered) {
                    fadeInButton();
                    if (question.getCorrectAnswer() == 4) {
                        score++;
                    }
                }
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answered){
                    if(questionNo < 10){

                        Intent intent = new Intent(Question.this, Question.class);
                        intent.putExtra("QuestionNo", questionNo + 1 );
                        intent.putExtra("Score", score);
                        intent.putExtra("QuestionType",questionType);
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