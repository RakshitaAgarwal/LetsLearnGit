import java.util.Scanner;
public class Divide{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        if(d==0)
           System.out.println("Division is not Possible");
        else if{
            System.out.println("Division is: "+ n/d);
        }
    }
}