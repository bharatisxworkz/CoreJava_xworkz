class Restaurant{
static String itemNames[] = { "null","null","null","null","null","null","null","null","null","null","null","null","null","null","null"};
static int index;

public static boolean addItemName( String itemName){
	System.out.println( " calling addItemName ");
	
boolean isAdded = false;
 
 if( itemName != null )
 {
	 
 itemNames[index++] = itemName;
 isAdded = true;
 
 
 }
 else {
	 System.out.println( " item name is null ");
 }
 System.out.println( " addItemName method ended ");
 return isAdded;
 }
 public static void getItemNames()
 {
	 System.out.println( "getItemNames method started ");
	
	 for( int ind=0; ind<itemNames.length; ind++)
	 {
		 System.out.println( itemNames[ind]);
		 
	 }
	 System.out.println( "getItemNames method ended ");
	 return;
	 
	 
 }
 public static boolean updateItemName( String oldItemName, String updatedItemName)
 {
	 System.out.println( " updateItemName method started ");
	
	 boolean isUpdated = false;
	
	 for( int ind =0; ind < itemNames.length; ind++)
	 {
		 
		 if( itemNames[ind].equals(oldItemName))
		 {
			 itemNames[ind] = updatedItemName;
			 isUpdated = true;
		 }
	 }
	 System.out.println( " updateItemName method ended ");
			return  isUpdated ;
		 }
 }
		 
	 
	 
 




