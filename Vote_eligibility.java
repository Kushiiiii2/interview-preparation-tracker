import java.util.*;
public class Vote_eligibility{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your age");
        int age= scanner.nextInt();
        if(age>=18){
            System.out.println("YOU ARE ELIGIBLE");
        }
        scanner.close();
    }
}