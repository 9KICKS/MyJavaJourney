package chapterSeventeen;

import java.util.ArrayList;
import java.util.Comparator;

public class StudentMain {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Yinka", 25));
        students.add(new Student("Victor", 27));
        students.add(new Student("Sgreen", 28));
        students.add(new Student("James", 25));
        students.add(new Student("Zainab", 26));

        Comparator<Student> byAgeThenByName = Comparator.comparing(Student::getAge)
                .thenComparing(Student::getName);
        students.sort(byAgeThenByName);
        for (Student i : students) {
            System.out.println("Student name: " + i.getName() + ", Student age: " + i.getAge());
        }
    }
}
