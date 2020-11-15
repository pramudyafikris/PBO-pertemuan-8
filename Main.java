package com.pboreg;

import java.util.Scanner;

abstract class Luas {
    Scanner userInput = new Scanner(System.in);
    public abstract double menghitungluas();
    public abstract void Input();
}
class SegiTiga extends Luas {
    double LuasSegitiga, AlasSegitiga, TinggiSegitiga;
    public  double menghitungluas(){
        LuasSegitiga = ((double)1/2) * AlasSegitiga * TinggiSegitiga;
        return LuasSegitiga;
    }

    public void Input(){
        System.out.println("Menghitung Luas Segitiga");
        System.out.println("                           ");
        System.out.println("Luas Segitiga");
        System.out.print("Alas Segitiga   =   ");
        AlasSegitiga = userInput.nextDouble();
        System.out.print("Tinggi Segitiga =   ");
        TinggiSegitiga = userInput.nextDouble();
        System.out.println("                           ");

    }
}

class Lingkaran extends Luas {
    double LuasLingkaran, Jarijarilingkaran, DiameterLingkaran;

    public double menghitungluas(){
        Jarijarilingkaran = DiameterLingkaran / 2;
        LuasLingkaran = (3.14) * Jarijarilingkaran * Jarijarilingkaran;
        return LuasLingkaran;
    }

    public  void Input() {
        System.out.println("Menghitung Luas Lingkaran");
        System.out.print("Diameter Lingkaran : ");
        DiameterLingkaran = userInput.nextDouble();
        System.out.println("                                   ");
    }
}

public class Main{
    public static void main(String[] args){
        SegiTiga segitiga = new SegiTiga();
        segitiga.Input();
        System.out.println("Hasil dari Luas Segitiga : " + segitiga.menghitungluas());
        System.out.println("                                   ");

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.Input();
        System.out.println("Hasil dari Luas Lingkaran : " + lingkaran.menghitungluas());
        System.out.println("                                   ");
    }
}