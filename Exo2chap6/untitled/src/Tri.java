public class Tri {
    public static int max;
    public int getMax(int nbr1, int nbr2)
    {
        System.out.println(nbr1+" / "+nbr2);
        if(nbr1<nbr2)
        {
            return nbr2;
        }
        else
        {
            return nbr1;
        }
    }
    public int getMax(int nbr1, int nbr2,int nbr3)
    {
        return getMax(getMax(nbr1,nbr2),nbr3);
    }
    public int getMax(int nbr1, int nbr2,int nbr3, int nbr4)
    {
        return getMax(getMax(nbr1,nbr2,nbr3),nbr4);
    }
    public int getMax(int nbr1, int nbr2, int nbr3, int nbr4, int nbr5)
    {
        return  getMax(getMax(nbr1,nbr2,nbr3,nbr4),nbr5);
    }
}
