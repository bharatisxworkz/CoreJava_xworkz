class UberEats2Tester{
public static void main( String ubereats[])
{
System.out.println( " Main method started ");

String foodName = " Fruit salad ";
double priceForSingle = UberEats2.searchFood(foodName);

double priceWithQuantity = UberEats2.searchFood( foodName, 15);
System.out.println( " The price of " + foodName  + " is " +priceForSingle);
System.out.println( " The price of " + foodName + " is " +priceWithQuantity);

System.out.println( " Main method ended ");

}

}