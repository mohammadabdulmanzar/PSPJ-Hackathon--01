import java.util.Scanner;

public class WasteCollection {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter collection in kg");
        double waste = sc.nextDouble();
        if(waste >= 90){
            System.out.println("Collection Target Achieved");

        }else{
            System.out.println("Required more collection");
        }
    }
}
