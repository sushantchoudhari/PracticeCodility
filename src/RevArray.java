package src;

public class RevArray {
    public static void main(String[] args) {
        RevArray revArray= new RevArray();
        int[] input={4,5,7,8,9,4,6};
        int[] res= revArray.revArray(input);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }
    }

    private int[] revArray(int[] input) {
        int[] res= null;
        int first=0;
        int last= input.length-1;
        while (first<last){
            int temp=input[last];
            input[last]=input[first];
            input[first]=temp;
            first++;
            last--;
        }
        return input;
    }
}
