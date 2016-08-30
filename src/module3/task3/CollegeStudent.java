package module3.task3;

public class CollegeStudent extends Student{
    String collegeName;
    int rating;
    long id;

    public CollegeStudent(String lastName, String firstName, int group) {
        super(lastName, firstName, group);
    }

    public CollegeStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }
    public CollegeStudent(String collegeName, int rating, long id){
        super();
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }
}
