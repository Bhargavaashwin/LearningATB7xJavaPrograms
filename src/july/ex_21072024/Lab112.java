package july.ex_21072024;

public class Lab112 {
    public static void main(String[] args) {
        final boolean b1 = true;
        // b1 = false; final this is fixed now
        //        for (int i=0;b1;i++)   ---> here no condition so infinite loop
        //        {
        //            System.out.println("Hello");
        //        }

        //        for (int i=0;;)   --> here no condition so infinite loop
        //        {
        //            System.out.println("Hello");
        //        }

        //        for (;;)   --> here no condition so infinite loop
        //        {
        //            System.out.println("Hello");
        //        }
        for (float f = 0.0f; f < 10.67; f++) {
            System.out.println("Hi,Float -> " + f);
            //here it takes as float values such as 0.0, 1.0, 2.0
        }

        for (byte f = 0; f < 10.67; f++) {
            System.out.println("Hi,Float -> " + f);
            //here it takes as byte, 10.67 is rounded to 11 so it takes 1 to 10
        }

    }
}

