/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produkt;

import java.util.Map;
import static produkt.Koszyk.getIlosci;

/**
 *
 * @author Karola
 */
public class Produkt {

    private String nazwa;
    
    public Produkt (String nazwa){
        this.nazwa = nazwa;
    }
    
    public String getNazwa(){
        return nazwa;
    }
    
    public double getCena(){
        return 0;
    }
    
    public double getDostepnaIlosc(){
        return 10;
    }
    
    public static class Mleko extends Produkt{
        public  Mleko (String nazwa){
            super(nazwa);
        }
    
        @Override
        public double getCena(){
            return 1.68;
        }
        
        @Override
        public double getDostepnaIlosc(){
            return 8;
        }
    }    
    
    public static class Kawa extends Produkt{
        public Kawa (String nazwa){
            super(nazwa);
        }
    
        @Override
        public double getCena(){
            return 14.55;
        }
    
        @Override
        public double getDostepnaIlosc(){
            return 6;
        }
    }
    
    public static class Herbata extends Produkt{
        public Herbata (String nazwa){
            super(nazwa);
        }
    
        @Override
        public double getCena(){
            return 4.55;
        }
    
        @Override
        public double getDostepnaIlosc(){
            return 12;
        }
    }
    
    public static class Jablka extends Produkt{
        public Jablka (String nazwa){
            super(nazwa);
        }
    
        @Override
        public double getCena(){
            return 3.99;
        }
    
        @Override
        public double getDostepnaIlosc(){
            return 1;
        }
    }
    
    public static class Gruszki extends Produkt{
        public Gruszki (String nazwa){
            super(nazwa);
        }
    
        @Override
        public double getCena(){
            return 4.99;
        }
    
        @Override
        public double getDostepnaIlosc(){
            return 2;
        }
    }
 
    static Object p = null;
    
    public static void main(String[] args) {
        obiekty();
    }
    
    
    public static void obiekty(){
        Produkt p = new Mleko("Mleko");
        System.out.println("Cena " +p.getNazwa() + " wynosi: " + p.getCena() + " dostepna ilosc: " + p.getDostepnaIlosc());
        
        Produkt p1 = new Kawa("Kawa");
        System.out.println("Cena " +p1.getNazwa() + " wynosi: " + p1.getCena() + " dostepna ilosc: " + p1.getDostepnaIlosc());

        Produkt p2 = new Herbata("Herbata");
        System.out.println("Cena " +p2.getNazwa() + " wynosi: " + p2.getCena() + " dostepna ilosc: " + p2.getDostepnaIlosc());

        Produkt p3 = new Jablka("Jablka");
        System.out.println("Cena " +p3.getNazwa() + " wynosi: " + p3.getCena() + " dostepna ilosc: " + p3.getDostepnaIlosc());

        Produkt p4 = new Gruszki("Gruszki");
        System.out.println("Cena " +p4.getNazwa() + " wynosi: " + p4.getCena() + " dostepna ilosc: " + p4.getDostepnaIlosc());
        
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
    
    
}
