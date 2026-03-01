
package interactivemultimeadialearningsystem;

import model.Student;
import model.Quiz;
import view.QuizView;
import controller.QuizController;

public class InteractiveMultimeadiaLearningSystem {

    
    public static void main(String[] args) {
            
            
        // Create Student
        Student student = new Student(1, "Noorhan");

        // Create Quiz
        Quiz quiz = new Quiz("What is Java?", "Programming Language");

        // Create View
        QuizView view = new QuizView();

        // Create Controller
        QuizController controller = new QuizController(student, quiz, view);

        // Student Answer
        controller.startQuiz("Programming Language");
    }
}
    
    

