class Groceries2{

 static String itemNames[] = { " Rice ", " Wheat ", " Honey ", " Cooking Oil ", " Butter ", " Pasta ", " Bread ", " Beans ", " Milk ", " Egg ", " Cheese ", " Pulses "};
 
 public static void main( String items[]){
 System.out.println( " Main started ");
 getItemNames();
 System.out.println( " Main ended ");
 }
 public static void getItemNames()
 {
 System.out.println( "Grocery items are :");
 for( int i=0; i<itemNames.length; i++)
 {
 System.out.println( itemNames[i]);
 }
 
 System.out.println( " End of main method");
 }






}