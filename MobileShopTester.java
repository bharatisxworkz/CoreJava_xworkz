class MobileShopTester{

public static void main( String mobile[])
{
System.out.println( " Main started "); 
System.out.println( " mobile names added ");


MobileShop.addMobileName( " Vivo ");
MobileShop.addMobileName( " Oppo ");
MobileShop.addMobileName( " Samsung ");
MobileShop.addMobileName( " realme ");
MobileShop.addMobileName( " NOKIA ");
MobileShop.addMobileName( " Micromax ");
MobileShop.addMobileName( " Lava ");
MobileShop.addMobileName( " Lenovo ");
MobileShop.addMobileName( " Apple ");
MobileShop.addMobileName( " Motorola ");

MobileShop.getMobileNames();
System.out.println( " updated mobile name is: ");

		boolean isUpdated = MobileShop.updateMobileName( " Vivo ", " OnePlus ");
System.out.println( " is mobile name is updated :" + isUpdated);
MobileShop.getMobileNames();

System.out.println( " Main ended ");
}
}