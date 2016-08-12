/**
 * Created by davehochstrasser on 8/12/16.
 */
public class Main {
    public static void main(String[] args) {
      /* Object creation */
        Puppy myPuppy = new Puppy(2, "brown ", 45, 18, "Bob", true);
        Puppy myOtherPuppy = new Puppy(3, "spotted ", 36, 13, "Tranny ", false);

      /* Call class method to set puppy's age */
       /* myPuppy.setAge(1);

      /* Call another class method to get puppy's age */

       /*myPuppy.getAge(2);

      /* You can access instance variable as follows as well */
        //System.out.println("Variable Value :" + myPuppy.puppyAge);
        if (myPuppy.isCute == true) {
            System.out.println(myPuppy);
        }
        if (myOtherPuppy.isCute == true) {
            System.out.println(myOtherPuppy);

        }
    }
}
