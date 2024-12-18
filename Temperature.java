import java.util.*;
public class Temperature{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("temperature:");
        int temp=scanner.nextInt();
        if(temp>=30){
            System.out.println("It's hot outside");
        }
        scanner.close();
    }
}