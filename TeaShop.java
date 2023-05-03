class TeaShop{
static String teaNames[] = { "null","null","null","null","null","null"};
static int index;

public static boolean addTeaName( String teaName){
	System.out.println( " calling addTeaName ");
	
boolean isAdded = false;
 
 if( teaName != null )
 {
	 
 teaNames[index++] = teaName;
 isAdded = true;
 
 
 }
 else {
	 System.out.println( " tea name is null ");
 }
 return isAdded;
 }
 public static void getTeaNames()
 {
	
	 for( int ind=0; ind<teaNames.length; ind++)
	 {
		 System.out.println( teaNames[ind]);
		 
	 }
	 
	 
 }
 public static boolean updateTeaName( String oldTeaName, String updatedTeaName)
 {
	 boolean isUpdated = false;
	 for( int ind =0; ind < teaNames.length; ind++)
	 {
		 if( teaNames[ind].equals(oldTeaName))
		 {
			 teaNames[ind] = updatedTeaName;
			 isUpdated = true;
		 }
	 }
			return  isUpdated ;
		 }
 }
		 
	 
	 
 




