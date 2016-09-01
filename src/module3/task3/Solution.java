package module3.task3;

import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        Course java = new Course(new Date(), "JavaCore");
        Course javaCore = new Course(90, "Anotonina", "Andrii");
        Course musicCourse = new Course(new Date(), "Cello course");
        Course celloCourse = new Course(40, "Tonya", "Galina");
        Course englishCourse = new Course(new Date(), "English course");


        Course[] courseTaken = {java, javaCore, musicCourse, celloCourse, englishCourse};

        Student student = new Student("Tonya", "sidorenko", 4);
        Student student1 = new Student("Sidorenko", courseTaken);

        Student student3 = new SpecialStudent(534);
        Student student7 = new SpecialStudent("Sidorenko", courseTaken);
        Student student8 = new SpecialStudent("KNEU", 12, 793);

        Student student4 = new CollegeStudent("Sidorenko", courseTaken);
        Student student5 = new CollegeStudent("Tonya", "Sidorenko", 4);
        Student student6 = new CollegeStudent("KISiT", 10, 534);

    }

}
