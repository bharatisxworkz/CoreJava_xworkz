class Fan{
static String brandName = " Flamingo ";
static boolean isConnected;
static double price = 11500.10;
static int maxSpeed = 6;
static int minSpeed = 0;
static int currentSpeed = 0;

public static void main( String electricfan[])
{
System.out.println( " Main started ");
onOrOff();
increaseSpeed();
increaseSpeed();
increaseSpeed();
increaseSpeed();
decreaseSpeed();
decreaseSpeed();
decreaseSpeed();
decreaseSpeed();
System.out.println( " Main ended ");
}

public static boolean onOrOff()
{
System.out.println( " onOrOff method started ");
if( isConnected == false )
{
isConnected = true;
System.out.println( " fan is turned on ");
}
else if( isConnected == true )
{
isConnected = false;
System.out.println( " fan is turned off ");
}
System.out.println( " onOrOff method ended ");
return isConnected;
}


public static int increaseSpeed()
{
System.out.println( " increaseSpeed method started ");
if( isConnected== true)
{
if( currentSpeed< maxSpeed)
{
System.out.println( "The current speed is less than Max...proceed");
currentSpeed= currentSpeed+1;
		System.out.println( " The current speed is " + currentSpeed);
		}
		else {
			
		System.out.println( " Max speed reached...");
		}

	}else {
		System.out.println( " gube...fan turn on maadu first ");	
			
		}
		System.out.println( " increaseSpeed method ended ");
		return currentSpeed;
	
		
}
public static int decreaseSpeed()
{
System.out.println( " decreaseSpeed method started ");
if( isConnected== true)
{
if( currentSpeed>minSpeed)
{
System.out.println( "The current speed is less than Min...proceed");
currentSpeed= currentSpeed-1;
		System.out.println( " The current speed is " + currentSpeed);
		}
		else {
			
		System.out.println( " Min speed reached...");
		}
		}else {
		System.out.println( " gube...fan turn on maadu first ");	
			
		}
		System.out.println( " decreaeSpeed method ended ");
		return currentSpeed;
	}




}