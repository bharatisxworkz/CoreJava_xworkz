class Garage2{

static String workersName[] = { " Owner ", " Intern ", " Factory worker ", " Mechanic ", " Sales associate ", " Service berater "};

public static void main( String workers[])
{
System.out.println( " Main started ");
getWorkersName();
System.out.println( " Main ended ");
}
public static void getWorkersName(){
System.out.println( " workers in garage :");
System.out.println( " Callin of main method ");
for( int i=0; i< workersName.length; i++)
{
System.out.println( workersName[i]);
}
System.out.println( " End of main method ");



}







}