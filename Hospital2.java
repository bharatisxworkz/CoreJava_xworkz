class Hospital2{
static String specialistNames[] = { " Oncologist ", " Gastroenterologist ", " Pulmonologist ", " Nephrologist ", " Endocrinologist ", " Ophthalmologist ", " Dermatologist ", " Psychiatrist ", " Neurologist "};

public static void main( String specialists[])
{
System.out.println( " Main started ");
getSpecialistNames();
System.out.println( " Main ended ");

public static void getSpecialistNames(){
System.out.println(" Calling of main method ");
System.out.println( " names of specialists:");
for( int i=0; i<specialistNames.length; i++)
{
System.out.println( specialistNames[i]);

}
System.out.println( " end of main method ");
}







}