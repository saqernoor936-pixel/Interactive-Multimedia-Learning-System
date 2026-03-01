
package view;


public class QuizView {
    
    public void showQuestion(String question) {
        System.out.println("Question: " + question);
    }

    public void showResult(String studentName, double grade) {
        System.out.println("Student: " + studentName);
        System.out.println("Final Grade: " + grade);
    }
}

