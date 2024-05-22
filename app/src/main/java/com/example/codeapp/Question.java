package com.example.codeapp;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
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
        TextView  scoreText = findViewById(R.id.scoreText);
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

        firstButton.setOnClickListener(v -> {
            if(!answered) {
                fadeInButton();
                if (question.getCorrectAnswer() == 1) {
                    firstButton.setBackground(getDrawable(R.drawable.correct_gradient_list));
                    score++;
                    AnimationDrawable animationDrawable = (AnimationDrawable)
                            firstButton.getBackground();
                    animationDrawable.setEnterFadeDuration(0);
                    animationDrawable.setExitFadeDuration(100);
                    animationDrawable.start();
                }
                else{
                    firstButton.setBackground(getDrawable(R.drawable.incorrect_gradient_list));
                    AnimationDrawable animationDrawable = (AnimationDrawable)
                            firstButton.getBackground();
                    animationDrawable.setEnterFadeDuration(0);
                    animationDrawable.setExitFadeDuration(100);
                    animationDrawable.start();
                }
            }
        });
        secondButton.setOnClickListener(v -> {
            if(!answered) {
                fadeInButton();
                if (question.getCorrectAnswer() == 2) {
                    secondButton.setBackground(getDrawable(R.drawable.correct_gradient_list));
                    score++;
                    AnimationDrawable animationDrawable = (AnimationDrawable)
                            secondButton.getBackground();
                    animationDrawable.setEnterFadeDuration(0);
                    animationDrawable.setExitFadeDuration(100);
                    animationDrawable.start();
                }
                else{
                    secondButton.setBackground(getDrawable(R.drawable.incorrect_gradient_list));
                    AnimationDrawable animationDrawable = (AnimationDrawable)
                            secondButton.getBackground();
                    animationDrawable.setEnterFadeDuration(0);
                    animationDrawable.setExitFadeDuration(100);
                    animationDrawable.start();
                }
            }
        });
        thirdButton.setOnClickListener(v -> {
            if(!answered) {
                fadeInButton();
                if (question.getCorrectAnswer() == 3) {
                    thirdButton.setBackground(getDrawable(R.drawable.correct_gradient_list));
                    score++;
                    AnimationDrawable animationDrawable = (AnimationDrawable)
                            thirdButton.getBackground();
                    animationDrawable.setEnterFadeDuration(0);
                    animationDrawable.setExitFadeDuration(100);
                    animationDrawable.start();
                }
                else{
                    thirdButton.setBackground(getDrawable(R.drawable.incorrect_gradient_list));
                    AnimationDrawable animationDrawable = (AnimationDrawable)
                            thirdButton.getBackground();
                    animationDrawable.setEnterFadeDuration(0);
                    animationDrawable.setExitFadeDuration(100);
                    animationDrawable.start();
                }
            }
        });
        fourthButton.setOnClickListener(v -> {
            if(!answered) {
                fadeInButton();
                if (question.getCorrectAnswer() == 4) {
                    fourthButton.setBackground(getDrawable(R.drawable.correct_gradient_list));
                    score++;
                    AnimationDrawable animationDrawable = (AnimationDrawable)
                            fourthButton.getBackground();
                    animationDrawable.setEnterFadeDuration(0);
                    animationDrawable.setExitFadeDuration(100);
                    animationDrawable.start();
                }
                else{
                    fourthButton.setBackground(getDrawable(R.drawable.incorrect_gradient_list));
                    AnimationDrawable animationDrawable = (AnimationDrawable)
                            fourthButton.getBackground();
                    animationDrawable.setEnterFadeDuration(0);
                    animationDrawable.setExitFadeDuration(100);
                    animationDrawable.start();
                }
            }
        });

        nextButton.setOnClickListener(v -> {
            if(answered){
                if(questionNo < 10){
                    Intent intent = new Intent(Question.this, Question.class);
                    intent.putExtra("QuestionNo", questionNo + 1 );
                    intent.putExtra("Score", score);
                    intent.putExtra("QuestionType",questionType);
                    startActivity(intent);
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                    finish();
                }
                else{
                    Intent intent = new Intent(Question.this, Score.class);
                    intent.putExtra("QuestionNo", questionNo + 1 );
                    intent.putExtra("Score", score);
                    intent.putExtra("QuestionType",questionType);
                    startActivity(intent);
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                    finish();
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