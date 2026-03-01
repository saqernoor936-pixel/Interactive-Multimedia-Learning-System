package model;


public class Student {

    public int  id;
    public String name;

    public Student(int studentID, String name) {
        this.id = studentID;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void takeQuiz() {
        System.out.println(name + " started the quiz.");
    }
}
