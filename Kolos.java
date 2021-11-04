import java.util.Scanner;

public class Kolos
{
    public static void main(String[] args)
    {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Wprowadz liczbe naturalna n: ");
//        int n = scan.nextInt();
//        int [] tab = new int[n];
//        int [] tab2 = new int[n];
//        int licznik = 0;
//        for (int i=0;i<n;i++)
//        {
//            System.out.print("Wprowadz liczbe: ");
//            tab[i] = scan.nextInt();
//            for(int j=1;j<=i;j++)
//            {
//                if(tab[i]>2)
//                {
//                    if(tab[i]%j==0)
//                    {
//                        licznik=licznik+1;
//                    }
//                }
//
//            }
//            if(licznik<=2)
//            {
//                System.out.println(tab[i]);
//            }
//            licznik=0;
//
//        }


//        for(int i=0;i<n;i++)
//        {
//            System.out.print(tab[i]+", ");
//        }





        //Ilosc wystapien znaku w napisie
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadz napis: ");
        String napis = scan.nextLine();
        System.out.println("Wprowadz znak: ");
        char c = scan.next().charAt(0);
        System.out.println(countChar(napis,c));

    }
    static int countChar(String napis, char c)
    {
        int licznik=0;
        for(int i=0;i<napis.length();i++)
        {
            if(napis.charAt(i)==c)
            {
                licznik++;
            }
        }
        return licznik;
    }




    }

