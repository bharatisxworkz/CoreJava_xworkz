import com.sun.deploy.util.SyncAccess;

public class Memory {

    public static void main(String args[]){

        String hero = "Darshan";
       String hero1 =  new String("Darshan");
        String hero2 = null;

       System.out.println(hero == hero1);
       System.out.println(hero.equals(hero1));
       System.out.println(hero1.equals(hero2));
        System.out.println(hero2.equals(hero1)); //null pointer exception



        String heroine = "Rachita ram";
        String heroine1 = "Rachita ram";
        String heroine2 = "Ramya";
        String heroine3 = null;
        String heroine4 = new String("Kajol");
        String heroine5 =("bharu");

        System.out.println(heroine == heroine1);
        System.out.println(heroine.equals(heroine1));
        System.out.println(heroine1 == heroine2 );
        System.out.println(heroine2.equals(heroine1));
        System.out.println(heroine1.equals(heroine3));
        System.out.println(heroine3.equals(heroine2)); // null pointer exception
        System.out.println(heroine2== heroine4);
        System.out.println(heroine4== heroine5);


        // immutable = cannot modify the content of an object
    String d1 = "Devendra";
    d1 = d1+" Singh";
    StringBuilder builder = new StringBuilder("Devendra"); // string builder is mutable
      builder=  builder.append(" Singh");
      System.out.println(d1);

    System.out.println(d1);
    }
}
