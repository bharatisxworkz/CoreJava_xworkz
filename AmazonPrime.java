class AmazonPrime{
static String hindiSeries[] = { " Mirzapur ", " Farzi ", " Paatal Lok ", " The Family Man ", " Panchayat ", " Pushpavalli ", " Crash Course ", " Bestseller ", " Guilty Minds "};

public static void main ( String seriesnames[])
{
System.out.println( " Main started ");
getHindiSeries();
System.out.println( " Main ended ");
}
public static void getHindiSeries()
{
System.out.println( " Calling of main method ");
System.out.println( " Hindi series names : ");
for( int i=0; i< hindiSeries.length; i++)
{
System.out.println( hindiSeries[i]);

}
System.out.println( " End of main method ");
}
}