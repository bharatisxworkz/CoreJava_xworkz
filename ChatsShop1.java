class ChatsShop1{
static String chatsNames[] = { " Pani puri ", " Masala puri ", " Sev puri ", " Samosa chat ", " Dhahi puri ", " Bhel puri ", " Papad masala "};

public static void main( String chats[]){
System.out.println( " Main started ");
getChatsNames();
System.out.println( " Main ended ");
}
public static void getChatsNames()
{
System.out.println( " Calling of main method ");
System.out.println( " names of chats :");
for( int i=0; i<chatsNames.length; i++)
{
System.out.println( chatsNames[i]);
}
System.out.println( " End of main method ");
}







}