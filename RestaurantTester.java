class RestaurantTester{

public static void main( String menu[])
{
System.out.println( " Main started ");
Restaurant.getItemNames();

Restaurant.addItemName( " Rried rice ");
Restaurant.addItemName( " Gobi rice ");
Restaurant.addItemName( " Bisibele bath ");
Restaurant.addItemName( " Veg pulav ");
Restaurant.addItemName( " Veg biryani ");
Restaurant.addItemName( " Chicken biryani ");
Restaurant.addItemName( " Tomato soup ");
Restaurant.addItemName( " Masala dosa ");
Restaurant.addItemName( " Idly ");
Restaurant.addItemName( " Curd vada ");
Restaurant.addItemName( " Puri ");
Restaurant.addItemName( " Motton biryani ");
Restaurant.addItemName( " chicken rolls ");
Restaurant.addItemName( " Fish curry ");
Restaurant.addItemName( " Puliogare ");
Restaurant.addItemName( " Curd rice ");


Restaurant.getItemNames();
System.out.println( " updated item name is : ");

		boolean isUpdated = Restaurant.updateItemName( " Masala dosa ", " Rava Masala dosa ");
Restaurant.getItemNames();

System.out.println( " Main ended ");
}
}