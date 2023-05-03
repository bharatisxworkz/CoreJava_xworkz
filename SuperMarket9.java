class SuperMarket9{
static String shampooNames[] = { " Head and Shoulder ", " Clinic Plus ", " Dove ", " Sunsilk ", " Pantene ", " Vatika ", " Tresemme "};

public static void main( String shampoos[])
{
System.out.println( " Main started ");
getShampooNames();
System.out.println( " Main ended ");
}

public static void getShampooNames()
{
System.out.println( " Calling of main method ");
System.out.println( " Names of Shampoo :");
for ( int i=0; i< shampooNames.length; i++)
{
System.out.println( shampooNames[i]);

}
System.out.println( " End of main method ");
}





}