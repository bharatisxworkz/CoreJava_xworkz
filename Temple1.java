class Temple1{
static String godNames[] = { " Brahma ", " Vishnu ", " Maheshwara ", " lakshmi ", " Saraswathi ", " Ganesha ", " Anjaneya ", " Venkateshwara ", " jesus ", " Allah ", " Banadeshwara "};
 
 public static void main( String god[])
{
System.out.println( " Main started ");
getGodNames();
System.out.println( " Main ended ");
}
 public static void getGodNames()
 {
 System.out.println( " Calling of main method ");
 System.out.println( " names of God :");
 for( int i=0; i<godNames.length; i++)
 {
 System.out.println( godNames[i]);
 
 }
 System.out.println( " End of main method ");
 
 
 }





}