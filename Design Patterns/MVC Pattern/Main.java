public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        StudentView studentView = new StudentView();
        StudentController studentController = new StudentController(student1, studentView);
        studentController.setStudentRoll("49");
        studentController.setStudentName("Rico");
        studentController.updateView();
        studentController.setStudentName("Mehedi");
        studentController.updateView();
    }
}
