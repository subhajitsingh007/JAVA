package Recursion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintSubSequnceWithK {
    private static void generateSubsequences(int[] nums, int index, List<Integer> current, int currentSum, int target) {
        //base case
        if(index==nums.length){
            if(currentSum==target){
                System.out.println(current);
            }
            return;
        }

        //include the current element
        current.add(nums[index]);
        generateSubsequences(nums,index+1,current,currentSum+nums[index],target);
        //Backtrack: exclude the current element
        current.remove(current.size()-1);
        generateSubsequences(nums,index+1,current,currentSum,target);

    }
    public static void main(String[] args) {
        int [] arr = {1,2,1};
        int k = 2;
        generateSubsequences(arr,0,new ArrayList<>(),0,k);



    }
}
