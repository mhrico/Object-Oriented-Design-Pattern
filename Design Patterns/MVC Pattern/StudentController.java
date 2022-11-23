public class StudentController {
    private Student studentModel;
    private StudentView studentView;

    public StudentController(Student studentModel, StudentView studentView) {
        this.studentModel = studentModel;
        this.studentView = studentView;
    }

    public void setStudentName(String name){
        studentModel.setName(name);
    }

    public String getStudentName(){
        return studentModel.getName();
    }

    public void setStudentRoll(String roll){
        studentModel.setRoll(roll);
    }

    public String getStudentRoll(){
        return studentModel.getRoll();
    }

    public void updateView(){
        studentView.showStudentInfo(getStudentName(), getStudentRoll());
    }
}
