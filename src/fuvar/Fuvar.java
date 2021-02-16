/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuvar;

import javax.print.DocFlavor;

/**
 *
 * @author gomzi
 */
public class Fuvar {
  //  taxi_id;indulas;idotartam;tavolsag;viteldij;borravalo;fizetes_modja
    
    private int taxi_id;
   private String indulas;
   private int idotartam;
   private double tavolsag;
   private double viteldij;
   private double borravalo;
   private String fizetes_modja;

   
   
  Fuvar (String sor)
  {
      String[] s =sor.split(";");
      this.taxi_id=Integer.parseInt(s[0]);
      this.indulas=s[1];
      this.idotartam=Integer.parseInt(s[2]);
      this.tavolsag=Double.parseDouble(s[3]); 
      this.viteldij=Double.parseDouble(s[4]); 
      this.borravalo=Double.parseDouble(s[5]); 
      this.fizetes_modja=s[6];
  
  }

    public int getTaxi_id() {
        return taxi_id;
    }

    public String getIndulas() {
        return indulas;
    }

    public int getIdotartam() {
        return idotartam;
    }

    public double getTavolsag() {
        return tavolsag;
    }

    public double getViteldij() {
        return viteldij;
    }

    public double getBorravalo() {
        return borravalo;
    }

    public String getFizetes_modja() {
        return fizetes_modja;
    }
    
}
