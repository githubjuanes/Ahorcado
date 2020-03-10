
package ahorcado3;

import static ahorcado3.ahorcadoo.lista;
import static ahorcado3.ahorcadoo.tabla;
import static ahorcado3.ahorcadoo.txt1;
import static ahorcado3.ahorcadoo.txt2;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;



public class botones 
{
     
    
    
    
    public static void ingresar()
    {
         
        String Palabra=txt1.getText();
        int longitud = Palabra.length();
        System.out.println("longitud palabra" + longitud);
        for(int i = 0 ; i < longitud ;i++)
        {
            System.out.println("caracter" + Palabra.charAt(i));
        }
        int cols = longitud;
        int rows = 1;
        tabla.setModel(new DefaultTableModel(rows, cols));
        
        for(int c = 0; c < cols; c++)
        {
            tabla.setValueAt("letra"+c, 0, c);
        }
        
    }
    
    public static void probar()
    {
       
        String Palabra2 = txt1.getText();
        
        int longitud2 = Palabra2.length();
        int contador = 0;
        char  Validar;
        char Letra;
        char letra2;
         DefaultListModel letra3 = new DefaultListModel();
           do
            {
                
                String Validar2 = txt2.getText();
                 
                      for(int i = 0 ; i < 10 ;i++)
                       {
                            Validar = Validar2.charAt(i);
                            
                            
                            
                            for(int x = 0 ; x < longitud2 ;x++)
                
                                {
                                     Letra= Palabra2.charAt(x);
                                    
                                      if ( Validar == Letra)
                                        {
                                            
                                            System.out.println("si esta");
                                            tabla.setValueAt(""+Palabra2.charAt(x), i, x);
                                            letra3 = new DefaultListModel();
                                            letra3.addElement(txt2.getText());
                                            lista.setModel(letra3);
                                            txt2.setText("");
                                           
                                        }
                                      else
                                      {
                                          contador++;
                                      System.out.println("no esta");
                                      }
                                }
                       }
                      System.out.println("NUMERO DE INTENTO "+contador);
                      
            }while( contador <= 9);
    System.exit(0);
    }     
}
            
              
                
                   
                               
                        
                   
                       
   
                   
                 
 
                   

                  
                       
       
         
        
        
        
        
    

   

