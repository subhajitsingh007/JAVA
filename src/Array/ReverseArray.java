package Array;

public class ReverseArray {
    void printArray(int arr[], int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
            System.out.print("  ");
        }
    }

    void reverseArray(int arr[] , int n){
        int [] ans = new int[n];



        for(int i=n-1;i>=0;i--){
            ans[n-i-1] = arr[i];

        }
        printArray(ans,n);
    }


    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        //a function  cannot be directly used without making it static or using an object to call the function
        //created an object of class ReverseArray to use the function printArray

        ReverseArray obj = new ReverseArray();

        System.out.println("Array before reversing:");
        obj.printArray(arr,5);

        System.out.println("\n");
        System.out.println("Array after reversing:");
        obj.reverseArray(arr,5);

    }
}
