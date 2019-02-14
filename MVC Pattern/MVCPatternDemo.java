// Demo MVC design pattern usage

public class MVCPatternDemo{
    public static void main(String[] args){
        Student model = retriveStudentRecord();
        StudentView view = new StudentView();
        
        StudentController controller = new StudentController(model, view);
        controller.updateView();

        // Update model data
        controller.setStudentName("James");
        controller.updateView();
    }

    private static Student retriveStudentRecord(){
        Student student = new Student();
        student.setName("Nicole");
        student.setRollNo("5");
        return student;
    }
}



