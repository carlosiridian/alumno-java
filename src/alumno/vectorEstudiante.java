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
public class vectorEstudiante {
    int tamaño;
    Alumno vectordatos[] ;
public vectorEstudiante(){
tamaño=3;
vectordatos=null;

}
public void llenarvector(){
 vectordatos = new Alumno[tamaño];
}

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tama) {
        tamaño = tama;
    }

    public void setVectordatos(int p, Alumno Es){
vectordatos[p] = Es;
  }
  public Alumno getVectordatos(int p){
return vectordatos[p];
  }
   public void cambiar(int pos1,int pos2){
  Alumno tempos;
tempos = getVectordatos(pos1);
setVectordatos(pos1, getVectordatos(pos2));
setVectordatos(pos2, tempos);
   }
   // metodo para buscar el estudiante a travez de la nota
  public float busquedalineal(float nota){
     
      int i;
      int pos;
      i=0;
      pos=-1;
      
      while((i<= getTamaño()-1 )&&( pos==-1)){
          if(getVectordatos(i).getPacomulado()==nota){
              pos=i; 
             
          }else{
              i++;   
          }
          }
     return pos; 
  }

  // metodo paraordenar atravez de la nota estudiante
  public void ordenarIntercambio(){
 
 int i, j;
 for (i=0; i<=getTamaño()-1; i++){
 for (j=1; j<=(getTamaño()-1)-2; j++){

 if (getVectordatos(i).getPacomulado() < getVectordatos(j).getPacomulado()){
 cambiar(i, j);
 }
 }
 }
 }
   public float Promedio(){
        float suma=0;
        
        for (int i = 0; i <=getTamaño()-1; i++) {
            suma+= getVectordatos(i).getPacomulado();
        }
        
        return  (suma / 3);
    }

}
