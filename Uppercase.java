import java.util.*;
public class Uppercase{
    public static void main(String[] args){
        Scanner scanner=new Scanner (System.in);
        System.out.print("Enter a Character: ");
        char ch=scanner.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println("It is uppercase");
        }
        scanner.close();
    }
}