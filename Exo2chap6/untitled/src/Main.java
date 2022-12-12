import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
         int  it;
         int nbrParamNumber;
         int max;
         it = displayWelcome();
        for(int i=0;i<it;i++)
        {
            nbrParamNumber = displayParamNumber();
            max=generateParams(nbrParamNumber);
            displayResult(i+1,max);
        }
        displayEnd();
    }
    public static int displayWelcome()
    {
            System.out.println("Introduire un nombre entre 5 et 10");
            Scanner clavier = new Scanner(System.in);
            int iteration = clavier.nextInt();
            return iteration;
    }
    public static int displayParamNumber()
    {
        System.out.println("Introduire un nombre de paramètres entre 2 et 5 :");
        Scanner clavier = new Scanner(System.in);
        int nbrParam = clavier.nextInt();
        return nbrParam;
    }
    public static int generateParams(int nbrparam)
    {
        Tri t = new Tri();
        int max =0;
        switch (nbrparam)
        {
            case 2 :
               max = t.getMax((int)(Math.random()*100),(int)(Math.random()*100));
            break;
            case 3:
               max = t.getMax((int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100));
                break;
            case 4:
               max = t.getMax((int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100));
                break;
            case 5:
               max = t.getMax((int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100));
                break;
        }
        Tri.max = t.getMax(Tri.max,max);
        return Tri.max;
    }
    public static void displayResult(int i,int nbr)
    {
        System.out.println("lors de l'itteration  "+i+" le max est "+nbr);
    }
    public static void displayEnd()
    {
        System.out.println("Fin de programme de tri");
    }
}
