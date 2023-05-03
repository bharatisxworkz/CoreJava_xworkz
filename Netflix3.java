class Netflix3{
static String englishSeries[] = { " Ozark ", " Money Heist ", " Dark ", " The Last Kingdom ", " Black Mirror ", " The Haunting of Hill House ", " The Crown "};

public static void main( String series[])
{
System.out.println( " Main started ");
getEnglishSeries();
System.out.println( " Main ended ");
}
public static void getEnglishSeries()
{
System.out.println( " Calling of main method ");
System.out.println( " Names of English series in netflix:");
for( int i=0; i< englishSeries.length; i++)
{
System.out.println( englishSeries[i]);
}
System.out.println( " End of main method ");


}
}