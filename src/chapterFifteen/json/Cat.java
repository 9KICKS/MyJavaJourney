package chapterFifteen.json;

import java.time.LocalDateTime;

public class Cat {
    private String name;
    private int age;
    private LocalDateTime dateOfBirth;

    public Cat() {
    }

    public Cat(String name, LocalDateTime dateOfBirth, int age) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}