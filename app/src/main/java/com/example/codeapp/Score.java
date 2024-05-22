package com.example.codeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Score extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_score);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView scoretext = findViewById(R.id.scoreText2);

        TextView questiontext = findViewById(R.id.questionText2);
        scoretext.setText("You got a score of " + getIntent().getIntExtra("Score",0));
        int questionType = getIntent().getIntExtra("QuestionType",0);
        if (questionType == 1){
            questiontext.setText("You have completed Revision questions");
        }
        else if (questionType == 2){
            questiontext.setText("You have completed Lines of code questions");
        }
        else if (questionType == 3){
            questiontext.setText("You have completed Missing code questions");
        }
        else{
            questiontext.setText("You have completed Random questions");
        }

        Button button = findViewById(R.id.returnButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Score.this, MainPage.class);
                startActivity(intent);
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                finish();
            }
        });
    }
}