class OrionMallTester{

public static void main( String shop[])
{
System.out.println( " Main started "); 
System.out.println( " shop names are added ");


OrionMall.addShopName( " Trends ");
OrionMall.addShopName( " Fastrack ");
OrionMall.addShopName( " Levis ");
OrionMall.addShopName( " Pizza hut ");
OrionMall.addShopName( " Wrogn ");
OrionMall.addShopName( " Rajastani thali ");
OrionMall.addShopName( " Nike ");
OrionMall.addShopName( " Adidas ");
OrionMall.addShopName( " Reebok ");
OrionMall.addShopName( " Bull geans ");
OrionMall.addShopName( " Puma ");
OrionMall.addShopName( " Lens kart ");
OrionMall.addShopName( " Bata ");
OrionMall.addShopName( " Melorra ");
OrionMall.addShopName( " Max ");

OrionMall.getShopNames();
System.out.println( " updated shop name is: ");

		boolean isUpdated = OrionMall.updateShopName( " Adidas ", " Nykaa ");
System.out.println( " is shop name is updated :" + isUpdated);
OrionMall.getShopNames();

System.out.println( " Main ended ");
}
}