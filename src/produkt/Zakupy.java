/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produkt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static produkt.Koszyk.getIlosci;
import produkt.Produkt.Gruszki;
import produkt.Produkt.Herbata;
import produkt.Produkt.Jablka;
import produkt.Produkt.Kawa;
import produkt.Produkt.Mleko;
import static produkt.Produkt.obiekty;
import static produkt.Produkt.p;



/**
 *
 * @author Karola
 */
public class Zakupy {
    static List<Produkt> products = new ArrayList<Produkt>();
    static{
        products.add(new Mleko("Mleko"));
        products.add(new Kawa("Kawa"));
        products.add(new Herbata("Herbata"));
        products.add(new Jablka("Jablka"));
        products.add(new Gruszki("Gruszki"));
    }
    
    
    public static Map<Double, Double> getZakupy(){
        
        Map<String, Double> ilosc = getIlosci(System.in);
        
        double mleko = ilosc.get("Ilosc Mleka");
        double kawa = ilosc.get("Ilosc Kawy");
        double herbata = ilosc.get("Ilosc Herbaty");
        double jablka = ilosc.get("Ilosc Jablek");
        double gruszki = ilosc.get("Ilosc Gruszek");
        
        Map<Double, Double> zakupy = new HashMap<>();
        
        zakupy.put(mleko, p.getCena());
        zakupy.put(kawa, p1.getCena());
        zakupy.put(herbata, p2.getCena());
        zakupy.put(jablka, p3.getCena());
        zakupy.put(gruszki, p4.getCena());
        
        return zakupy;
    }
}

        