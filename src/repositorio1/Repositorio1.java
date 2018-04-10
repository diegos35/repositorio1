/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio1;
import javax.swing.*;
/**
 *
 * @author diego
 */
public class Repositorio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String genero="";	  	 		 	
		do{
			genero=JOptionPane.showInputDialog("Introduce tu genero(H/M)");
			
		}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
	int altura= Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura en cm"));
int pesoideal=0;
if (genero.equalsIgnoreCase("H")){
	pesoideal=altura-110;
	
}else if(genero.equalsIgnoreCase("M")){
	pesoideal=altura-120;
	
}System.out.println("hola tu peso ideal es");
System.out.println("tu peso ideal es"+pesoideal);

      System.out.println("hola tu peso ideal es");
System.out.println("tu peso ideal es"+pesoideal);

  
    }
    
}
