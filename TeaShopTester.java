class TeaShopTester{

public static void main( String tea[])
{
System.out.println( " Main started ");
TeaShop.addTeaName( " Normal tea ");
TeaShop.addTeaName( " Lemon tea ");
TeaShop.addTeaName( " Black tea ");
TeaShop.addTeaName( " Chocolate tea ");
TeaShop.addTeaName( " Masala tea ");

TeaShop.getTeaNames();
boolean isUpdated = TeaShop.updateTeaName( " Masala tea ", " Ginger Masala tea");
System.out.println( " is tea name is updated :" + isUpdated);
TeaShop.getTeaNames();

System.out.println( " Main ended ");
}
}