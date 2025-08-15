package com.quizapp.www;

import java.util.*;

class Question {
    String question;
    String[] options;
    int correctOption; // index starting from 1

    Question(String question, String[] options, int correctOption) {
        this.question = question;
        this.options = options;
        this.correctOption = correctOption;
    }
}

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Create a list of questions
        List<Question> questions = new ArrayList<>();
        questions.add(new Question(
            "Which keyword is used to inherit a class in Java?",
            new String[]{"super", "this", "extends", "implements"},
            3
        ));
        questions.add(new Question(
            "Which collection does not allow duplicate elements?",
            new String[]{"List", "Set", "Map", "ArrayList"},
            2
        ));
        questions.add(new Question(
            "Which loop is best when you know the exact number of iterations?",
            new String[]{"while", "do-while", "for", "enhanced for"},
            3
        ));

        // Step 2: Shuffle the question order
        Collections.shuffle(questions);

        int score = 0;

        // Step 3: Ask each question
        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("\nQ" + (i + 1) + ": " + q.question);
            for (int j = 0; j < q.options.length; j++) {
                System.out.println((j + 1) + ". " + q.options[j]);
            }

            System.out.print("Your answer (1-4): ");
            int answer = sc.nextInt();

            if (answer == q.correctOption) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer: " + q.options[q.correctOption - 1]);
            }
        }

        // Step 4: Show final score
        System.out.println("\nYour Final Score: " + score + "/" + questions.size());

        sc.close();
    }
}
