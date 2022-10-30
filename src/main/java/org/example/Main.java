package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int x=1;
        Scanner ulaz=new Scanner(System.in);
        ArrayList<Double> lista=new ArrayList<>();

        while(x==1) {
            System.out.println("Unesite broj: ");
            if(ulaz.hasNextDouble()){
                lista.add(ulaz.nextDouble()); continue;
            }
            if(ulaz.next().equalsIgnoreCase("stop")) break;
        }
        double min= Collections.min(lista),max=Collections.max(lista),srednja_vrijednost=0,standardna_devijacija=0;
        for(double broj : lista){
            srednja_vrijednost=srednja_vrijednost+broj;
        }
        srednja_vrijednost=srednja_vrijednost / lista.size();
        for(double broj : lista){
            standardna_devijacija=standardna_devijacija+Math.pow(broj-srednja_vrijednost,2);
        }
        standardna_devijacija=standardna_devijacija/(lista.size()-1);
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
        System.out.println("Srednja vrijednost: "+srednja_vrijednost);
        System.out.println("Standardna devijacija: "+standardna_devijacija);
    }
}