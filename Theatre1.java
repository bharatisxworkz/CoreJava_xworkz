class Theatre1{
static String movieNames[] = { "null","null","null","null","null","null","null","null","null","null"};
static int index;

public static boolean addMovieName( String movieName){
	System.out.println( " addMovieName method started ");
	
boolean isAdded = false;
 
 if( movieName != null )
 {
	 
 movieNames[index++] = movieName;
 isAdded = true;
 System.out.println( " movie name is added ");
 }
 else {
	 System.out.println( " movie name is null ");
 }
 System.out.println( " addMovieName method ended ");
 return isAdded;
 }
 public static void getMovieNames()
 {
	System.out.println( "getMovieNames method started ");
	 for( int ind=0; ind<movieNames.length; ind++)
	 {
		 System.out.println( movieNames[ind]);
		 
	 }
	System.out.println( " getMovieNames method ended ");
return ;	
	 
 }
 public static boolean updateMovieName( String oldMovieName, String updatedMovieName)
 {
	 System.out.println( " updateMovieName method started ");
	 boolean isUpdated = false;
	 for( int ind =0; ind < movieNames.length; ind++)
	 {
		 if( movieNames[ind].equals(oldMovieName))
		 {
			 movieNames[ind] = updatedMovieName;
			 isUpdated = true;
		 }
	 }
	 System.out.println( " updateMovieName method ended ");
			return  isUpdated ;
		 }
 }
		 
	 
	 
 




