public class Main {
    public static void main(String args[]) {
        School school1 = new School("Lord Byng Secondary School",
            "3939 W 16th Ave, Vancouver, BC V6R 2C9",
            1201);
        
        // Add 10 students to student list
        school1.addStudent(new Student("Leonardo", "Liang", 11, 2539392));
        school1.addStudent(new Student("Charles", "Zuo", 12, 1894231));
        school1.addStudent(new Student("Timonthy", "Lin", 11, 1324123));
        school1.addStudent(new Student("Alexandra", "McPhee", 8, 2435642));
        school1.addStudent(new Student("Kei", "Segal", 8, 5644345));
        school1.addStudent(new Student("Jack", "Bruce", 12, 2345216));
        school1.addStudent(new Student("Malcolm", "White", 6, 6347423));
        school1.addStudent(new Student("Shijia", "Han", 5, 4969794));
        school1.addStudent(new Student("Iris", "Zhao", 7, 1439591));
        school1.addStudent(new Student("David", "Mo", 5, 1349593));

        // Add 3 teachers to teacher list
        school1.addTeacher(new Teacher("Leonard", "Pelletier", "AP Computer Science A"));
        school1.addTeacher(new Teacher("Johnston", "Andrew", "World History"));
        school1.addTeacher(new Teacher("Eric", "Chen", "Physics"));

        // Display both lists
        System.out.println(school1.allStudents());
        System.out.println(school1.allTeachers());

        // Remove 2 students
        school1.removeStudent(new Student("Timonthy", "Lin", 11, 1324123));
        school1.removeStudent(new Student("Kei", "Segal", 8, 5644345));

        // Remove 1 teacher
        school1.removeTeacher(new Teacher("Eric", "Chen", "Physics"));

        // Display both lists
        System.out.println(school1.allStudents());
        System.out.println(school1.allTeachers());
    }
}