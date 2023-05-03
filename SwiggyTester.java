class SwiggyTester{
public static void main( String swiggy[])
{
System.out.println( " Main method started ");
String foodName = " Veg Roll ";
double price = Swiggy.searchFood(foodName);
System.out.println( " The price of " + foodName  + " is " +price);
System.out.println( " Main method ended ");

}

}