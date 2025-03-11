package Array;
//this is a program to find the second largest element in an array

public class SecondLargestElement {
    int secondLargestElement(int [] arr , int size) {
        //handling edge case
        //if there is only 0 or 1 element in the array there won't be any second largest element in the array
        if (size == 0 || size == 1) {
            return -1;

        }
        int large = Integer.MIN_VALUE;
        int secondlarge = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                secondlarge = large;
                large = arr[i];

            } else if (arr[i] < large && arr[i] > secondlarge) {
                secondlarge = arr[i];
            }
        }
        return secondlarge;


    }
    int secondSmallestElement(int [] arr , int size) {
        //handling edge case
        //if there is only 0 or 1 element in the array there won't be any second smallest element in the array
        if (size == 0 || size == 1) {
            return -1;

        }
        int small = Integer.MAX_VALUE;
        int secondsmall = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                secondsmall = small;
                small = arr[i];

            } else if (arr[i] > small && arr[i] < secondsmall) {
                secondsmall = arr[i];
            }
        }
        return secondsmall;


    }

    public static void main(String[] args) {
        int [] arr = {68,97,102,42,35,5};

        SecondLargestElement ob = new SecondLargestElement();
        System.out.println("The second largest element in the array is "+ob.secondLargestElement(arr,6));
        System.out.println("The second smallest element in the array is "+ob.secondSmallestElement(arr,6));


    }
}
