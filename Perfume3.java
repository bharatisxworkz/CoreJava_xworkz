class Perfume3{
static String brandNames[] = { " Gucci Bloom ", " Versace Yellow Diamond ", " Chanel Chance Eau Tendre ", " Givenchy Amarige ", " Dior Miss Dior ", " Fogg Wood Extreme ", " BEAUTYPRO "};
public static void main ( String perfumebrands[])
{
System.out.println( " Main started ");
getbrandNames();
System.out.println( " Main ended ");

}
 public static void getbrandNames()
 {
 System.out.println( " Calling of main method ");
 System.out.println( " Brand names of Perfume:");
 for( int i=0; i< brandNames.length; i++)
 {
 System.out.println( brandNames[i]);
 
 }
 System.out.println( " End of main method ");
 }



}