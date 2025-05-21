package Array;

public class LongestIncreasingSequence {
    public static int increasingSequence(int[] arr){
        int n = arr.length;
        if(n == 0) return 0;
        int count = 1; //at least one element in a sequence
        int maxCount = 1;


        for(int i = 1; i<n; i++){
            if(arr[i]>arr[i-1]){
                count++;

            } else{
                count=1;
            }
            maxCount = Math.max(maxCount,count);

        }
        return maxCount;
    }
    public static void main(String[] args) {
        int [] arr ={11,13,9,15,17,8,12,14,16};
        System.out.println("Total number of elements in the longest increasing sequence is: "+increasingSequence(arr));
    }
}
