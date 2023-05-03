class Zee5{
static String kannadaShows[] = { " Weekend with Ramesh ", " Sa Re Ga Ma Pa ", " Puttakkana Makkalu ", " Hitler Kalyana ", " Gattimela ", " Punarvivaha "};

public static void main( String Zee5shows[])
{
System.out.println( " main started ");
getKannadaShows();
System.out.println( " Main ended ");

}
public static void getKannadaShows()
{
System.out.println( " Calling of main method ");
System.out.println( " Kannada shows on ZEE5: ");
for( int i=0; i< kannadaShows.length; i++)
{
System.out.println( kannadaShows[i]);
}
System.out.println( " End of main method ");
}

}