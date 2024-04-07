import java.util.Scanner;

public class Prob4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int res = fact(a);
        System.out.println(res);


    }

    public static int fact(int a){
        if(a == 1){
            return 1;
        }
        return fact(a-1)*a;
    }

}
