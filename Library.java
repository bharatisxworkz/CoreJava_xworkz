class Library{
static String bookNames[] = { "null","null","null","null","null","null","null","null","null","null","null","null","null","null","null"};
static int index;

public static boolean addBookName( String bookName){
	System.out.println( "addBookName method started "");
	
boolean isAdded = false;
 
 if( bookName != null )
 {
	 
 bookNames[index++] = bookName;
 isAdded = true;
 
 
 }
 else {
	 System.out.println( " book name is null ");
 }
 System.out.println( " addBookName method ended ");
 return isAdded;
 }
 public static void getBookNames()
 {
	 System.out.println( "getBookNames method started ");
	
	 for( int ind=0; ind<bookNames.length; ind++)
	 {
		 System.out.println( bookNames[ind]);
		 
	 }
	 System.out.println( "getBookNames method ended ");
	 return ;
	 
	 
 }
 public static boolean updateBookName( String oldBookName, String updatedBookName)
 {
	 System.out.println( " updateBookName method started ");
	
	 boolean isUpdated = false;
	
	 for( int ind =0; ind < bookNames.length; ind++)
	 {
		 
		 if( bookNames[ind].equals(oldBookName))
		 {
			 bookNames[ind] = updatedBookName;
			 isUpdated = true;
		 }
	 }
	 System.out.println( " updateBookName method ended ");
			return  isUpdated ;
		 }
 }
		 
	 
	 
 




