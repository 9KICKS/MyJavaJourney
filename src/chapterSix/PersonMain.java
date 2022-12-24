package chapterSix;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 18, Gender.MALE);
        Person person1 = new Person("Johnny Doe", 18, Gender.MALE);
        Person person2 = new Person("Jane Doe", 19, Gender.FEMALE);
        Person person3 = new Person("janet Doe", 20, Gender.NON_BINARY);

        int numberOfMales = countMales(person, person1, person2, person3);
        System.out.println(numberOfMales);
    }

    private static int countMales(Person...people) {
        int counter = 0;
        for (int i = 0; i < people.length; i++) {
//      for (Person person : people) {
            if (people[i].getGender()==Gender.MALE) counter++;
        }
        return counter;
    }
}
