class Television{
static String brandName = " Sony ";
static boolean isConnected;
static double price = 35000.00;
static int MaxVolume = 100;
static int MinVolume = 0 ;
static int CurrentVolume = 0;

public static void main( String tv[])
{
System.out.println( " Main started ");
onOrOff();
MaxVolume();
MaxVolume();
MaxVolume();
MaxVolume();
MinVolume();
MinVolume();
MinVolume();
MinVolume();
System.out.println( " Main  ended ");
}
public static boolean onOrOff()
{
System.out.println( " onOrOff method started ");
if( isConnected==false)
{
isConnected= true;
System.out.println( " The television is turned on...");
}
else if( isConnected== true)
{
isConnected= false;
System.out.println( " The television is turned off...");
}
System.out.println( " onOrOff method ended ");
return isConnected;
}


public static int MaxVolume()
{
System.out.println( " MaxVolume method started ");
if(isConnected == true)
{
if( CurrentVolume<MaxVolume)
{
System.out.println( " The current volume is less than Max...proceed ");
CurrentVolume=CurrentVolume+5;
System.out.println( " The current volume " + CurrentVolume);
}
else{
System.out.println( " The Max volume reached...");

}
}else {
System.out.println( " Turn on the television ");
}
System.out.println( " MaxVolume method ended ");
return CurrentVolume;
}

public static int  MinVolume()
{
System.out.println( " MinVolume method started ");
if(isConnected == true)
{
if( CurrentVolume>MinVolume)
{
System.out.println( " The current volume is greater than Min...proceed ");
CurrentVolume=CurrentVolume-5;
System.out.println( " The current Volume " + CurrentVolume);
}
else{
System.out.println( " The Min Volume reached...");
}

}else {
System.out.println( " Turn on television ");
}
System.out.println( " MinVolume method ended ");
return CurrentVolume;
}

}



































































