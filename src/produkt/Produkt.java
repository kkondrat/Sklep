/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produkt;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
//import static produkt.Koszyk.getIlosci;


/**
 *
 * @author Karola
 */
public class Produkt {

       
    private static String nazwa;
    private static double cena;
    private static double ilosc;
    
    public Produkt (String nazwa, double cena, double ilosc){
        this.nazwa = nazwa;
        this.cena = cena;
        this.ilosc = ilosc;
    }
    
    public String getNazwa(){
        return nazwa;
    }
    
    public double getCena(){
        return cena;
    }
    
    public double getDostepnaIlosc(){
        return ilosc;
    }
    
    public double getIloscDoKoszyka(){
        System.out.println("-Podaj ilość produktow do koszyka");
        return kupione(System.in);
    }
    
     
    /*
    public static class Mleko extends Produkt{
        public  Mleko ( String nazwa, double cena, double ilosc){
            super(nazwa, cena, ilosc);
            
        }
    
    }    
    
    public static class Kawa extends Produkt{
        public Kawa (String nazwa, double cena, double ilosc){
            super(nazwa, cena, ilosc);
            super.getCena();
            super.getNazwa();
            super.getDostepnaIlosc();
        }
    
    }
    
    public static class Herbata extends Produkt{
        public Herbata (String nazwa, double cena, double ilosc){
            super(nazwa, cena, ilosc);
            super.getCena();
            super.getNazwa();
            super.getDostepnaIlosc();
        }
    
    }
    
    public static class Jablka extends Produkt{
        public Jablka (String nazwa, double cena, double ilosc){
            super(nazwa, cena, ilosc);
            super.getCena();
            super.getNazwa();
            super.getDostepnaIlosc();
        }
    
    }
    
    public static class Gruszki extends Produkt{
        public Gruszki (String nazwa, double cena, double ilosc){
            super(nazwa, cena, ilosc);
            super.getCena();
            super.getNazwa();
            super.getDostepnaIlosc();
        }
    
    }
 */
    //static Object p = null;
    
    
    
    
    
    public static List<Produkt> getProdukt(){
        List<Produkt> products = new ArrayList<>();
        
        products.add(new Produkt("Mleko", 1.50, 20));
        
        products.add(new Produkt("Kawa", 16.7, 10));
        
        products.add(new Produkt("Herbata", 5.50, 2));
        
        products.add(new Produkt("Jablka", 2.2, 10.5));
        
        products.add(new Produkt("Gruszki", 3.50, 4));
            
        return products;
    }
    
     static List<Produkt> IloscProduktow = getProdukt();
    
    public static void main(String[] args) {
       
        double price = 0;
        
        System.out.println(IloscProduktow.get(1).getNazwa());
        System.out.println(IloscProduktow.get(2).getNazwa());
        System.out.println(IloscProduktow.get(3).getNazwa());
        
        for (Produkt prod : IloscProduktow){
            System.out.print(prod.getNazwa());
            price += prod.getCena() * prod.getIloscDoKoszyka();
        }
        
        //System.out.println(price);
        //Map<String, Double> ilosciProduktow = getIlosci(System.in);
    }
    
    
//    
//    long KwotaDoZaplaty = 0;
//    
//    public static long CenaDoZaplaty(){      
//          Map<Double, Double> ilo = getZakupy(int/ p);
//    
//    
//          for (Map.entry<Double, Double> entry : getZakupy.entrySet()){
//              KwotaDoZaplaty += entry.getKey() * entry.getValue();
//          }
//            return "Do zapłaty: " + KwotaDoZaplaty;
//    }

    private double kupione(InputStream is) {
        Scanner n = new Scanner(is);
        double kupionaIlosc = n.nextDouble();
        return kupionaIlosc;
    }
    
    

    
    
 }
