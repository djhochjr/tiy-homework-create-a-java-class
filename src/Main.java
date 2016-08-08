/**
 * Created by davehochstrasser on 8/4/16.
 */
public class Main {
    public static void main(String[] args) {
        boolean powderDay=true;


        Skis skis = new Skis("Rossignol", "Exreience 08", "Black","182", "108" );
        Skis skis2 = new Skis("Icelantic", "Shakra", "Powder Pink", "188", "112");

        if (powderDay){
            System.out.println("It's snowing ");
            System.out.println("I'll use my " + skis2.brand +" " +skis2.model +"'s");


        }
        else{
            System.out.println("It's sunny ");
            System.out.println("I'll use my " + skis.brand + " " + skis.length);

        }
            System.out.println( skis2);
            System.out.println( skis);














    }

}


