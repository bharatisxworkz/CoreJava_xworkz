class Restaurant{
static String itemNames[] = { "null","null","null","null","null","null","null","null","null","null","null","null","null","null","null"};
static int index;

public static boolean addItemName( String itemName){
	System.out.println( " calling addItemName ");
	
boolean isAdded = false;
 
 if( itemName != null  && index<itemNames.length )
 {
	 
 itemNames[index++] = itemName;
 isAdded = true;
 
 
 }
 else {
	 System.out.println( " Oops...housefull ");
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
		 public static String getItemName( String itemName)
		 {
			 for( int in = 0; in<itemNames.length; in++)
			 {
				 if( itemNames[in].equals(itemName))
					System.out.println( " item name is found");
                  return itemNames[in];				
				 
			 }
			 return " Item name is not found ";
			 
		 }
 }
		 
	 
	 
 




