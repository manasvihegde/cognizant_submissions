// Model
class Student {
    private String name;
    private int id;
    private String grade;

    public Student(String name, int id, String grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

// View
class StudentView {
    public void displayStudentDetails(Student s) {
        System.out.println(
                s.getName() + " " +
                s.getId() + " " +
                s.getGrade());
    }
}

// Controller
class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.displayStudentDetails(model);
    }

    public void setGrade(String grade) {
        model.setGrade(grade);
    }
}

// Main Class
public class MVCTest {
    public static void main(String[] args) {
        Student student = new Student("Manasvi", 101, "A");

        StudentView view = new StudentView();

        StudentController controller =
                new StudentController(student, view);

        controller.updateView();

        controller.setGrade("A+");

        controller.updateView();
    }
}