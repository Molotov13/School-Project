// The class Student creates an object of student which contains related information about the student
public class Student {
  // Create variables storing the information about the student
  private int grade, studentNumber;
  private String firstName, lastName;
   

  // Constructor
  public Student(String firstName, String lastName, int grade, int studentNumber) {
    this.grade = grade;
    this.studentNumber = studentNumber;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  // Check if two student objects are equal
  public boolean equals(Student student) {
    if (this.firstName.equals(student.firstName) && this.lastName.equals(student.lastName) && this.grade == student.grade && this.studentNumber == student.studentNumber) {
      return true;
    } 
    else {
      return false;
    }
  }

  // Convert the student information into a string (override)
  public String toString() {
    return "Name: " + this.firstName + " " + this.lastName + " Grade: " + this.grade;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getGrade() {
    return grade;
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }

  public int getStudentNumber() {
    return studentNumber;
  }

  public void setStudentNumber(int studentNumber) {
    this.studentNumber = studentNumber;
  }
}