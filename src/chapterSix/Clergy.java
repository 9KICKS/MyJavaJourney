package chapterSix;

public class Clergy {
    private String name;
    private int age;
    private Religion religion;

    public Clergy(String name, int age, Religion religion) {
        this.name = name;
        this.age = age;
        this.religion = religion;
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

    public Religion getReligion() {
        return religion;
    }

    public void setReligion(Religion religion) {
        this.religion = religion;
    }
}

