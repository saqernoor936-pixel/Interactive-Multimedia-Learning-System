package controller;


import model.Student;
import model.Quiz;
import view.QuizView;
 
public class QuizController {
     public Student student;
    public Quiz quiz;
    public QuizView view;

    public QuizController(Student student, Quiz quiz, QuizView view) {
        this.student = student;
        this.quiz = quiz;
        this.view = view;
    }

    public void startQuiz(String answer) {

        student.takeQuiz();

        view.showQuestion(quiz.getQuestion());

        quiz.checkAnswer(answer);

        view.showResult(student.getName(), quiz.getGrade());
    }
}

