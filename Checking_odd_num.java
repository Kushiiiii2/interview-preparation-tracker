import java.util.*;
public class Checking_odd_num{
    public static void main(String[] args){
    Scanner scanner =new Scanner(System.in);
    System.out.print("ENTER NUMBER");
    int num=scanner.nextInt();
        if(num%2!=0){
        System.out.println("Number is ODD");
    }
    scanner.close();
}

}