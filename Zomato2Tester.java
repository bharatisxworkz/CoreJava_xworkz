class Zomato2Tester{
public static void main( String zomato[])
{
System.out.println( " Main method started ");
String itemName = " Veg Biryani ";
double priceForSingle = Zomato2.searchItem(itemName);

double priceWithQuantity = Zomato2.searchItem( itemName , 12);
System.out.println( " The price of " + itemName  + "is " +priceForSingle);
System.out.println( " The price of " + itemName + " is " +priceWithQuantity);
System.out.println( " Main method ended ");

}

}