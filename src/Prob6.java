import java.util.Scanner;

public class Prob6 {

    public static int Power(int a, int pow){
        if(pow == 0){
            a = 1;

        }

        else if (pow == 1){
            return a;
        }

        else{
            return a*Power(a,pow-1);
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int pow = sc.nextInt();
        int res = Power(a, pow);
        System.out.println(res);


    }


}