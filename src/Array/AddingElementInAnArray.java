package Array;

public class AddingElementInAnArray {
    static void insertAtBegin(int[] arr, int n, int value) {
        for (int i = n - 1; i >= 0; i--) {
            arr[i + 1] = arr[i]; // Shift elements right
        }
        arr[0] = value; // Insert new value at index 0
    }

    static void insertAtEnd(int [] arr , int n , int value){
        arr[n] = value; // Directly insert at the last position
    }

    static void insertAtPos(int [] arr , int n , int pos , int value){
        for (int i = n - 1; i >= pos; i--) {
            arr[i + 1] = arr[i]; // Shift right
        }
        arr[pos] = value; // Insert value
    }

    public static void main(String[] args) {
        int n = 8;
        int[] arr = new int[n + 3]; // Increase size for multiple insertions
        int[] original = {10, 9, 14, 8, 20, 48, 16, 9};

        // Copy original elements
        System.arraycopy(original, 0, arr, 0, n);

        System.out.println("Before inserting the element:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

        insertAtBegin(arr, n, 40); // Insert 40 at beginning
        n++;
        insertAtEnd(arr, n, 50);   // Insert 50 at end
        n++;
        insertAtPos(arr, n, 4, 99); // Insert 99 at position 4
        n++;

        System.out.println("After inserting the values:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
