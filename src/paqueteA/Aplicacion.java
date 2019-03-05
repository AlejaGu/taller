
package paqueteA;
import empleados.Empleados;
import javax.swing.JOptionPane;


public class Aplicacion {
    public static void main(String[] args) {
        Empleados empleado1=new Empleados();
        Empleados empleado2=new Empleados();
        Empleados empleado3=new Empleados();
        Empleados empleado4=new Empleados();
        Empleados empleado5=new Empleados();
        
        
        int empleado;
        empleado= Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero del 1 al 5 para el empleado que desea conocer"));

        
        switch(empleado){
            case 1:
        empleado1.setNombre("Victor");
        empleado1.setEdad(37);
        empleado1.setDireccion("CL 7A ESTE 10A 43 C94 SOI"); 
        empleado1.setNumero("3116177608");   
        
        System.out.println("el nombre del empleado es: "+empleado1.getNombre()+" su edad es: "+empleado1.getEdad()+" su direccion: "+empleado1.getDireccion()+" su numero de celular es: "+empleado1.getNumero());
        
       break;    
       
       case 2:
           
        empleado2.setNombre("Felipe");
        empleado2.setEdad(20);
        empleado2.setDireccion("Carrera 3 # 18- 45"); 
        empleado2.setNumero("3103635583");
        
         System.out.println("el nombre del empleado es: "+empleado2.getNombre()+" su edad es: "+empleado2.getEdad()+" su direccion: "+empleado2.getDireccion()+" su numero de celular es: "+empleado2.getNumero()); 
         break;
         
       case 3:
        
        empleado3.setNombre("Samuel");
        empleado3.setEdad(35);
        empleado3.setDireccion("Av. Calle 19 N° 2-49 Centro"); 
        empleado3.setNumero("3213665008"); 
        
        System.out.println("el nombre del empleado es: "+empleado3.getNombre()+" su edad es: "+empleado3.getEdad()+" su direccion: "+empleado3.getDireccion()+" su numero de celular es: "+empleado3.getNumero()); 
           
        break;
        
       case 4:
           
        empleado4.setNombre("Juan");
        empleado4.setEdad(20);
        empleado4.setDireccion("Calle 109a N° 17-10 Sede Norte"); 
        empleado4.setNumero("3208765988");
        
        System.out.println("el nombre del empleado es: "+empleado4.getNombre()+" su edad es: "+empleado4.getEdad()+" su direccion: "+empleado4.getDireccion()+" su numero de celular es: "+empleado4.getNumero()); 
           
       break;
       
       case 5:
        
        empleado5.setNombre("Mauricio");
        empleado5.setEdad(29);
        empleado5.setDireccion("Cr.8a # 15-63"); 
        empleado5.setNumero("3115119836");  
        
        System.out.println("el nombre del empleado es: "+empleado5.getNombre()+" su edad es: "+empleado5.getEdad()+" su direccion: "+empleado5.getDireccion()+" su numero de celular es: "+empleado5.getNumero()); 
           
        }
       
    } 
   
    
}
