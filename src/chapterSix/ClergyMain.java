package chapterSix;

public class ClergyMain {
    public static void main(String[] args) {
        Clergy man = new Clergy("Sunny", 31, Religion.CHRISTIANITY);
        Clergy woman = new Clergy("Zainab", 24, Religion.ISLAM);
        Clergy man2 = new Clergy("Idris", 27, Religion.ISLAM);
        Clergy man3 = new Clergy("Sam", 51, Religion.ATHEISM);
        Clergy woman2 = new Clergy("Ugo", 43, Religion.CHRISTIANITY);

        int numberOfChristians = countChristians(man, man2, man3, woman, woman2);
        System.out.println(numberOfChristians);
    }

    private static int countChristians(Clergy...followers) {
        int counter = 0;
        for (int i = 0; i < followers.length; i++) {
//      for (Clergy follower : followers) {
            if (followers[i].getReligion()==Religion.CHRISTIANITY) counter++;
        }
        return counter;
    }
}
