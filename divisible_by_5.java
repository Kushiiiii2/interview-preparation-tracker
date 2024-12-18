import java.util.*;
public class divisible_by_5{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= scanner.nextInt();
        if(num%5==0){
            System.out.println("Number is divisible by 5");
        }
        scanner.close();
    }
}