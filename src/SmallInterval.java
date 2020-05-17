import java.util.Arrays;

public class SmallInterval {

    public static void main(String[] args) {

        System.out.println("Min value of the array [2, 5] is -----------> " + findSmallestInterval(new int[]{2, 5}));

        System.out.println("Min value of the array [1, 6, 4, 8, 2] is -----------> " + findSmallestInterval(new int[]{1, 6, 4, 8, 2}));
    }

    static int findSmallestInterval(int[] numbers) {
        if(numbers == null || numbers.length < 2 || numbers.length > 100000){
            return 0;
        } else {
            Arrays.sort(numbers);
            int diff = Integer.MAX_VALUE;
            for (int i=0; i < numbers.length-1; i++)
                if (numbers[i+1] - numbers[i] < diff)
                    diff = numbers[i+1] - numbers[i];
            return diff;
        }
    }
}
