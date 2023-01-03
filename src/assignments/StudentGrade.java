package assignments;

import java.util.Scanner;

public class StudentGrade {
    static int[] passTotal;
    static int[] failTotal;
    static int[][] array;
    static int[][] students;
    static int[][] total;
    static double[][] average;
    static int[][] position;
    static int[][] tempPosition;

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of students:");
        int numberOfStudents = input.nextInt();
        System.out.println("Enter the number of subjects:");
        int numberOfSubjects = input.nextInt();
        System.out.print("Saving ");
        saving();
        System.out.println("Saved successfully.");
        System.out.println();
        enterGrade(numberOfStudents, numberOfSubjects);
        System.out.println();
        setTempPosition(numberOfStudents);
        System.out.println();
        System.out.print("Compiling term's results ");
        saving();
        System.out.println("Results complete.");
        printTable(numberOfStudents, numberOfSubjects);
        System.out.println();
        subjectSummary(numberOfStudents, numberOfSubjects);
    }

    public static void subjectSummary(int numberOfStudents, int numberOfSubjects) {
        System.out.println();
        System.out.println("SUBJECT SUMMARY");
        for (int i = 0; i < numberOfSubjects; i++) {
            subjectSummary(array, numberOfStudents, i);
        }
        System.out.println(hardestSubject());
        System.out.println(easiestSubject());
        System.out.println(overHighestScore(numberOfSubjects, numberOfStudents));
        System.out.println(overLowestScore(numberOfSubjects, numberOfStudents));
        equals();
        classSummary(total, numberOfStudents);
    }

    public static void enterGrade(int numberOfStudents, int numberOfSubjects) {
        array = new int[numberOfStudents][numberOfSubjects];
        passTotal = new int[numberOfSubjects];
        failTotal = new int[numberOfSubjects];
        students = new int[numberOfStudents][1];
        total = new int[numberOfStudents][1];
        average = new double[numberOfStudents][1];
        position = new int[numberOfStudents][1];
        tempPosition = new int[numberOfStudents][2];
        for (int i = 0; i < numberOfStudents; i++) {
            for (int a = 0; a < numberOfSubjects; a++) {
                System.out.println("Entering score for student " +(i + 1)+ ":");
                System.out.println("Enter score for subject " +(a+ 1)+ ":");
                int grade = input.nextInt();
                System.out.print("Saving ");
                saving();
                System.out.println("Saved successfully.");
                System.out.println();
                array[i][a] = grade;
                students[i][0] = i + 1;
            }
        }
        int sum;
        for (int i = 0; i < numberOfStudents; i++) {
            sum = 0;
            for (int a = 0; a < numberOfSubjects; a++) {
                sum = sum + array[i][a];
            }
            total[i][0] = sum;
            average[i][0] = ((sum + 0.0) / numberOfSubjects);
        }
    }

    public static void equals() {
        String equals = "=";
        System.out.print(equals.repeat(80));
    }

    public static void exclamation() {
        String exclamation = "!";
        System.out.print(exclamation.repeat(80));
    }

    public static void subjectSummary(int[][] array, int numberOfStudents, int subjectPosition) {
        int columnSum = 0;
        double columnAverage = 0;
        int passes = 0;
        int fails = 0;
        int highestScore = array[0][subjectPosition];
        int lowestScore = array[0][subjectPosition];
        int highestScorer = 0;
        int lowestScorer = 0;
        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = subjectPosition; j <= subjectPosition; j++) {
                columnSum = columnSum + array[i][subjectPosition];
                if (array[i][j] >= 50) {
                    passes += 1;
                } else if (array[i][j] < 50) {
                    fails += 1;
                }
                if (array[i][j] >= highestScore) {
                    highestScore = array[i][j];
                    highestScorer = students[i][0];
                }
                if (array[i][j] <= lowestScore) {
                    lowestScore = array[i][j];
                    lowestScorer = students[i][0];
                }
            }
            passTotal[subjectPosition] = passes;
            failTotal[subjectPosition] = fails;
            columnAverage = (double) columnSum / numberOfStudents;
        }
        System.out.println("Subject " + (subjectPosition + 1));
        System.out.println("Highest scoring student is: Student " + highestScorer + " scoring " + highestScore);
        System.out.println("Lowest scoring student is: Student " + lowestScorer + " scoring " + lowestScore);
        System.out.println("Total Score is: " + columnSum);
        System.out.println("Average Score is: " + columnAverage);
        System.out.println("Number of passes: " + passes);
        System.out.println("Number of Fails: " + fails);
        System.out.println();
    }

    public static String hardestSubject() {
        int lowest = failTotal[0];
        int hardestSubject = 0;
        for (int i = 0; i < failTotal.length; i++) {
            if (failTotal[i] >= lowest) {
                lowest = failTotal[i];
                hardestSubject = i + 1;
            }
        }
        return "The hardest subject is " + " Subject " + hardestSubject + " with " + lowest + " failures";
    }

    public static String easiestSubject() {
        int highest = passTotal[0];
        int easiestSubject = 0;
        for (int i = 0; i < passTotal.length; i++) {
            if (passTotal[i] >= highest) {
                highest = passTotal[i];
                easiestSubject = i + 1;
            }
        }
        return "The easiest subject is " + " Subject " + easiestSubject + " with " + highest + " passes";
    }

    public static String overHighestScore(int subjectsNumber, int studentNumber) {
        int highestScore = array[0][0];
        int student = 0;
        int subject = 0;
        for (int i = 0; i < studentNumber; i++) {
            for (int j = 0; j < subjectsNumber; j++) {
                if (array[i][j] >= highestScore) {
                    highestScore = array[i][j];
                    student = i + 1;
                    subject = j + 1;
                }
            }
        }
        return "The overall Highest score is scored by Student " + student + " in Subject " + subject + " scoring " + highestScore;
    }

    public static String overLowestScore(int subjectsNumber, int studentNumber) {
        int lowestScore = array[0][0];
        int student = 0;
        int subject = 0;
        for (int i = 0; i < studentNumber; i++) {
            for (int j = 0; j < subjectsNumber; j++) {
                if (array[i][j] <= lowestScore) {
                    lowestScore = array[i][j];
                    student = i + 1;
                    subject = j + 1;
                }
            }
        }
        return "The overall Lowest score is scored by Student " + student + " in Subject " + subject + " scoring " + lowestScore;
    }

    public static void classSummary(int[][] total, int studentsNumber) {
        int bestScore = total[0][0];
        int bestScorer = 0;
        int worstScore = total[0][0];
        int worstScorer = 0;
        int totalScore = 0;
        double averageScore = 0;
        for (int i = 0; i < studentsNumber; i++) {
            for (int j = 0; j <= 0; j++) {
                totalScore = totalScore + total[i][j];
                averageScore = (double) totalScore / studentsNumber;
                if (total[i][j] >= bestScore) {
                    bestScore = total[i][j];
                    bestScorer = i + 1;
                }
                if (total[i][j] <= worstScore) {
                    worstScore = total[i][j];
                    worstScorer = i + 1;
                }
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("CLASS SUMMARY");
        equals();
        System.out.println();
        System.out.println("Best Graduating Student is: Student " + bestScorer + " scoring " + bestScore);
        equals();
        System.out.println();
        exclamation();
        System.out.println();
        System.out.println(" Worst Graduating Student is: Student " + worstScorer + " scoring " + worstScore);
        exclamation();
        System.out.println();
        equals();
        System.out.println();
        System.out.println("Class total score is: " + totalScore);
        System.out.println("Class Average score is: " + averageScore);
        equals();
    }

    public static void printTable(int numberOfStudents, int numberOfSubjects) {
        equals();
        System.out.println();
        System.out.print("STUDENT   ");
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.printf("%6s%d", "SUB", (i + 1));
        }
        System.out.printf("%7s", "TOT");
        System.out.printf("%9s", "AVG");
        System.out.printf("%8s", "POS");
        System.out.println();
        equals();
        System.out.println();

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("student " + students[i][0]);
            for (int a = 0; a < numberOfSubjects; a++) {
                System.out.printf("%7d", array[i][a]);
            }
            for (int a = 0; a < 1; a++) {
                System.out.printf("%8d", total[i][a]);
            }
            for (int a = 0; a < 1; a++) {
                System.out.printf("%10.2f", average[i][a]);
            }
            for (int a = 0; a < 1; a++) {
                System.out.printf("%6d", position[i][a]);
            }
            System.out.println();
        }
        equals();
        System.out.println();
        equals();
    }

    public static void setTempPosition(int studentsNumber) {
        for (int i = 0; i < studentsNumber; i++) {
            for (int j = 0; j <= 0; j++) {
                tempPosition[i][j] = total[i][j];
            }
            tempPosition[i][1] = i + 1;
        }
        boolean status = true;
        int temp;
        while (status) {
            status = false;
            for (int i = 0; i < studentsNumber - 1; i++) {
                for (int j = 0; j < 1; j++) {
                    if (tempPosition[i + 1][j] > tempPosition[i][j]) {
                        temp = tempPosition[i + 1][j];
                        tempPosition[i + 1][j] = tempPosition[i][j];
                        tempPosition[i][j] = temp;
                        status = true;
                    }
                }
            }
        }
        for (int i = 0; i < studentsNumber; i++) {
            for (int j = 0; j < studentsNumber; j++) {
                if (total[i][0] == tempPosition[j][0]) {
                    position[i][0] = tempPosition[j][1];
                }
            }
        }
    }

    public static void saving() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.print(">");
                Thread.sleep(500);
            }
            System.out.println();
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
