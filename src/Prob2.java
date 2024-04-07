import java.util.Scanner;

public class Prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //the size of array
        int a = sc.nextInt();
        int[] arr = new int[a];

        //the elements of array
        for(int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        double res = av(a,arr);
        System.out.println(res);
    }

    public static double av(int a, int[] arr) {
        double s = 0;
        for(int i = 0; i < a; i++){
            s = s+arr[i];
        }

        return s/a;

    }

}
