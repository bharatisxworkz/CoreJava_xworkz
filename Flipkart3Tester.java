class Flipkart3Tester{
public static void main( String flipkart[])
{
System.out.println( " Main method started ");
String productName = " Laptop ";
double priceForSingle = Flipkart3.searchProduct(productName);

double priceWithQuantity = Flipkart3.searchProduct( productName , 4);
System.out.println( " The price of " + productName  + "is " +priceForSingle);
System.out.println( " The price of " + productName + " is " +priceWithQuantity);
System.out.println( " Main method ended ");

}

}