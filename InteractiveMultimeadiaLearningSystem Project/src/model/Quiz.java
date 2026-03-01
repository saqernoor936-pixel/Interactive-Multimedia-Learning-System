
package model;


public class Quiz {
    public String question;
    public String correctAnswer;
    public double grade;

    public Quiz(String question, String correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.grade = 0;
    }

    public String getQuestion() {
        return question;
    }

    public void checkAnswer(String studentAnswer) {

        if (studentAnswer.equalsIgnoreCase(correctAnswer)) {
            grade = 100;
        } else {
            grade = 0;
        }
    }

    public double getGrade() {
        return grade;
    }
}
    
