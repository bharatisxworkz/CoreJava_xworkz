class Netflix1{
static String kannadaMovies[] = { " yajamana ", " om ", " A ", " Googly ", " KGF ", " Kantara ", " Mungaru Male ", " Nagara Havu "};
 
 static String tamilMovies[] = { " SHivaji ", " Enemy ", " Singam ", " Pasha ", " Vikram "};
  
  public static void main( String netflix[]){
  
  System.out.println( " Main started ");
  getKannadaMovies();
  getTamilMovies();
  System.out.println( " Main ended ");
  }
  public static void getKannadaMovies(){
  
  System.out.println( " Calling getKannadaMovies method ");
  System.out.println( " List of kannada movies :");
  for( int i=0; i< kannadaMovies.length; i++)
  {
  System.out.println( kannadaMovies[i]);
  
  }
  System.out.println( " end of getKannadaMovies method ");
  return;
  }
  
  public static void getTamilMovies(){
	  
  System.out.println( " Calling getTamilMovies method ");
  System.out.println( " List of Tamil movies :");
  for( int i=0;i< tamilMovies.length; i++)
  {
  System.out.println( tamilMovies[i]);
  
  }
  System.out.println( " end of getTamilMovies method ");
  return;
  
  
  
  }
  
  
  
  
  
  }
  
 














