class OttPlatform3{
static String platformNames[] = { " Netflix ", " Amazon Prime ", " ZEE5 ", " VOOT ", " Hotstar ", " Jio Cinema ", " Disney+ Hotstar ", " Discovery+ ", " Apple TV+ "};

public static void main( String ottPlatforms[])
{
System.out.println( " Main started ");
getPlatformNames();
System.out.println( " Main ended ");

}
public static void getPlatformNames()
{
System.out.println( " Calling of main method ");
System.out.println( " Names of Ott Platforms:");
for( int i=0; i< platformNames.length; i++)
{
System.out.println( platformNames[i]);

}
System.out.println( " End of main method");
}



}