class CreditCards3{
static String creditCardNames[] = { " Axis Bank Credit Card ", " HDFC Bank Credit Card ", " Kotak Bank Credit Card ", " SBI Credit Cards ", " HSBC Credit Card ", " IndusInd Bank Credit Card ", " RBL Bank Credit Card ", " Standard Chartered Credit Card"};

public static void main( String cardnames[])
{
System.out.println( " Main started ");
getCreditCardNames();
System.out.println( " Main ended ");
}

public static void getCreditCardNames()
{
System.out.println( " Calling of main method ");
System.out.println( " names of credit cards: ");
for( int i=0; i<creditCardNames.length; i++)
{
System.out.println( creditCardNames[i]);
}
System.out.println( " End of main method ");


}







}