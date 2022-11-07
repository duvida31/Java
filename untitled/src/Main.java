import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        //Declarations
       float[] cotes = new float[100];
       float coteAverage = 0;
       int i =0;
       boolean fini = true;
       //Algo start
       while (fini)
       {
           System.out.println("Enter the cote ");
           cotes[i] =  console.nextFloat();
           coteAverage += cotes[i];
           i++;
           System.out.println("Do you wanna enter an other cote (true or false)");
           fini = console.nextBoolean();

       }
       coteAverage /= (i); //Calculate the cotes average
       System.out.print("The average cote is " + coteAverage);
    }
}