import java.util.Scanner;

public class Prob10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = gcd(a,b);
        System.out.println(res);


    }

    public static int gcd(int a,int b){
        if(a-b==1) return 1;
        else if(b==0) return a;
        return gcd(b,a%b);
    }


}
