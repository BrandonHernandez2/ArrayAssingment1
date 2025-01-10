import java.util.Arrays;

public class Main {

    private Main(){}

    public static void main(String[] args){

        int[] numbers = {10, 4, 9, 2, 94, 92, 53, 100, 42, 5, 8, 56, 42, 68, 90, 97, 124};

        Arrays.sort(numbers);
        System.out.println("This is the array: " + Arrays.toString(numbers));

        int min = Integer.MAX_VALUE;

        for (int number : numbers ){
            min = Math.min(min, number);
        }

        System.out.println(min + " is the minimum value in the array.");

        // TODO: guess what yiu should do gor max

        int most = Integer.MIN_VALUE;

        for (int number : numbers){
            most = Math.max(most, number);
        }

        System.out.println(most  + " is the maximum value in the array.");

        int sum = 0;
        for (int number : numbers){
            sum += number;
        }

        System.out.println(sum + " is the sum of all the numbers in the array.");

        double average = (double) sum / numbers.length;

        System.out.println(average + " is the average of the numbers in the array.");

        int[] evens = new int[numbers.length - 4];

        for (int i = 0, k = 0; i < numbers.length; i ++){
            if (numbers[i] % 2 == 0){
                evens[k] = numbers [i];
                k++;
            }
        }

        System.out.println("The even numbers is the array are: " + Arrays.toString(evens));

    }
}