/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produkt;

import java.io.InputStream;
//import java.util.HashMap;
//import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Karola
 */
public class Koszyk {
    
    
    
     
        public Koszyk(InputStream is){ //Map<String, Double> getIlosci(InputStream is)
            
            Scanner scanner = new Scanner(is);
       
            System.out.println("Podaj ilość mleka: ");
            double mlekoIlosc = scanner.nextDouble();
            System.out.println("Podaj ilość kawy: ");
            double kawaIlosc = scanner.nextDouble();
            System.out.println("Podaj ilość herbaty: ");
            double herbataIlosc = scanner.nextDouble();
            System.out.println("Podaj ilość jablek: ");
            double jablkaIlosc = scanner.nextDouble();
            System.out.println("Podaj ilość gruszek: ");
            double gruszkiIlosc = scanner.nextDouble();
            /*
            Map<String, Double> ilosci = new HashMap<>();
            
            ilosci.put("Ilosc Mleka", mlekoIlosc);
            ilosci.put("Ilosc Kawy", kawaIlosc);
            ilosci.put("Ilosc Herbaty", herbataIlosc);
            ilosci.put("Ilosc Jablek", jablkaIlosc);
            ilosci.put("Ilosc Gruszek", gruszkiIlosc);
            
            return ilosci;
        }*/
}
