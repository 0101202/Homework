import java.util.Scanner;

public class Max_Digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number = ");
        int n=sc.nextInt();
        int max=0;
        while (n>0);
        {
            int dig=n%10;
            max=Math.max(max, dig);
            n=n/10;
        }
        System.out.println("The largest digit in the number is = "+max);
    }
}
