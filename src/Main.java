/**
 * Created by davehochstrasser on 8/4/16.
 */
public class Main {
    public static void main(String[] args) {
        Skis skis = new Skis();

        skis.brand = "Rossingnol";
        skis.model = "Experience 108";
        skis.color = "black";
        skis.length = "182cm";
        skis.width = "108mm";

        Skis skis2 = new Skis();

        skis2.brand = "Icelantic";
        skis2.model = "Shakra Mons";
        skis2.color = "powder pink";
        skis2.length = "188cm";
        skis2.width = "112mm";

        String description =  skis.toString();
        String description =  skis2.toString();

        System.out.println(description);


    }

}


