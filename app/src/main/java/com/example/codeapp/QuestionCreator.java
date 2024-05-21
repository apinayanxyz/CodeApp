package com.example.codeapp;


import java.util.Random;

public class QuestionCreator {
    private int questionType;
    private String questionHead;
    private String questionBody;
    private int correctAnswer;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;

    public QuestionCreator(int questionType) {
        this.questionType = questionType;
        generateQuestion(questionType);
    }

    private void generateQuestion(int questionType) {
        Random rand = new Random();
        int randNum = rand.nextInt(15);
        if (questionType == 1 ){
            switch(randNum){
                case 1:
                    questionHead = "What data type does this belong to ";
                    questionBody = "\"Hello\"";
                    correctAnswer = 1 ;
                    answer1 = "String";
                    answer2 = "Integer";
                    answer3 = "Boolean";
                    answer4 = "Character";
                    break;
                case 2:
                    questionHead = "What data type does this belong to ";
                    questionBody = "2901";
                    correctAnswer = 3 ;
                    answer1 = "Character";
                    answer2 = "Boolean";
                    answer3 = "Integer";
                    answer4 = "Date";
                    break;
                case 3:
                    questionHead = "What data type does this belong to ";
                    questionBody = "true";
                    correctAnswer = 3;
                    answer1 = "Date";
                    answer2 = "Integer";
                    answer3 = "Boolean";
                    answer4 = "Character";
                    break;
                case 4:
                    questionHead = "What data type does this belong to ";
                    questionBody = "9010.092";
                    correctAnswer = 2 ;
                    answer1 = "Integer";
                    answer2 = "Float";
                    answer3 = "Boolean";
                    answer4 = "Char";
                    break;
                case 5:
                    questionHead = "";
                    questionBody = "";
                    correctAnswer = ;
                    answer1 = "";
                    answer2 = "";
                    answer3 = "";
                    answer4 = "";
                    break;
                case 6:
                    questionHead = "";
                    questionBody = "";
                    correctAnswer = ;
                    answer1 = "";
                    answer2 = "";
                    answer3 = "";
                    answer4 = "";
                    break;
                case 7:
                    questionHead = "";
                    questionBody = "";
                    correctAnswer = ;
                    answer1 = "";
                    answer2 = "";
                    answer3 = "";
                    answer4 = "";
                    break;
                case 8:
                    questionHead = "";
                    questionBody = "";
                    correctAnswer = ;
                    answer1 = "";
                    answer2 = "";
                    answer3 = "";
                    answer4 = "";
                    break;
                case 9:
                    questionHead = "";
                    questionBody = "";
                    correctAnswer = ;
                    answer1 = "";
                    answer2 = "";
                    answer3 = "";
                    answer4 = "";
                    break;
                case 10:
                    questionHead = "";
                    questionBody = "";
                    correctAnswer = ;
                    answer1 = "";
                    answer2 = "";
                    answer3 = "";
                    answer4 = "";
                    break;
                case 11:
                    questionHead = "";
                    questionBody = "";
                    correctAnswer = ;
                    answer1 = "";
                    answer2 = "";
                    answer3 = "";
                    answer4 = "";
                    break;
                case 12:
                    questionHead = "";
                    questionBody = "";
                    correctAnswer = ;
                    answer1 = "";
                    answer2 = "";
                    answer3 = "";
                    answer4 = "";
                    break;
                case 13:
                    questionHead = "";
                    questionBody = "";
                    correctAnswer = ;
                    answer1 = "";
                    answer2 = "";
                    answer3 = "";
                    answer4 = "";
                    break;
                case 14:
                    questionHead = "";
                    questionBody = "";
                    correctAnswer = ;
                    answer1 = "";
                    answer2 = "";
                    answer3 = "";
                    answer4 = "";
                    break;
                case 15:
                    questionHead = "";
                    questionBody = "";
                    correctAnswer = ;
                    answer1 = "";
                    answer2 = "";
                    answer3 = "";
                    answer4 = "";
                    questionHead = "";
                    questionBody = "";
                    correctAnswer = ;
                    answer1 = "";
                    answer2 = "";
                    answer3 = "";
                    answer4 = "";
                    break;

                default:

            }
        }
        else if (questionType == 2){

        }
        else{

        }
    }
}
