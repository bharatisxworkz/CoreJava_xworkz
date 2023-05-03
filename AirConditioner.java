class AirConditioner{
static boolean isConnected;
static String name= " Voice ";
static double price = 16000.00;
static int maxVolume = 60;
static int minVolume = 0;
static int currentVolume = 0;

public static void main( String ac[])
{
System.out.println( " Main started ");
onOrOff();
increaseVolume();
increaseVolume();
increaseVolume();
increaseVolume();
decreaseVolume();
decreaseVolume();
decreaseVolume();
decreaseVolume();
decreaseVolume();

 
System.out.println( " Main ended ");
} 

public static boolean onOrOff()

{
System.out.println( " onOrOff method started ");

if( isConnected == false ){
	
isConnected = true;
System.out.println( " air conditioner is turned on ");
}

else if ( isConnected == true )
{
isConnected = false;
System.out.println( " air conditioner is turned off ");

}
System.out.println( " onOrOff method ended ");
return isConnected;
}
public static int increaseVolume()
{
	System.out.println( " IncreaseVolume method started ");
	if( isConnected== true)
	{
	if( currentVolume< maxVolume)
	{
		System.out.println( "The current volume is less than Max...proceed");
		
		currentVolume= currentVolume+8;
		System.out.println( " The current voulume is " + currentVolume);
		}
		else {
			
		System.out.println( " Max volume reached...");
		}

	}else {
		System.out.println( " gube...AC turn on maadu first ");	
			
		}
		System.out.println( " increaseVolume method ended ");
		return currentVolume;
	
}
public static int decreaseVolume()
{
	System.out.println( " DecreaseVolume method started ");
	if( isConnected== true)
	{
	if( currentVolume>minVolume)
	{
		System.out.println( " The current volume is greater than Min...proceed");
		currentVolume= currentVolume-8;
		System.out.println( " The current volume is " + currentVolume);
		}
	
else {
	System.out.println( " Min volume reached...");
}		
	}else {
	System.out.println( " gube...AC on maadu first ");
}
System.out.println( " decreaseVolume method ended ");
return currentVolume;
	}
}



