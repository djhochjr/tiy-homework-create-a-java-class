/**
 * Created by davehochstrasser on 8/4/16.
 */
public class Skis{
    String brand;
    String model;
    String color;
    String length;
    String width;

    // wrote class with 5 props

    public Skis (String brand, String model, String color, String length, String width) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.length = length;
        this.width = width;
        //constructor written with 5 args
    }
    public String toString(){
        String favoriteSki = "this ski is "+ this.brand + " "
               + "It's length is: " + this.length;
        return favoriteSki;
    }




    }







