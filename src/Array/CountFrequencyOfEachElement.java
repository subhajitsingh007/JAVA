package Array;
//in this program The frequency of each element of the given array will be counted

public class CountFrequencyOfEachElement {
    void countFrequency(int [] arr, int n){
        n=arr.length;

        boolean [] visited = new boolean[n];

        for(int i=0;i<n;i++){
           //if the element is already visited we skip the remaining steps
            if(visited[i]==true)
                continue;

            int count = 1;

            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println(arr[i]+" "+count);
        }

    }
    public static void main(String[] args) {
        int [] arr = {10,5,10,15,10,5};

        CountFrequencyOfEachElement obj = new CountFrequencyOfEachElement();

        obj.countFrequency(arr,6);


    }
}
