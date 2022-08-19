// The class Teacher creates an object of teacher which contains related information about the teacher
public class Teacher {
   // Create variables storing the information about the teacher
    private String firstName, lastName, subject;

  // Constructor
  public Teacher(String firstName, String lastName, String subject) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.subject = subject;
  }

  // This function is designed to convert the teacher information into a string
  public String toString() {
    return "Name: " + this.firstName + " " + this.lastName + " Subject: " + this.subject;
  }

  // This function is designed to check if two teacher objects are equal
  public boolean equals(Teacher teacher) {
    if (this.firstName.equals(teacher.firstName) && this.lastName.equals(teacher.lastName) && this.subject.equals(teacher.subject)) {
      return true;
    } 
    else {
      return false;
    }
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

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }
}
