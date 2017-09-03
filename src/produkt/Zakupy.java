/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produkt;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import static produkt.Koszyk.getIlosci;



/**
 *
 * @author Karola
 */
public class Zakupy {
  /*
    public static List<Produkt> getList(InputStream is){
    
    List<Produkt> products = new ArrayList<>();
    
        Scanner scanner = new Scanner(is);
        System.out.println("Podaj ilosc asortymentu");
        int x = scanner.nextInt();
        
        for( int i = 0; i < x; i++){
            
            System.out.println("Podaj nazwe produktu");
            String n = scanner.next();
            
            System.out.println("Podaj cene produktu");
            double c = scanner.nextDouble();
            
            System.out.println("Podaj dostepna ilosc produktow");
            double il = scanner.nextDouble();
    
            products.add(new Produkt(n, c, il));
        
        }
    return products;    
}*/
    
   
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

        