package src;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        // Applies on sorted Arrays only
        int[] numbers={2,4,6,8,10,12,14};
        int key=10;
       int search= binarySearch.binarySearch(numbers,key);
        System.out.println(" res "+search);
    }

    private int binarySearch(int[] numbers, int key) {
        int start=0;
        int end= numbers.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            if (numbers[mid]==key){
                return  mid;
            }
            if (numbers[mid]<key){
                start= mid+1;
            }else {
                end= mid-1;
            }
        }
        return -1;
    }
}
