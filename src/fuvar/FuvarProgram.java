/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuvar;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author gomzi
 */
public class FuvarProgram {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) throws IOException {
      List <String> sorok=Files.readAllLines(Paths.get("fuvar.csv"));
        ArrayList <Fuvar> fuvarok =new ArrayList<>();
        for (int i = 1; i < sorok.size(); i++) {
            fuvarok.add(new Fuvar(sorok.get(i)));
        }
      
     
        System.out.println("3. feladat"+ fuvarok.size()+ "fuvarok" );
        

        int db = 0;double osszeg = 0;
//        for (int i = 0; i < fuvarok.size(); i++) {
//            if(fuvar.getTaxi_id() == 6185){
//                db++;
//            }
//        }
        for (Fuvar fuvar : fuvarok) {
            if(fuvar.getTaxi_id() == 6185){
                db++;
                osszeg += fuvar.getViteldij()+ fuvar.getBorravalo();
            }
        }
        System.out.println("4. feladat: "+db+ " fuvar alatt: " + osszeg +"$");
       
//HaspMap 
HashMap<String,Integer>fizetesModok=new HashMap<>();
        for (int i = 0; i < fuvarok.size(); i++) {
            String kulcs= fuvarok.get(i).getFizetes_modja();
            if (!fizetesModok.containsKey(kulcs)) {
                fizetesModok.put(kulcs, 1);
            }else
            {
            int ertek =fizetesModok.get(kulcs);
            fizetesModok.put(kulcs, ++ertek);
            
            }
        }
        System.out.println("5. feladat: ");
        for (Map.Entry<String, Integer> entry : fizetesModok.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.printf("\t%10s: %4d fuvar\n",key,value); 
        }
        
        
        double osszmeg=0.0;
        for (Fuvar fuvar : fuvarok) {
            osszmeg+=fuvar.getTavolsag();
        }
        
        System.out.printf("6. feladat: %.2fkm\n",(osszmeg*1.6));
        System.out.println("8. feladat:"); 
        
        List<String> kiLista = new ArrayList<>();
        kiLista.add("nincs hiba");
        
        Files.write(Paths.get("hiba.txt"), kiLista);
        
    }
    
}
