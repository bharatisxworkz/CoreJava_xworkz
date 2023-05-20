package encapsulation;
import java.util.Scanner;

public class CakeTester {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter cake Id");
        int cakeId=sc.nextInt();
        System.out.println("Enter cake flavor");
        String flavor=sc.next();
        System.out.println("Enter cake color");
        String color =sc.next();
        System.out.println("Enter cake shape");
        String shape=sc.next();
        System.out.println("Enter cake price");
        double price=sc.nextDouble();

        Cake cake= new Cake();
        cake.setCakeId(cakeId);
        cake.setFlavor(flavor);
        cake.setColor(color);
        cake.setShape(shape);
        cake.setPrice(price);

        System.out.println("cake id:"+cake.getCakeId()+"\n"+"cake flavor:"+cake.getFlavor()+"\n"+"cake color:"+cake.getColor()+"\n"+"cake shape:"+cake.getShape()+"\n"+"cake price:"+cake.getPrice());

    }
}
