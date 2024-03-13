
package menu;
import java.util.Scanner;
/**
 *
 * @author Robinson Concha 
 */
public class Menu {

    
    public static void main(String[] args) {
        // el main menu ofrece opciones al usuario 
        Scanner read = new Scanner(System.in);
       int montoVenta;
       int canal;
       int opcion;
       
       Ventas ventas = new Ventas();
             
    do{    
             System.out.println("bienvenido al Menu de ventas");
             System.out.println("1.- Ingresar canal y monto venta");
             System.out.println("2.- Imprimir canales");
             System.out.println("3.- Imprimir canal con mayor cantidad de ventas acumuladas");
             System.out.println("0.- Salir de la aplicacion");
             System.out.println("");
             System.out.println(" .  Seleccione una opcion");
             opcion = read.nextInt();
             if(opcion > 3 || opcion < 0)
             {
                 System.out.println("Opcion ingresada no es valida, seleccione otra opcion");
             }
             
             switch(opcion) {
             case 1:
                     
                     
                       System.out.println("Seleccione el canal");
                       System.out.println("" );
                       System.out.println("1.- Presencial");
                       System.out.println("2.- Telefonico");
                       System.out.println("3.- Tienda Web");
                       System.out.println("4.- Tienda Movil");
                     
                     canal = read.nextInt();
                     
                     if(canal < 1 || canal > 4){
                    
                         System.out.println("Canal no encontrado");
                         System.out.println("Seleccione el canal");
                     }
                     
                     System.out.println("Ingresar monto de la Venta");
                     montoVenta = read.nextInt();
                     canal = canal - 1;                     
                ventas.sumarVentas(montoVenta, canal);
             break;
             
             case 2:
                 System.out.println("Impresion de canales y sus respectivos montos");
                 ventas.imprimirCanales();
             break;
             
             case 3:
                 System.out.println("Canal de mayor ventas acumuladas");
                 ventas.montoMayorVenta();
                 ventas.canalMayorVenta();
             break;
             
             case 0:
                 System.out.println("Apagar la Aplicacion");
                 
               break;      
             } 
  
           }while (opcion != 0);

    }
}
    
    