package module3.task3;

public class Student {
    String firstName;
    String lastName;
    int group;
    Course [] coursesTaken;
    int age;

    public Student(String lastName, String firstName, int group) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.group = group;
    }

    public Student(String lastName, Course[] coursesTaken) {
        this.lastName = lastName;
        this.coursesTaken = coursesTaken;
    }

    public Student() {

    }
}
