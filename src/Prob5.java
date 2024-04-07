import java.util.Scanner;

public class Prob5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int res = Fib(a);
        System.out.println(res);


    }

    public static int Fib(int a){
        if(a == 0) {
            return 0;
        }

        else if(a == 1){
            return 1;

        }

        else{
            return Fib(a-1)+Fib(a-2);
        }
    }
}
