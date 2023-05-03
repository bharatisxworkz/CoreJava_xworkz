class MobileShop{
static String mobileNames[] = { "null","null","null","null","null","null","null","null","null","null"};
static int index;

public static boolean addMobileName( String mobileName){
	System.out.println( " addMobileName method started  ");
	
boolean isAdded = false;
 
 if( mobileName != null && index<mobileNames.length )
 {
	 
 mobileNames[index++] = mobileName;
 isAdded = true;
 
 
 }
 else {
	 System.out.println( " Max size reached... ");
 }
 System.out.println( " addMobileName method ended ");
 return isAdded;
 }
 public static void getMobileNames()
 {
	 System.out.println( "getMobileNames method started ");
	
	 for( int ind=0; ind<mobileNames.length; ind++)
	 {
		 System.out.println( mobileNames[ind]);
		 
	 }
	 System.out.println( "getMobileNames method ended ");
	 return;
	 
	 
 }
 public static boolean updateMobileName( String oldMobileName, String updatedMobileName)
 {
	 System.out.println( " updateMobileName method started ");
	
	 boolean isUpdated = false;
	
	 for( int ind =0; ind < mobileNames.length; ind++)
	 {
		 
		 if( mobileNames[ind].equals(oldMobileName))
		 {
			 mobileNames[ind] = updatedMobileName;
			 isUpdated = true;
		 }
	 }
	 System.out.println( " updateMobileName method ended ");
			return  isUpdated ;
		 }
		 public static String getMobileName( String mobileName)
		 {
			 for( int in = 0; in<mobileNames.length; in++)
			 {
				 if( mobileNames[in].equals(mobileName))
					System.out.println( " mobile name is found");
                  return mobileNames[in];				
				 
			 }
			 return " mobile name is not found ";
			 
 }
}
		 
	 
	 
 




