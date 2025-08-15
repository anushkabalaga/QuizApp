Project Overview:
-----------------
This is a console-based Quiz Application built using Java.  
It allows users to answer multiple-choice questions, calculates their score, and displays the final result.

Task Reference:Mini Project – Online Quiz App (Java Console)
------------------------------------------------------------
Tools & Technologies:
---------------------
Language:Java (JDK 8+)
Editor: IntelliJ IDEA / Eclipse / VS Code
Java Util Classes:Scanner,ArrayList,Collections.

Features:
---------
1.Stores multiple quiz questions with options.
2.Randomizes question order using `Collections.shuffle`.
3.Accepts user answers via console.
4.Displays correct/incorrect feedback instantly.
5.Shows final score after completion.

Project Structure:
------------------
QuizApp
src
QuizApp.java
Question.java
README.md
.gitignore

How to Run:
-----------
1. Clone the repository:
   ---------------------
Compile the Java file
javac QuizApp.java
Run the program
java QuizApp

Sample Output:
--------------

Q1: Which keyword is used to inherit a class in Java?
1. super
2. this
3. extends
4. implements
Your answer (1-4): 3
Correct!

Q2: Which collection does not allow duplicate elements?
1. List
2. Set
3. Map
4. ArrayList
Your answer (1-4): 1
Wrong! Correct answer: Set


Key Concepts Used:
------------------
Loops: for loop to iterate over questions.

Collections: ArrayList to store questions and Collections.shuffle to randomize.

Control Flow: if-else statements to check answers.

Java Classes: Question class for structured data.

User Input: Scanner to accept answers.


