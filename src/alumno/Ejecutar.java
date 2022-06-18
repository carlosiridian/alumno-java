/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno;

import javax.swing.JOptionPane;

/**
 *
 * @author karly Jr
 */
public class Ejecutar {
    public static void mostrarestudiante(vectorEstudiante obj){
  
  String tamavector="";
  for(int i=0;i<=obj.getTamaño()-1;i++){
     
  tamavector =tamavector+String.valueOf("\n  NOMBRE :"+" "+ obj.getVectordatos(i).getNombreE()+
                                 "\n"+"   IDE :"+" "+obj.getVectordatos(i).getIdE() +"\n"+" CARRERA :"+
                                 " "+ obj.getVectordatos(i).getNcarrera()+"\n"+"NOTA FINAL "+" "+obj.getVectordatos(i).getPacomulado());
  }
  JOptionPane.showMessageDialog(null, "============ INFORMACION DE LOS ESTUDIANTES ============"+"\n"+tamavector+"\n"+
                                                           " EL PROMEDIO DE TODO LOS ESTUDIANTES ES   ="+obj.Promedio()); 
  }
  
  public static void asignardatos(Alumno  Est)   {
 String nombreE =(JOptionPane.showInputDialog("Digite el nombre del estuante: "));
 Est.setNombreE(nombreE);
 String idE=(JOptionPane.showInputDialog("Digite ide del estudiante: "));
 Est.setIdE(idE);
 String Ncarrera =(JOptionPane.showInputDialog("Digite el nombre de la carrera: "));
 Est.setNcarrera(Ncarrera);
 Est.setPacomulado(Float.parseFloat(JOptionPane.showInputDialog("Digite la nota final: ")));
 }
  public static int menu (){
 int opc =0;
 do{
 opc = Integer.parseInt(JOptionPane.showInputDialog(" SELECCIONE UNA OPCION  \n"+ 
         "1. Buscar estudiante atravez de la nota  \n"+ "2. Ordenar atravez de las notas  \n"+ "3. salir \n" +
                                                        "Seleccione una opción del 1 al 3"));
 }while(opc <= 0 || opc >3);
 return opc;
 }
   public static void main(String[] args) {
   vectorEstudiante obj = new  vectorEstudiante();
 Alumno  Est;
   obj.llenarvector();
   for(int i=0; i<=obj.getTamaño()-1; i++){
       Est= new  Alumno ();
       JOptionPane.showMessageDialog(null, "====== REGISTRAR ESTUDIANTE ======"+"\n"+ "Ingresar la Información del Estudiante #"+(i+1));
       asignardatos(Est);
       
   obj.setVectordatos(i, Est);
   
   }
  mostrarestudiante(obj);
  float data; 
  float posDato=0;
   int opcion;
  
   
    do{
   opcion = menu(); 
   switch(opcion) {
    case 1:
    data =Float.parseFloat(JOptionPane.showInputDialog(null, "Digite la nota del estudiante que desea buscar:"));
    posDato =  obj.busquedalineal(data);
   if(posDato!= -1){
        JOptionPane.showMessageDialog(null, "Nombre es: "+" "+obj.getVectordatos((int) posDato).getNombreE()+
                "\n"+"El ide es :"+"  "+obj.getVectordatos((int) posDato).getIdE()+
                "\n"+"Carrera   :"+" "+obj.getVectordatos((int) posDato).getNcarrera()+
                "\n"+"La nota es :"+" "+obj.getVectordatos((int) posDato).getPacomulado()); 
    }else{
      JOptionPane.showMessageDialog(null," la nota registrada"+" no fue encontrada");
    }
    break;
    case 2:
   obj.ordenarIntercambio();
   mostrarestudiante(obj);
   break;
    case 3:
    break;
   default:
 JOptionPane.showMessageDialog(null, "¡No selecciono una opción válida entre 1 y 3!");

   
   }
    }while(opcion !=3 );
   
}
} 

