package assignments.studentGrade;

public class Question {
    private String optionA;
    private String optionB;

    public Question(String optionA, String optionB) {
        this.optionA = optionA;
        this.optionB = optionB;
    }

    public String getOptionA() {
        return optionA;
    }

    public String getOptionB() {
        return optionB;
    }
}
