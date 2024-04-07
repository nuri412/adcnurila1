import java.util.Scanner;

public class Prob8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a = s.length()-1;
        boolean res = check(s,a);
        if(res){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }





    }

    public static boolean check(String s, int a){
        if (a == 0){
            return Character.isDigit(s.charAt(0));
        }
        else {
            return Character.isDigit(s.charAt(a))&&check(s,a-1);
        }
    }
}
