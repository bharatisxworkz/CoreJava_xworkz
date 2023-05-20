package encapsulation;
import java.util.Scanner;

public class FootwearTester {
    public static void main(String  args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter footwear id");
        int Id=sc.nextInt();
        System.out.println("enter brand");
        String brand=sc.next();
        System.out.println("enter footwear size");
        int size=sc.nextInt();
        System.out.println("enter footwear price");
        double price=sc.nextDouble();
        System.out.println("enter material");
        String  material=sc.next();

        Footwear footwear= new Footwear();
        footwear.setId(Id);
        footwear.setBrand(brand);
        footwear.setSize(size);
        footwear.setPrice(price);
        footwear.setMaterial(material);
        System.out.println("Id:"+footwear.getId()+"\n"+"brand :"+ footwear.getBrand()+"\n"+"size: "+ footwear.getSize()+"\n"+"price:"+ footwear.getPrice()+"\n"+"material:"+ footwear.getMaterial());

    }
}
