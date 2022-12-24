package chapterSix;

public class HumanRace {
    private String name;
    private int age;
    private Race humanRace;

    public HumanRace(String name, int age, Race humanRace) {
        this.name = name;
        this.age = age;
        this.humanRace = humanRace;
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

    public Race getHumanRace() {
        return humanRace;
    }

    public void setHumanRace(Race humanRace) {
        this.humanRace = humanRace;
    }
}
