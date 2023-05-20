package encapsulation;
import java.util.Scanner;

public class CountryTester {
    public static void main( String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter country Id ");
        int Id= sc.nextInt();
        System.out.println(" enter country code ");
        int countryCode= sc.nextInt();
        System.out.println(" enter country name ");
        String countryName= sc.next();
        System.out.println(" enter number of states in country ");
        int noOfStates= sc.nextInt();
        System.out.println(" enter population ");
        String population= sc.next();
        System.out.println(" enter currency ");
        String currency= sc.next();
        System.out.println(" enter capital  ");
        String capital= sc.next();
        System.out.println(" enter country economy ");
        String economy= sc.next();

        Country country= new Country();
        country.setId(Id);
        country.setCountryCode(countryCode);
        country.setCountryName(countryName);
        country.setNoOfStates(noOfStates);
        country.setPopulation(population);
        country.setCurrency(currency);
        country.setCapital(capital);
        country.setEconomy(economy);

        System.out.println("Id:"+country.getId()+"\n"+"country code :"+ country.getCountryCode()+"\n"+"name: "+ country.getCountryName()+"\n"+"number of states :"+ country.getNoOfStates()+"\n"+"population:"+ country.getPopulation()+"\n"+"currency:"+ country.getCurrency()+"\n"+"capital:"+ country.getCapital()+"\n"+"economy:"+country.getEconomy());

    }
}
