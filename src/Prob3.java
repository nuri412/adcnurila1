import java.util.Scanner;

public class Prob3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String res = check(a);
        System.out.println(res);
    }
    public static String check(int a){
        if(a==2){
            return "Prime";

        }

        else if (a%2!=0){
            return "Prime";
        }

        else{
            return "Composite";
        }
    }
}
