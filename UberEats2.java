class UberEats2{

public static double searchFood( String foodName )
{
System.out.println( " searchFood method started ");

if(" Idly "== foodName)
{
System.out.println( " Thanks for selecting " +foodName);
return 40.20;
}

if(" Fried rice " == foodName)
{
System.out.println( " Thanks for selecting " +foodName);
return 100.00;
}

if(" Mashroom Manchurian " == foodName)
{
System.out.println( " Thanks for selecting " +foodName);
return 160.00;
}

if(" Tomato Soup " == foodName)
{
System.out.println( " Thanks for selecting " +foodName);
return 65.00;
}

if(" Raagi Balls " == foodName)
{
System.out.println( " Thanks for selecting " +foodName);
return 90.00;
}

if(" Sev puri " == foodName)
{
System.out.println( " Thanks for selecting " +foodName);
return 55.60;
}

if(" Butter Dosa " == foodName)
{
System.out.println( " Thanks for selecting " +foodName);
return 80.29;
}

if(" Egg Burji " == foodName)
{
System.out.println( " Thanks for selecting " +foodName);
return 120.00;
}

if(" pulav " == foodName)
{
System.out.println( " Thanks for selecting " +foodName);
return 140.00;
}

if(" Fruit salad " == foodName)
{
System.out.println( " Thanks for selecting " +foodName);
return 70.00;
}

if(" Pani puri " == foodName)
{
System.out.println( " Thanks for selecting " +foodName);
return 45.00;
}

if(" Rice bath " == foodName)
{
System.out.println( " Thanks for selecting " +foodName);
return 85.00;
}


System.out.println( " searchFood method ended ");
return 0.00;
}

public static double searchFood( String foodName, int quantity )
{
	System.out.println( " search item including quantity ");
double price = 0.00;
System.out.println( " search item including quantity method started ");

if(" Idly "== foodName)
{
System.out.println( " Thanks for selecting " +foodName);
return 40.20*quantity;
}

if(" Fried rice" == foodName)
{
System.out.println( " Thanks for selecting " +foodName);
return 100.00*quantity;
}

if(" Mashroom Manchurian"== foodName)
{
System.out.println( " Thanks for selecting " +foodName);
return 160.00*quantity;
}

if(" Tomato Soup  "== foodName)
{
System.out.println( " Thanks for selecting " +foodName);
return 65.00*quantity;
}

if(" Raagi Balls  "== foodName)
{
System.out.println( " Thanks for selecting " +foodName);
return 90.00*quantity;
}	

if(" Sev puri "== foodName)
{
System.out.println( " Thanks for selecting " +foodName);
return 55.60*quantity;
}

if(" Butter Dosa  "== foodName)
{
System.out.println( " Thanks for selecting " +foodName);
return 80.29*quantity;
}

if(" Egg Burji "== foodName)
{
System.out.println( " Thanks for selecting " +foodName);
return 120.00*quantity;
}

if(" pulav "== foodName)
{
System.out.println( " Thanks for selecting " +foodName);
return 140.00*quantity;
}

if(" Fruit salad "== foodName)
{
System.out.println( " Thanks for selecting " +foodName);
return 70.00*quantity;
}

if(" pani puri "== foodName)
{
System.out.println( " Thanks for selecting " +foodName);
return 45.00*quantity;
}

if(" Rice bath "== foodName)
{
System.out.println( " Thanks for selecting " +foodName);
return 85.00*quantity;
}

System.out.println( " search ietm including quantity method ended ");
return price ;

	
	
}

}