class Swiggy2Tester{
public static void main( String swiggy[])
{
System.out.println( " Main method started ");
String itemName = " Gobi ";
double priceForSingle = Swiggy2.searchItem(itemName);

double priceWithQuantity = Swiggy2.searchItem( itemName , 12);
System.out.println( " The price of " + itemName  + "is " +priceForSingle);
System.out.println( " The price of " + itemName + " is " +priceWithQuantity);
System.out.println( " Main method ended ");

}

}