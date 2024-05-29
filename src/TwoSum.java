package src;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum= new TwoSum();
        int[] numbers={2,7,11,15};
        int target=9;
        // not Completed
        int[] result=twoSum.twoSum(numbers,target);
    }

    private int[] twoSum(int[] numbers, int target) {
        int[] res=null;
        int a_pointer= 0;
        int b_pointer= numbers.length-1;
        while (a_pointer<=b_pointer){
            int sum=numbers[a_pointer]+ numbers[b_pointer];
            if (sum>target){

            } else if (sum<target) {

            }else {
                return  new int[] {a_pointer+1,b_pointer+1};
            }
        }


        return res;
    }
}
