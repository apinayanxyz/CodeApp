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
        if (questionType == 1){
            revisionQuestionCreation(randNum);
        }
        else if (questionType == 2){
            lineCodeQuestionCreation(randNum);
        }
        else{
            missingCodeQuestion(randNum);
        }
    }

    private void missingCodeQuestion(int randNum) {
        switch(randNum) {
            case 1:
                questionHead = "What is missing from this code";
                questionBody = "System.out.println(\"Hello world)";
                correctAnswer = 4;
                answer1 = "The last bracket";
                answer2 = "The first speech mark";
                answer3 = "The first bracket";
                answer4 = "The last speech mark";
                break;
            case 2:
                questionHead = "What is missing from this code";
                questionBody = "System.out.println(\"Hello world\"";
                correctAnswer = 1;
                answer1 = "The last bracket";
                answer2 = "The first speech mark";
                answer3 = "The first bracket";
                answer4 = "The last speech mark";
                break;
            case 3:
                questionHead = "What is missing from this code";
                questionBody = "System..println(\"Hello world\")";
                correctAnswer = 1;
                answer1 = "The missing out";
                answer2 = "The first speech mark";
                answer3 = "The first bracket";
                answer4 = "The last speech mark";
                break;
            case 4:
                questionHead = "What is missing from this code";
                questionBody = "System.out.println(Hello world\")";
                correctAnswer = 2;
                answer1 = "The last bracket";
                answer2 = "The first speech mark";
                answer3 = "The first bracket";
                answer4 = "The last speech mark";
                break;
            case 5:
                questionHead = "What is wrong with this line";
                questionBody = "String a = \" a \" \n" +
                        "String b = \" b \" \n" +
                        "int c = b + a" ;
                correctAnswer = 3;
                answer1 = "You cannot add two ints and store it in a string";
                answer2 = "The values of a and b are too literal";
                answer3 = "You cannot add two strings and store it in an integer";
                answer4 = "The value of a and b do not match";
                break;
            case 6:
                questionHead = "What is wrong with this line";
                questionBody = "String a = \" a \" \n" +
                        "String b = \" b \" \n" +
                        "String c = b - a" ;
                correctAnswer = 2;
                answer1 = "You cannot add two ints and store it in a string";
                answer2 = "You cannot use the minus operand on Strings";
                answer3 = "You cannot add two strings and store it in an integer";
                answer4 = "The value of a and b do not match";
                break;
            case 7:
                questionHead = "Why is the value of x not a decimal";
                questionBody = "double y = 10.1 \n" +
                               "int z = 10 \n" +
                        "int x = y/z";
                correctAnswer = 4;
                answer1 = "The value of z is not in double";
                answer2 = "The value of y is not in integer";
                answer3 = "The answer is correct";
                answer4 = "The value of x is not in double";
                break;
            case 8:
                questionHead = "Why could the value of x be seen as wrong";
                questionBody = "double y = 10.1 \n" +
                        "int z = 10 \n" +
                        "String x = y + z";
                correctAnswer = 3;
                answer1 = "The value of z is not in double";
                answer2 = "The value of y is not in integer";
                answer3 = "The value of x is being stored a string";
                answer4 = "The value of x is not in double";
                break;
            case 9:
                questionHead = "What is missing from this code";
                questionBody = "for(i=0;i<10;i++){ " +
                        "\n";
                correctAnswer = 2;
                answer1 = "The semicolons should be swapped with colons";
                answer2 = "The close bracket is missing";
                answer3 = "The wrong loop is being used";
                answer4 = "Its is being looped infinitely";
                break;
            case 10:
                questionHead = "What is missing from this code";
                questionBody = "for(i=0:i<10:i++){ " +
                        "\n}";
                correctAnswer = 1;
                answer1 = "The colons should be swapped with semicolons";
                answer2 = "The close bracket is missing";
                answer3 = "The wrong loop is being used";
                answer4 = "Its is being looped infinitely";
                break;
            case 11:
                questionHead = "What is wrong with this code";
                questionBody = "for(i=0;i<10;i--){ " +
                        "\n}";
                correctAnswer = 4;
                answer1 = "The colons should be swapped with semicolons";
                answer2 = "The close bracket is missing";
                answer3 = "The wrong loop is being used";
                answer4 = "Its is being looped infinitely";
                break;
            case 12:
                questionHead = "What is wrong with this code";
                questionBody = "do{ " +
                        "\n}while(true)";
                correctAnswer = 4;
                answer1 = "The colons should be swapped with semicolons";
                answer2 = "The close bracket is missing";
                answer3 = "The wrong loop is being used";
                answer4 = "Its is being looped infinitely";
                break;
            case 13:
                questionHead = "What is wrong with this code";
                questionBody = "System.out.println(x) " +
                        "\nString x = \" Hello\"";
                correctAnswer = 3;
                answer1 = "The variable x is in the wrong data type";
                answer2 = "x is not capital";
                answer3 = "x is declared after being used in the print";
                answer4 = "String shouldn't be capital";
                break;
            case 14:
                questionHead = "What is wrong with this code";
                questionBody = "else { " +
                        "\n}";
                correctAnswer = 2;
                answer1 = "There should be a condition next to the else";
                answer2 = "There is no if statement at the start";
                answer3 = "There is no else if at the start";
                answer4 = "There is a missing if near the else";
                break;
            default:
                questionHead = "What is wrong with this code";
                questionBody = "if (x<0){" +
                        "\n}" +
                        "\nelse (x>0) { " +
                        "\n}";
                correctAnswer = 4;
                answer1 = "There should be a condition next to the else";
                answer2 = "There is no if statement at the start";
                answer3 = "There is no else if at the start";
                answer4 = "There is a missing if near the else";
                break;
        }
    }

    private void lineCodeQuestionCreation(int randNum) {
        switch(randNum) {
            case 1:
                questionHead = "What does this line of code do";
                questionBody = "System.out.println(\"Hello world\")";
                correctAnswer = 2;
                answer1 = "Print hello world in the console";
                answer2 = "Print Hello World in the console";
                answer3 = "Save Hello world onto a variable";
                answer4 = "Print Hello World in the app";
                break;
            case 2:
                questionHead = "What does this line of code do";
                questionBody = "int x = 9;";
                correctAnswer = 1;
                answer1 = "Creates a variable called x that stores 9";
                answer2 = "Tells the variable to only accept values of 9";
                answer3 = "Stores the value 9 into an existing variable x";
                answer4 = "Checks if the value stored is 9";
                break;
            case 3:
                questionHead = "What does this line of code do";
                questionBody = "int y = x * x * x";
                correctAnswer = 3;
                answer1 = "Square the value of x";
                answer2 = "Find the sum of 3 of x";
                answer3 = "Cube the value of x";
                answer4 = "Find the cube root of x";
                break;
            case 4:
                questionHead = "What does this line of code do";
                questionBody = "int y = square(x)";
                correctAnswer = 1;
                answer1 = "Stores the value generated by the function into y";
                answer2 = "Squares the value of y";
                answer3 = "Finds the value of x and stores it in y";
                answer4 = "Cubes the value of y";
                break;
            case 5:
                questionHead = "What does this line of code do";
                questionBody = "createText();";
                correctAnswer = 1;
                answer1 = "Calls a function";
                answer2 = "Create a function";
                answer3 = "Deletes the function";
                answer4 = "Stores the function in a variable";
                break;
            case 6:
                questionHead = "What is this type of loop";
                questionBody = "for(i=0;i<10li++){\n" +
                        "\n}";
                correctAnswer = 3;
                answer1 = "While Loop";
                answer2 = "If Loop";
                answer3 = "For loop";
                answer4 = "Class Loop";
                break;
            case 7:
                questionHead = "What is this type of loop";
                questionBody = "do{\n" +
                        "\n}while(x=true)";
                correctAnswer = 4;
                answer1 = "For Loop";
                answer2 = "If statement";
                answer3 = "Method";
                answer4 = "While Loop";
                break;
            case 8:
                questionHead = "What is this type of statement";
                questionBody = "if(true){\n \n}";
                correctAnswer = 4;
                answer1 = "While loop";
                answer2 = "For Statement";
                answer3 = "While Statement";
                answer4 = "If statement";
                break;
            case 9:
                questionHead = "What does this line of code do";
                questionBody = "String x = \"Hello World\" " +
                        "\n System.out.println()";
                correctAnswer = 2;
                answer1 = "Print hello world in the console";
                answer2 = "Print Hello World in the console";
                answer3 = "Save Hello world onto a variable";
                answer4 = "Print Hello World in the app";
                break;
            case 10:
                questionHead = "What does this line of code do";
                questionBody = "String array[] = new String[9]";
                correctAnswer = 1;
                answer1 = "Make a an array of strings that has contains 9 values";
                answer2 = "Finds an array of strings that contains 9 values";
                answer3 = "Make a an array of integers that has contains 9 values";
                answer4 = "Make a an array of strings that has contains 19 values";
                break;
            case 11:
                questionHead = "What does this line of code do";
                questionBody = "int array[] = new int[9]";
                correctAnswer = 1;
                answer1 = "Make a an array of integers that has contains 9 values";
                answer2 = "Finds an array of Booleans that contains 9 values";
                answer3 = "Make a an array of strings that has contains 9 values";
                answer4 = "Make a an array of strings that has contains 19 values";
                break;
            case 12:
                questionHead = "What coding language does this belong to";
                questionBody = " System.out.println(\"Hello World\")";
                correctAnswer = 1;
                answer1 = "Java";
                answer2 = "python";
                answer3 = "C#";
                answer4 = "HTML";
                break;
            case 13:
                questionHead = "What coding language does this belong to";
                questionBody = "Console.WriteLine(\"Hello World\")";
                correctAnswer = 3;
                answer1 = "Java";
                answer2 = "python";
                answer3 = "C#";
                answer4 = "HTML";
                break;
            case 14:
                questionHead = "What coding language does this belong to";
                questionBody = "print(\"Hello\")";
                correctAnswer = 2;
                answer1 = "Java";
                answer2 = "python";
                answer3 = "C#";
                answer4 = "HTML";
                break;
            default:
                questionHead = "What coding language does this belong to";
                questionBody = "<head> \n" +
                        "</head>";
                correctAnswer = 4;
                answer1 = "Python";
                answer2 = "Java";
                answer3 = "C#";
                answer4 = "HTML";
                break;
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
