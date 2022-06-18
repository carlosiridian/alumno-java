/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno;

/**
 *
 * @author karly Jr
 */
public class Alumno {

     String nombreE;
  String idE;
  String Ncarrera;
  float Pacomulado;
  
  
  public  Alumno(){
   nombreE=Ncarrera="";
   Pacomulado=0;
       idE="";
   }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String noE) {
        nombreE = noE;
    }

    public String getIdE() {
        return idE;
    }

    public void setIdE(String id) {
        idE = id;
    }

    public String getNcarrera() {
        return Ncarrera;
    }

    public void setNcarrera(String carrera) {
        Ncarrera = carrera;
    }

    public float getPacomulado() {
        return Pacomulado;
    }

    public void setPacomulado(float Promedio) {
        Pacomulado = Promedio;
    }
   
    
    
}

    
