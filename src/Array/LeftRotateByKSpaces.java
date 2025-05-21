package Array;

public class LeftRotateByKSpaces {
    public static void leftRotate(int[] arr, int k) {
        //brute force

        int n = arr.length;
        //reducing the size of k
        k=k%n;
        int [] temp = new int[k];

        for(int i=0;i<k;i++){
            //storing the elements till k in a temp array
            temp[i]=arr[i];
        }

        //shifting the elements
        for(int i = k; i<n;i++){
            arr[i-k] = arr[i];
        }

        //pushing the elements from temp to original array

        for(int i=n-k;i<n;i++){
            arr[i]=temp[i-(n-k)];
        }

    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        leftRotate(arr,3);

        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
