class SuperMarket5{
static String chocolateNames[] = {" Cadbury ", " Dairy Milk ", " FUSE ", " Amul ", " HERSHEYS "};
 public static void main ( String chocolate[]){
 System.out.println( " Main started ");
 getChocolateNames();
System.out.println( " Main ended ");
 }
 
 public static void getChocolateNames()
 {
 System.out.println( " Calling of main method ");
 System.out.println( " List of chocolate names :");
 for( int i=0; i<chocolateNames.length; i++)
 
{
System.out.println( chocolateNames[i]);

}
System.out.println( " End of main method "); 
return ;
 }






}