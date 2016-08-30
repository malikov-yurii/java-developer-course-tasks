package module03.task03;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Course[] courses = {new Course(new Date(156546541), "Math"),new Course(20, "Physics", "Robert Black"),
                new Course(45, "Literature", "William Shecrth"),new Course(43, "Jurisprudence", "Steaven Fry"),new Course(23, "History", "Arnold Merphy")};
        Student student1 = new Student("Iggy", "Pop", 3);
        Student student2 = new Student("Swanshtiger", courses);
        CollegeStudent collegeStudent1 = new CollegeStudent("Luke", "Thompson", 5);
        CollegeStudent collegeStudent2 = new CollegeStudent("Yankovich", courses);
        CollegeStudent collegeStudent3 = new CollegeStudent("Amigo", "Brown", 2, courses, 18, "MIT", 23, 432);
        SpecialStudent specialStudent1 = new SpecialStudent("Gregory", "Marrow", 4);
        SpecialStudent specialStudent2 = new SpecialStudent("Martinez", courses);
        SpecialStudent specialStudent3 = new SpecialStudent("Barbara", "Wight", 3, courses, 33, "MIT", 55, 332, 12);
    }
}
