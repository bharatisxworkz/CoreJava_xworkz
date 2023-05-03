class OrionMallTester{

public static void main( String shop[])
{
System.out.println( " Main started "); 
OrionMall.getShopNames();


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
OrionMall.addShopName( " Dominos pizza ");


OrionMall.getShopNames();
System.out.println( " updated shop name is: ");

		boolean isUpdated = OrionMall.updateShopName( " Adidas ", " Nykaa ");
OrionMall.getShopNames();

System.out.println( " Main ended ");
}
}