package assignments;

public class StateTheOutput {
    public static void main(String[] args) {
        //int counter = 1;
        //counter = ++ counter +++counter;
        //System.out.println(counter);

        //int counter = 1;
        //counter = counter+++++counter;
        //System.out.println(counter);

        //int counter = 1;
        //counter = counter +++counter++;
        //System.out.println(counter);
        //counter starts at 1 ++ 1 + 1 = 3

        int counter = 1;
        counter = ++counter +counter++;
        System.out.println(counter);
        //counter starts at 2 + 1 + 1 = 4
    }
}
