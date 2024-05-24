package src;

import java.util.ArrayList;
import java.util.List;

public class Duplicate {

    public static void main(String[] args) {
        Duplicate duplicate= new Duplicate();
        int[] nums= {4,3,2,7,8,2,3,1};
        duplicate.findDuplicate(nums);

    }

    private List<Integer> findDuplicate(int[] nums) {
        List<Integer> res= new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            //  System.out.println(" index : "+index);
            if (nums[index] < 0) res.add(index + 1);
            nums[index] = -nums[index];
        }
            printArr(res);

        return res;
    }
    public void printArr(List<Integer> res){
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }

    }
}
