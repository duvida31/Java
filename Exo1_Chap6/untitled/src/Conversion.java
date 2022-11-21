import java.util.Scanner;

public class Conversion {
    private String resultString;
    Scanner scan = new Scanner(System.in);
    private int results[];
    private double resultsSize;
    public Conversion   ()
    {
        results = new int[100];
    }
    public void displayWelcome()
    {
        int choix;
        double nombre;
        System.out.println("Voulez-vous cobvertir en binaire(1) ou hexadecimal(2) ");
        choix = scan.nextInt();
        System.out.println("Quel nombre?");
        nombre = scan.nextDouble();

        if(choix==1)
        {
            resultsSize = decBin(nombre);
        }
        else if(choix==2)
        {
            decHex(nombre);
        }

    }
    public double decBin(double nombre)
    {
        if (nombre == 0)
        {
            results[0] = 0;
            return 1;
        }
        double exp = 0;
        //Comptage de l'exposant le plus grand se trouvant a l'intérieur de nombre
        while (Math.pow(2,exp)<nombre)
        {
            exp ++;
        }
        if(Math.pow(2,exp) > nombre)
        {
            exp--;
        }
        double cpt = exp;
        for(int i =0; i<cpt+1;i++)
        {
            if(Math.pow(2,exp) <= nombre) //si l'exposant de 2 se trouve dans le nombre on met 1 et on soustrait cet exposant au nombre
            {
                results[i] = 1;
                nombre -= Math.pow(2,exp);
            }
            else
            {
                results[i] = 0; //sinon on met 0
            }
            exp--;
        }
       /* for(int i=0; i<cpt+1;i++)
        System.out.println(results[i]); */
        return cpt+1;
    }
    public void decHex(double nombre)
    {
        double exp = 0;
        if(nombre ==0)
        {
            resultString = "0";
            return;
        }
        //Comptage de l'exposant le plus grand se trouvant a l'intérieur de nombre
        while (Math.pow(16,exp)<nombre)
        {
            exp ++;
        }
        if(Math.pow(16,exp) > nombre)
        {
            exp--;
        }
        double cpt=exp;
        for(int i=0;i<cpt+1;i++)
        {
            for(int j=0;j<17;j++) //compte le nombre d'occurences de l'exposant à l'intérieur du nombre
            {
                if((Math.pow(16,exp))*j > nombre)
                {
                    if(j==0) //si l'exposant ne se trouve pas dans le nombre alors valeur de celui-ci en hexa est 0
                    {
                        resultString = resultString.concat("0");
                        break;
                    }
                    if(i==0) //si c'est le premier char de notre string alors on initialise celui-ci
                    {
                        switch(j)
                        {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                resultString = String.valueOf(j-1);
                                break;
                            case 11:
                                resultString = "A";
                                break;
                            case 12:
                                resultString = "B";
                                break;
                            case 13:
                                resultString = "C";
                                break;
                            case 14:
                                resultString = "D";
                                break;
                            case 15:
                                resultString = "E";
                                break;
                            case 16 :
                                resultString ="F";
                                break;
                        }
                    }
                    else
                    {
                        switch(j)
                        {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                resultString = resultString.concat(String.valueOf(j-1));
                                break;
                            case 11:
                                resultString = resultString.concat("A");
                                break;
                            case 12:
                                resultString = resultString.concat("B");
                                break;
                            case 13:
                                resultString = resultString.concat("C");
                                break;
                            case 14:
                                resultString = resultString.concat("D");
                                break;
                            case 15:
                                resultString = resultString.concat("E");
                                break;
                            case 16 :
                                resultString = resultString.concat("F");
                                break;
                        }
                    }
                    nombre -= ( Math.pow(16,exp))*(j-1);
                    break;
                }
            }
            exp--;
        }
    }
    public void displayResults()
    {
        if (resultString == null)
        {
            for(int i=0;i<resultsSize;i++)
            {
                System. out.print(results[i]);
            }
        }
        else
        {
            System.out.println(resultString);
        }
    }
}
