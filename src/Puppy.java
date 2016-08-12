/**
 * Created by davehochstrasser on 8/4/16.
 */
public class Puppy {

    int puppyAge;
    String puppyColor;
    int puppySize;
    int puppyWeight;
    String puppyName;
    Boolean isCute;

    public Puppy(int puppyAge, String puppyColor, int puppySize, int puppyWeight, String puppyName, Boolean isCute) {
        // This constructor has 6 parameters, name.
        this.puppyAge = puppyAge;
        this.puppyWeight = puppyAge;
        this.puppyColor = puppyColor;
        this.puppySize = puppySize;
        this.puppyName = puppyName;
        this.isCute = isCute;}


  //      System.out.println("Name chosen is :" + puppyName);
  //  }

    public void setAge(int age) {
        puppyAge = age;
    }

    public void setWeight(int weight) {
        puppyWeight = weight;
    }

    public void setPuppySize(int size) {
        puppySize = size;
    }

    public void setCute(Boolean cute) {
        isCute = cute;
    }

    public void setPuppyColor(String color) {
        puppyColor = color;
    }

   // public int getAge() {
   //     System.out.println("Puppy's age is :" + puppyAge);
   //     return puppyAge;


    public String toString() {
        return "My " + puppyColor + "puppy " + puppyName + " weighs " +
                puppyWeight + " lbs and stands " + puppySize +
                " inches tall";

    }


}
















