class Pub1{
static String pubNames[] = { " What's In A Name ", " Toit Brewpub ", " Gilly’s 104 Bar ", " Pecos Stones 2.0 ", " Hoppipola ", " The Biere Club ", " District 6 ", " The Noon Wine ", " Vapour Pub and Brewery "};

public static void main( String pubs[]){
System.out.println( " Main started ");
getPubNames();
System.out.println( " Main ended ");
}
public static void getPubNames(){
System.out.println( " Calling of main method ");
System.out.println( " List of pub names :");
for( int i=0; i<pubNames.length; i++)
{
System.out.println( pubNames[i]);

}
System.out.println( " End of main method ");


}






}