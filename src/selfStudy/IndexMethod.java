package selfStudy;

public class IndexMethod {
    public static void main(String[] args) {
        int x = 3;
        int y = 12;
        int z = 1;

        System.out.println("Result = " + getIndex(x, y, z));
    }

    public static int getIndex(int x, int y, int z) {
        int sum = 0;
        int i = 0;

        while (sum < y) {
            i++;
            sum += x;
        }
        if (sum == y && i > 0 && (i * x) - (x - z) <= y) {
            return i;
        } else {
            return - 1;
        }
    }
}
