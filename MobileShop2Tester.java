class MobileShop2Tester{

public static void main( String mobile[])
{
System.out.println( " Main started "); 
MobileShop.getMobileNames();

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
MobileShop.addMobileName( " Xiomi ");


MobileShop.getMobileNames();
System.out.println( " updated mobile name is");

		boolean isUpdated = MobileShop.updateMobileName( " Vivo ", " OnePlus ");

MobileShop.getMobileNames();
MobileShop.getMobileNames(" Oppo ");

System.out.println( " Main ended ");
}
}