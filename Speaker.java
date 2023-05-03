class Speaker{
static boolean isConnected;
static String name= " Voice ";
static double price = 3000.00;
static int maxVolume = 8;
static int minVolume = 0;
static int currentVolume = 0;

public static void main( String speaker[])
{
System.out.println( " Main started ");
boolean connected = onOrOff();
System.out.println( " Speaker is connected " + connected);

boolean connected1 = onOrOff();
System.out.println( " Speaker is connected " + connected1);

boolean connected2 = onOrOff();
System.out.println( " Speaker is connected " + connected2);
System.out.println( " Main ended ");
} 

public static boolean onOrOff()

{
System.out.println( " onOrOff method started ");

if( isConnected == false ){
	
isConnected = true;
System.out.println( " Speaker is turned on ");
}

else if ( isConnected == true )
{
isConnected = false;
System.out.println( " Speaker is turned off ");

}
System.out.println( " onOrOff method ended ");
return isConnected;



}



}