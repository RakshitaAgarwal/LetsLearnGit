import java.util.Scanner;
public class Diff{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int diff = a-b;
        System.out.println("Difference is : " + diff);
    }
}