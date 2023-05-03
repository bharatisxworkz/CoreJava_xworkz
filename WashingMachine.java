class WashingMachine{
static String brandName = " whirlpool ";
static boolean isConnected;
static double price = 22000.00;
static int spinMaxSpeed = 50;
static int spinMinSpeed = 0 ;
static int spinCurrentSpeed = 0;

public static void main( String machine[])
{
System.out.println( " Main started ");
onOrOff();
spinMaxSpeed();
spinMaxSpeed();
spinMaxSpeed();
spinMaxSpeed();
spinMinSpeed();
spinMinSpeed();
spinMinSpeed();
spinMinSpeed();
System.out.println( " Main  ended ");
}
public static boolean onOrOff()
{
System.out.println( " onOrOff method started ");
if( isConnected==false)
{
isConnected= true;
System.out.println( " The washing machine is turned on...");
}
else if( isConnected== true)
{
isConnected= false;
System.out.println( " The washing machine is turned off...");
}
System.out.println( " onOrOff method ended ");
return isConnected;
}


public static int spinMaxSpeed()
{
System.out.println( " spinMaxSpeed method started ");
if(isConnected == true)
{
if( spinCurrentSpeed<spinMaxSpeed)
{
System.out.println( " The current spin speed is less than Max...proceed ");
spinCurrentSpeed=spinCurrentSpeed+3;
System.out.println( " The current spin speed " + spinCurrentSpeed);
}
else{
System.out.println( " The Max speed reached...");

}
}else {
System.out.println( " Turn on the washing machine");
}
System.out.println( " spinMaxSpeed method ended ");
return spinCurrentSpeed;
}

public static int  spinMinSpeed()
{
System.out.println( " spinMinSpeed method started ");
if(isConnected == true)
{
if( spinCurrentSpeed>spinMinSpeed)
{
System.out.println( " The current spin speed is greater than Min...proceed ");
spinCurrentSpeed=spinCurrentSpeed-3;
System.out.println( " The current spin speed " + spinCurrentSpeed);
}
else{
System.out.println( " The Min speed reached...");
}

}else {
System.out.println( " Turn on washing machine ");
}
System.out.println( " spinMinSpeed method ended ");
return spinCurrentSpeed;
}

}



































































