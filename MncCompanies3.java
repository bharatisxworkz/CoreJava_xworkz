class MncCompanies3{
 
 static String companyNames[] = { " Infosys ", " IBM ", " TATA ", " Google ", " NOKIA ", " Microsoft ", " DELL ", " Polaris ", " Accenture "};
 
 public static void main( String companies[])
 { 
 System.out.println( " Main started ");
 getCompanyNames();
 System.out.println( " Main ended ");
 }
 public static void getCompanyNames()
 {
  System.out.println( " Calling of main method ");
  System.out.println( " names of MNC Companies :");
  for( int i=0; i< companyNames.length; i++)
  {
  System.out.println( companyNames[i]);
  }
  System.out.println( " End of main method ");
 
 }






}