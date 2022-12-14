import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    //1) Citit un numar de la tastatura si stocati valoarea lui intr-o variabila.
    // Generati un numar random intre 1 si 100 si stocati acel numar intr-o alta variabila.
    // Daca numarul introdus de la tastatura este mai mic decat numarul random generat,
    // afisati mesajul “Numarul introdus este mai mic decat <numar_random>”
    // (inserati valoarea numarului random generat in textul afisat).

    public static void main(String[] args) {
       exercitiul1();
       //exercitiul2();
        //exercitiul3();
      // exercitiul4();
        //exercitiul5();
       // exercitiul7();
        //exercitiul8();
    }
    public static void exercitiul1() {
        System.out.println("Introduceti un numar de la tastatura  intre 1 si 100.");
        Scanner keyboard = new Scanner(System.in);
        int numarTastarura = keyboard.nextInt();
        int minVal = 1;
        int maxVal = 100;
        Random orice_Numar = new Random();
        int randomNum = orice_Numar.nextInt(maxVal-minVal)+minVal;
        System.out.println(randomNum);

        if (numarTastarura < randomNum) {
            System.out.println("Numarul introdus este mai mic decat <numar_random>:" + randomNum);
        }
    }


    //2) Citit un caracter si 2 numere de la tastatura, si stocati-le in variabile.
    // Folosind structura switch, daca s-a introdus un caracter anume,
    // realizati operatia respectiva cu cele 2 numere, si afisati rezultatul pe ecran:
    //-‘a’: adaugare
    //-‘s’: scadere
    //-‘i’: inmultire
    //-‘p’: impartire
    //-‘m’: modul
    //Daca nu s-a introdus un caracter valid, afisati un mesaj de eroare.

    public static void exercitiul2(){
        System.out.println("Introduceti primul numar de la tastatura:");
        Scanner scanner = new Scanner(System.in);
        double numar1= scanner.nextDouble();

        System.out.println("Introduceti al doilea numar de la tastatura:");
        double numar2= scanner.nextDouble();

        System.out.println("Introduceti un caracter de la tastatura:");
        Scanner scanner1=new Scanner(System.in);
        char caracter=scanner.next().charAt(0);

        double rezultatInmultire=inmultire(numar1,numar2);
        double rezultatAdaugare=adaugare(numar1,numar2);
        double rezultatScadere=scadere(numar1,numar2);
        double rezultatImpartire=impartire(numar1,numar2);
        double rezultatModul=modul((int) numar1,(int) numar2);

        System.out.println("Rezultatul‘i’este inmultire:"+rezultatInmultire);
        System.out.println("Rezultatul‘a’este adaugare:"+rezultatAdaugare);
        System.out.println("Rezultatul‘s’este scadere:"+rezultatScadere);
        System.out.println("Rezultatul‘p’este impartire:"+rezultatImpartire);
        System.out.println("Rezultatul‘m’este modul:"+rezultatModul);
        }

        public static double inmultire(double numar1, double numar2){
        double rezultat=numar1*numar2;
        return rezultat;
        }

        public static double adaugare(double numar1, double numar2){
        double rezultat=numar1+numar2;
        return rezultat;
        }

        public static double scadere(double numar1, double numar2){
        double rezultat=numar1-numar2;
        return rezultat;
        }

        public static double impartire(double numar1, double  numar2){
        double rezultat=numar1/numar2;
        return rezultat;
        }

        public static int modul(int numar1, int numar2){
        int rezultat=numar1%numar2;
        return rezultat;
        }

    //3).Definiti un array de 2 dimensiuni, fiecare dimensiune sa aiba cate 3, respectiv 5 elemente.
    // Initializati array-ul. Afisati primele si ultimele elemente din fiecare dimensiune pe ecran.
    public static void exercitiul3(){
    String bidimensional[][]=new String[3][5];

    bidimensional[0][0]="ana";
    bidimensional[0][1]="gina";
    bidimensional[0][2]="maria";
    bidimensional[0][3]="ioana";
    bidimensional[0][4]="roxana";
    bidimensional[1][0]="alin";
    bidimensional[1][1]="stefan";
    bidimensional[1][2]="cristi";
    bidimensional[1][3]="marius";
    bidimensional[1][4]="bogdan";
    bidimensional[2][0]="cosmin";
    bidimensional[2][1]="dana";
    bidimensional[2][2]="costel";
    bidimensional[2][3]="silviu";
    bidimensional[2][4]="george";

        System.out.println(bidimensional[0][0]);
        System.out.println(bidimensional[0][4]);
        System.out.println(bidimensional[1][0]);
        System.out.println(bidimensional[1][4]);
        System.out.println(bidimensional[2][0]);
        System.out.println(bidimensional[2][4]);
    }

    //4) Definiti un array de char-uri.
    // Iterati array-ul folosind structura for,
    // si afisati pe ecran cate al doilea caracter din sir.
    public static void exercitiul4() {
        char[] CharArray = new char[4];
        CharArray[0] = 'r';
        CharArray[1] = 's';
        CharArray[2] = 't';
        CharArray[3] = 'u';

        for (int i = 0; i<CharArray.length; i+=2) {
            System.out.println("Afisati pe ecran cate al doilea caracter din sir:" +CharArray[i]);
        }
    }

    //5).Definiti un array de double, cu valori zecimale.
    // Iterati array-ul folosind strutura for, si daca
    // un element este egal cu valoarea 4.5, afisati-l pe ecran.
    // Daca un element este mai mare decat 5,
    // afisati mesajul “Element peste 5”

//    public static void exercitiul5() {
//        double[] myarray = new double[3];
//        myarray[0] = 1.3;
//        myarray[1] = 4.5;
//        for (int j=0; j<3;j++) {
//            System.out.println(j);
//        }
//        if (myarray[]=4.5){
//            System.out.println(myarray);
//        }
//        else if (myarray[]>5){
//            System.out.println(myarray);
//        }
//    }

    public static void exercitiul7() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        int sum = 0;
        for (int i = 0; i < list.size(); i++)
            sum=sum+ list.get(i);
        System.out.println("Suma tuturor: " + sum);
    }

    public static void exercitiul8() {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(0);
        list.add(1);
        if (list.isEmpty()) {
            System.out.println("Lista este goala");
        } else {
            System.out.println("Lista nu este goala");
        }

        String[] casa=new String[3];
        casa[0]="fereastra";
        casa[1]="usa";
        casa[2]="pat";
        if (casa.length==0){
            System.out.println("Array este goala");
        }else{
            System.out.println("Array nu este goala");
        }
    }

}