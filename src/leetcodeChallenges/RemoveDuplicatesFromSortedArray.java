package leetcodeChallenges;

public class RemoveDuplicatesFromSortedArray {
    public static void main (String[] args) {
        //Scanner input = new
        int arr[] = {2,3,4,4,5,6,6,6,7,8,8};
        int a = arr.length;
        System.out.print(a);
    }

    public static int removeDuplicates(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < numbers.length; j++) {
            if (numbers[j] != numbers[i]) {
                i++;
                numbers[i] = numbers[j];
            }
        }
        return i + 1;
    }
}