package module3.task3;

import java.util.Date;

public class Course {
    private Date startDate;
    private String name;
    int hoursDuration;
    String teacherName;

    public Course(String name, Date startDate) {
        this.name = name;
        this.startDate = startDate;
    }

    public Course(int hoursDuration, String name, String teacherName) {
        this.hoursDuration = hoursDuration;
        this.name = name;
        this.teacherName = teacherName;
    }
}
