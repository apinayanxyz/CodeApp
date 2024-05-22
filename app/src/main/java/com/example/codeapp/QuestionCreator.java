package com.example.codeapp;


import java.util.Random;

public class QuestionCreator {
    public int getQuestionType() {
        return questionType;
    }

    public String getQuestionHead() {
        return questionHead;
    }

    public String getQuestionBody() {
        return questionBody;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

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
            revisionQuestionCreation(randNum);
        }
        else if (questionType == 2){

        }
        else{

        }
    }

    private void revisionQuestionCreation(int randNum) {
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
                questionBody = "Whats it inheritance";
                correctAnswer = 1 ;
                answer1 = "A child class inherits the methods and attribute of a parent class";
                answer2 = "A variable inherits the value of another variable";
                answer3 = "A method with the same name inherits the property of anther variable";
                answer4 = "An object made from a class";
                break;
            case 6:
                questionHead = "";
                questionBody = "What does IDE stand for";
                correctAnswer = 3 ;
                answer1 = "Intelligent design environment";
                answer2 = "Integrated design engineer";
                answer3 = "Integrated developer environment";
                answer4 = "Intelligent developer engineer";
                break;
            case 7:
                questionHead = "";
                questionBody = "If a subroutine returns data, what is it?";
                correctAnswer = 4 ;
                answer1 = "Object";
                answer2 = "Procedure";
                answer3 = "Class";
                answer4 = "Function";
                break;
            case 8:
                questionHead = "";
                questionBody = "What is an object";
                correctAnswer = 4 ;
                answer1 = "A programming language";
                answer2 = "A parent class inheriting an object class";
                answer3 = "A small piece of code that is separate from the main code";
                answer4 = "An instance of a class";
                break;
            case 9:
                questionHead = "";
                questionBody = "Which of these is not a programming language";
                correctAnswer = 2 ;
                answer1 = "Java";
                answer2 = "NotePad++";
                answer3 = "Python";
                answer4 = "C#";
                break;
            case 10:
                questionHead = "What is the result of this line";
                questionBody = " 2(String) + 3(String)";
                correctAnswer = 1 ;
                answer1 = "23";
                answer2 = "4";
                answer3 = "5";
                answer4 = "32";
                break;
            case 11:
                questionHead = "What is the result of this line";
                questionBody = " 1(int) + 9(int)";
                correctAnswer = 4;
                answer1 = "5";
                answer2 = "19";
                answer3 = "0";
                answer4 = "10";
                break;
            case 12:
                questionHead = "What is the result of this line";
                questionBody = " \"Hello \"(String) + \"World\" (String)";
                correctAnswer = 4 ;
                answer1 = "Hello world";
                answer2 = "HelloWorld";
                answer3 = "99";
                answer4 = "Hello World";
                break;
            case 13:
                questionHead = "";
                questionBody = "Which of these is a programming language";
                correctAnswer = 3 ;
                answer1 = "Visual Studio";
                answer2 = "Word";
                answer3 = "Java";
                answer4 = "Android Studio";
                break;
            case 14:
                questionHead = "";
                questionBody = "What is a compiler";
                correctAnswer = 2;
                answer1 = "Used to write code";
                answer2 = "Translate your program into machine code";
                answer3 = "A coding language";
                answer4 = "Used to save code onto GitHub";
                break;
            default:
                questionHead = "What characteristic of the OOP paradigm is missing";
                questionBody = "Inheritance, Encapsulation, Polymorphism,...";
                correctAnswer = 4;
                answer1 = "Attribute hiding";
                answer2 = "Method sharing";
                answer3 = "Object creation";
                answer4 = "Abstraction";
                break;

        }
    }
}
