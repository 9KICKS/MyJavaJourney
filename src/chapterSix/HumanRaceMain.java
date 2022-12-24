package chapterSix;

public class HumanRaceMain {
    public static void main(String[] args) {
        HumanRace human = new HumanRace("Femi", 29, Race.BLACK);
        HumanRace human2 = new HumanRace("Chibuzor", 38, Race.BLACK);
        HumanRace human3 = new HumanRace("Precious", 22, Race.ASIAN);
        HumanRace human4 = new HumanRace("Jonathan", 24, Race.WHITE);
        HumanRace human5 = new HumanRace("Grace", 25, Race.BLACK);
        HumanRace human6 = new HumanRace("Kim", 24, Race.LATINOS);

        int numberOfBlacks = countBlacks(human, human2, human3, human4, human5, human6);
        System.out.println(numberOfBlacks);
    }

    private static int countBlacks(HumanRace...humans) {
        int counter = 0;
        for (int i = 0; i < humans.length; i++) {
//      for (HumanRace human : humans) {
            if (humans[i].getHumanRace()==Race.BLACK) counter++;
        }
        return counter;
    }
}
