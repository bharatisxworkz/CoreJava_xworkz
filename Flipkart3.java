class Flipkart3{

public static double searchProduct( String productName )
{
System.out.println( " search product method started ");

if(" Ear phones "== productName)
{
System.out.println( " Thanks for selecting " +productName);
return 550.20;
}

if(" kurti " == productName)
{
System.out.println( " Thanks for selecting " +productName);
return 460.00;
}

if(" Shoes " == productName)
{
System.out.println( " Thanks for selecting " +productName);
return 800.00;
}

if(" Watch " == productName)
{
System.out.println( " Thanks for selecting " +productName);
return 2100.00;
}

if(" Bag " == productName)
{
System.out.println( " Thanks for selecting " +productName);
return 970.00;
}

if(" Necklace " == productName)
{
System.out.println( " Thanks for selecting " +productName);
return 1300.00;
}

if(" Television " == productName)
{
System.out.println( " Thanks for selecting " +productName);
return 22100.00;
}

if(" Laptop " == productName)
{
System.out.println( " Thanks for selecting " +productName);
return 45000.00;
}

if(" Iron Box " == productName)
{
System.out.println( " Thanks for selecting " +productName);
return 2300.00;
}

if(" Bluetooth " == productName)
{
System.out.println( " Thanks for selecting " +productName);
return 2000.00;
}
System.out.println( " search product method ended ");
return 0.00;
}

public static double searchProduct( String productName, int quantity )
{
System.out.println( " search product including quantity ");
double  price = 0.00;
System.out.println( " search product including quantity method started ");
if(" Ear phones " == productName)
{
System.out.println( " Thanks for selecting " +productName);
return 550.20 * quantity;
}

if(" kurti " == productName)
{
System.out.println( " Thanks for selecting " +productName);
return 460.00*quantity;
}

if(" Shoes " == productName)
{
System.out.println( " Thanks for selecting " +productName);
return 800.00 * quantity;
}

if(" Watch " == productName)
{
System.out.println( " Thanks for selecting " +productName);
return 2100.00 * quantity;
}

if(" Bag " == productName)
{
System.out.println( " Thanks for selecting " +productName);
return 970.00 * quantity;
}

if(" Necklace " == productName)
{
System.out.println( " Thanks for selecting " +productName);
return 1300.00*quantity;
}

if(" Television " == productName)
{
System.out.println( " Thanks for selecting " +productName);
return 22100.29*quantity;
}

if(" Laptop " == productName)
{
System.out.println( " Thanks for selecting " +productName);
return 45000.00*quantity;
}

if(" Iron Box " == productName)
{
System.out.println( " Thanks for selecting " +productName);
return 2300.00*quantity;
}

if(" Bluetooth " == productName)
{
System.out.println( " Thanks for selecting " +productName);
return 2000.00*quantity;
}
System.out.println( " search product including quantity method ended ");
return price;
}
}
