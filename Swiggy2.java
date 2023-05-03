class Swiggy2{

public static double searchItem( String itemName )
{
System.out.println( " searchItem method started ");

if(" Veg Biryani "== itemName)
{
System.out.println( " Thanks for selecting " +itemName);
return 230.20;
}

if(" Masala dose" == itemName)
{
System.out.println( " Thanks for selecting " +itemName);
return 50.00;
}

if(" Gobi " == itemName)
{
System.out.println( " Thanks for selecting " +itemName);
return 60.00;
}

if(" French fries " == itemName)
{
System.out.println( " Thanks for selecting " +itemName);
return 120.00;
}

if(" Chicken biryani " == itemName)
{
System.out.println( " Thanks for selecting " +itemName);
return 200.00;
}

if(" Dragon chicken " == itemName)
{
System.out.println( " Thanks for selecting " +itemName);
return 230.00;
}

if(" Pizza " == itemName)
{
System.out.println( " Thanks for selecting " +itemName);
return 210.29;
}

if(" Burger " == itemName)
{
System.out.println( " Thanks for selecting " +itemName);
return 170.00;
}

if(" Roti sabzi " == itemName)
{
System.out.println( " Thanks for selecting " +itemName);
return 50.00;
}

if(" Motton Biryani " == itemName)
{
System.out.println( " Thanks for selecting " +itemName);
return 260.00;
}
System.out.println( " searchItem method ended ");
return 0.00;
}

public static double searchItem( String itemName, int quantity )
{
System.out.println( " search item including quantity ");
double  price = 0.00;
System.out.println( " search item including quantity method started ");
if(" Veg Biryani " == itemName)
{
System.out.println( " Thanks for selecting " +itemName);
return 230.20 * quantity;
}

if(" Masala dose " == itemName)
{
System.out.println( " Thanks for selecting " +itemName);
return 50.00*quantity;
}

if(" Gobi " == itemName)
{
System.out.println( " Thanks for selecting " +itemName);
return 60.00 * quantity;
}

if(" French fries " == itemName)
{
System.out.println( " Thanks for selecting " +itemName);
return 120.00 * quantity;
}

if(" Chicken biryani " == itemName)
{
System.out.println( " Thanks for selecting " +itemName);
return 200.00 * quantity;
}

if(" Dragon chicken " == itemName)
{
System.out.println( " Thanks for selecting " +itemName);
return 230.00*quantity;
}

if(" Pizza " == itemName)
{
System.out.println( " Thanks for selecting " +itemName);
return 210.29*quantity;
}

if(" Burger " == itemName)
{
System.out.println( " Thanks for selecting " +itemName);
return 170.00*quantity;
}

if(" Roti sabzi " == itemName)
{
System.out.println( " Thanks for selecting " +itemName);
return 50.00*quantity;
}

if(" Motton Biryani " == itemName)
{
System.out.println( " Thanks for selecting " +itemName);
return 260.00*quantity;
}
System.out.println( " search item including quantity method ended ");
return price;
}
}
