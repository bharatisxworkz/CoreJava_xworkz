class OrionMall{
static String shopNames[] = { "null","null","null","null","null","null","null","null","null","null","null","null","null","null","null"};
static int index;

public static boolean addShopName( String shopName){
	System.out.println( " addShopName method started  ");
	
boolean isAdded = false;
 
 if( shopName != null )
 {
	 
 shopNames[index++] = shopName;
 isAdded = true;
 
 
 }
 else {
	 System.out.println( " shop name is null ");
 }
 System.out.println( " addShopName method ended ");
 return isAdded;
 }
 public static void getShopNames()
 {
	 System.out.println( "getShopNames method started ");
	
	 for( int ind=0; ind<shopNames.length; ind++)
	 {
		 System.out.println( shopNames[ind]);
		 
	 }
	 System.out.println( "getShopNames method ended ");
	 return ;
	 
 }
 public static boolean updateShopName( String oldShopName, String updatedShopName)
 {
	 System.out.println( " updateShopName method started ");
	
	 boolean isUpdated = false;
	
	 for( int ind =0; ind < shopNames.length; ind++)
	 {
		 
		 if( shopNames[ind].equals(oldShopName))
		 {
			 shopNames[ind] = updatedShopName;
			 isUpdated = true;
		 }
	 }
	 System.out.println( " updateShopName method ended ");
			return  isUpdated ;
		 }
 }
		 
	 
	 
 




