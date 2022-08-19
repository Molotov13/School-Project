import java.util.ArrayList;
// The class School creates an object of school which contains related information
public class School {
  // Create variables storing the information about the school
  private String name, location;
  private int studentPopulation;
  
  // Create lists containing the objects of teachers, students, and courses
  private ArrayList<Teacher> teachers = new ArrayList<>();
  private ArrayList<Student> students = new ArrayList<>();
  private ArrayList<String> courses = new ArrayList<>();

  // Constructor
  public School(String name, String location, int studentPopulation) {
    this.name = name;
    this.location = location;
    this.studentPopulation = studentPopulation;
  }
  
  // Add an object of student to the list of students
  public void addStudent(Student student) {
    this.students.add(student);
  }
  
  // Add an object of teacher to the list of teachers
  public void addTeacher(Teacher teacher) {
    this.teachers.add(teacher);
  }

  // Remove an object of teacher from the list of teachers
  public void removeTeacher(Teacher teacher) {
    for (int i = 0; i < this.teachers.size(); i++) {
      if (teacher.equals(this.teachers.get(i))) {
        this.teachers.remove(i);
        break;
      }
    }
  }
  
  // Remove an object of student from the list of students
  public void removeStudent(Student student) {
    for (int i = 0; i < this.students.size(); i++) {
      if (student.equals(this.students.get(i))) {
        this.students.remove(i);
        break;
      }
    }
  }

  // Return a string containing all student objects
  public String allStudents() {
      String opt = "";
      for (Student student : students) {
        opt = opt + "\n" + student;
      }
      return opt;
  }
  
  // Return a string containing all teacher objects
  public String allTeachers() {
    String opt = "";
    for (Teacher teacher : teachers) {
      opt = opt + "\n" + teacher;
    } 
    return opt;
  }

  public String getName() {
    return name;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getStudentPopulation() {
    return studentPopulation;
  }

  public void setStudentPopulation(int studentPopulation) {
    this.studentPopulation = studentPopulation;
  }
}