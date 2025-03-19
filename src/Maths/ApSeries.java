package Maths;

public class ApSeries {
    static float sumOfAP(float a , float d , float n){
        float sum = 0;
       for(int i =0;i<n;i++){
           sum+=a;
           a=a+d;
       }
       return sum;
    }
    public static void main(String[] args) {
        int n = 20;
        float a = 2.5f, d = 1.5f;
        System.out.println(sumOfAP(a, d, n));
    }
}
