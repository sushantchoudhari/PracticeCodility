package src;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int nums=5;
        PascalTriangle pascalTriangle= new PascalTriangle();
        // Not completed
        List<List<Integer>> res=pascalTriangle.generate(nums);
        for (int i = 0; i < res.toArray().length; i++) {
            System.out.println(res.get(i));

        }
    }

    private List<List<Integer>> generate(int nums) {
        List<List<Integer>> triangle= new ArrayList<>();
        if(nums==0) return triangle;
        List<Integer> firstRow= new ArrayList<>();
        triangle.add(firstRow);
        for (int i = 1; i < nums; i++) {
            List<Integer> prevRows=triangle.get(i-1);
            List<Integer> row=new ArrayList<>();
            row.add(1);
            for (int j = 0; j < i; j++) {
                row.add(prevRows.get(j-1)+prevRows.get(i));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }
}
