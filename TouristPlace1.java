class TouristPlace1{
static String placeNames[] = { " Hampi ", " Taj Mahal ", " India Gate ", " Mysore Palace ", " Koadikanal ", " Ooty ", " Goa ", " Munnar ", " Madikeri "};
 
 public static void main( String places[])
{
System.out.println( " Main started ");
getPlaceNames();
System.out.println( " Main ended ");

}
public static void getPlaceNames()
{
System.out.println( " Calling of main method ");
System.out.println( " tourist places :");
for ( int i=0; i<placeNames.length; i++)
{
System.out.println( placeNames[i]);
}
System.out.println( " End of main method ");
return  ; 
}


}