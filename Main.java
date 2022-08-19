public class Main {
    public static void main(String args[]) {
        School mySchool = new School("Lord Byng Secondary School","3939 W 16th Ave, Vancouver, BC V6R 2C9", 1201);
        
        // Add 10 students to student list
        mySchool.addStudent(new Student("Leonardo", "Liang", 11, 2539392));
        mySchool.addStudent(new Student("Charles", "Zuo", 12, 1894231));
        mySchool.addStudent(new Student("Timonthy", "Lin", 11, 1324123));
        mySchool.addStudent(new Student("Alexandra", "McPhee", 8, 2435642));
        mySchool.addStudent(new Student("Kei", "Segal", 8, 5644345));
        mySchool.addStudent(new Student("Jack", "Bruce", 12, 2345216));
        mySchool.addStudent(new Student("Malcolm", "White", 6, 6347423));
        mySchool.addStudent(new Student("Shijia", "Han", 5, 4969794));
        mySchool.addStudent(new Student("Iris", "Zhao", 7, 1439591));
        mySchool.addStudent(new Student("David", "Mo", 5, 1349593));

        // Add 3 teachers to teacher list
        mySchool.addTeacher(new Teacher("Leonard", "Pelletier", "AP Computer Science A"));
        mySchool.addTeacher(new Teacher("Johnston", "Andrew", "World History"));
        mySchool.addTeacher(new Teacher("Eric", "Chen", "Physics"));

        // Display both lists
        System.out.println(mySchool.allStudents());
        System.out.println(mySchool.allTeachers());

        // Remove 2 students
        mySchool.removeStudent(new Student("Timonthy", "Lin", 11, 1324123));
        mySchool.removeStudent(new Student("Kei", "Segal", 8, 5644345));

        // Remove 1 teacher
        mySchool.removeTeacher(new Teacher("Eric", "Chen", "Physics"));

        // Display both lists
        System.out.println(mySchool.allStudents());
        System.out.println(mySchool.allTeachers());
    }
}