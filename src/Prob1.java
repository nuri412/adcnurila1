import java.util.Scanner;

public class Prob1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //the size of array
        int a = sc.nextInt();
        int[] arr = new int[a];

        //the elements of array
        for(int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int res = findMin(a, min, arr);

        //print the min num
        System.out.println(res);
    }

    public static int findMin(int a, int min, int arr[]) {
        for(int i = 0; i < a; i++){
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

}




