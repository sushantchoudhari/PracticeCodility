package src;

public class LargestArr {
    public static void main(String[] args) {
        LargestArr largestArr= new LargestArr();
        int numbers[] ={1,2,6,3,5};
        int res= getLargest(numbers);
        System.out.println("res "+ res);
    }

    private static int getLargest(int[] numbers) {
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>largest){
                largest=numbers[i];
            }

        }
        return largest;
    }
}
