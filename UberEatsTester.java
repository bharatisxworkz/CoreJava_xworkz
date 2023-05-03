class UberEatsTester{
public static void main( String ubereats[])
{
System.out.println( " Main method started ");
String foodName = " Fruit salad ";
double price = UberEats.searchFood(foodName);
System.out.println( " The price of " + foodName  + " is " +price);
System.out.println( " Main method ended ");

}

}