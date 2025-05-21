package Array;

import java.util.HashMap;

public class CheckDuplicateKeyArray {
    static boolean checkDuplicate (int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
           //check if the key already exists
            if(map.containsKey(arr[i])){
                return true;
            }
            else{
                map.put(arr[i],1);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr ={1,5,66,45,10,23,5};
        System.out.println(checkDuplicate(arr));
    }
}
