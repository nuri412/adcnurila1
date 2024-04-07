import java.util.Scanner;

public class Prob9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = bin(b,a);
        System.out.println(res);


    }

    public static int bin(int b, int a){
        if (b==0||b==a) return 1;
        if (a==0||a==1) return 1;
        return bin(b-1,a-1)+bin(b,a-1);
    }
}
