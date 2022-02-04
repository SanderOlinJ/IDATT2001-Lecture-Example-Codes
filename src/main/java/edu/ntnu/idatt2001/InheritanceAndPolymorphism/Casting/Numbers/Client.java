package edu.ntnu.idatt2001.InheritanceAndPolymorphism.Casting.Numbers;
import static edu.ntnu.idatt2001.utilities.Out.*;

public class Client {

    public static void main(String[] args) {

        double div1 = 2/3;
        out(div1); //Prints 0.0, as the result of 2/3 = 0.667.
        // And since both 2 and 3 are integers, they will round down before assigning div1 the result,
        // which will now be 0.0

        double div2 = (double) 2/3;
        out(div2); //Prints 0.66666666... 2 now gets assigned to a double. Now the result will also be a double.
        //Problem solved :)

        double div3 = (double) (2/3);
        out(div3); //Prints 0.0 again. This time it is because double is only assigned after the 2 has been divided by 3
        // And since 2/3 is 0.667, and they are both integers, we get 0, which is then made a double "0.0".

        int i1 = (int) '0';
        out(i1); //Prints out the ASCII code to 0, which is 48.

        int i2 = '0';
        out(i2); //Prints out the ASCII code to 0 as well.
        // This means that the compiler understands, but it is better to be on the safe side.

        for (int i = 0; i < 10; i++){
            int j1 = (int) (Math.random() * 10) + 1;     //Casts a double to an int
            out(j1);
        }

        for (int i = 0; i < 10; i++){
            double j2 = Math.random()*10 + 1;            //In comparison
            out(j2);
        }
    }
}
