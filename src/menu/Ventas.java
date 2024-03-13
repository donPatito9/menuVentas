
package menu;

/**
 *
 * @author Robinson Concha
 */
public class Ventas {
    

private int[] ventasXCanal;
  
public Ventas(){
    ventasXCanal = new int[4];
}
    
    public int[] getVentasXCanal() {
        return ventasXCanal;
    }
   
    public void setVentasXCanal(int[]ventasXCanal){
       this.ventasXCanal = ventasXCanal;
       
    }
   
    public String sumarVentas(int montoVenta, int canal) {
    String salida = "";
    String canalNombre ="";
    
     montoVenta = montoVenta + ventasXCanal[canal];
     ventasXCanal[canal] = montoVenta;
    if(canal + 0 == 1)
    {
        canalNombre = "Presencial";
    }
    if(canal + 1 == 2)
    {
        canalNombre = "Telefonico";
    }
    if(canal + 2 == 3)
    {
        canalNombre = "Tienda Web";
    }
    if(canal + 3 == 4)
    {
        canalNombre = "Tienda Movil";
    }
   
     
    
        System.out.println("Canal : " +(canal + 1)+ "   " + canalNombre);
        System.out.println("\n*");
        System.out.println("Total ventas del canal: " + montoVenta);
        System.out.println("\n*");
        
    
     
    
       salida = "Suma Ventas: " + montoVenta;
       return salida;
    }
    
    
public String imprimirCanales(){ 
       String salida = "";
       String canalNombre = "";
       System.out.println("Nombre del canal " +  " total ventas");
       for(int i = 0; i < 4; i++) {
         if (i == 0)
         {
           canalNombre = "Presencial";
         }
         if (i == 1)
         {
           canalNombre ="Telefonico";
         }
         if (i == 2)
         {
           canalNombre = "Tienda Web";
         }
         if (i == 3)
         {
           canalNombre = "Tienda Movil";
             
         }
         System.out.println("" + (i + 1)  +  "  " + canalNombre + "     =    " + ventasXCanal[i]);
         
       salida = "   " + ventasXCanal[i];
    }
       return salida;
    }
public String montoMayorVenta() {
    int mayor = 0;
    String salida = "";
    for (int i = 0; i < 4; i++){
       if(ventasXCanal[i] > mayor){
           mayor = ventasXCanal[i];
       } 
    }
    System.out.println("");
    System.out.println("Mayor venta: " +mayor);
    
salida = "Mayor venta: " + mayor;
return salida;

}

public String canalMayorVenta() {
int mayor = 0;
String salida = "";
String canalNombre = "";

for( int i = 0; i < 4; i++){
    
  
   if(ventasXCanal[i] > mayor){
      mayor = ventasXCanal[i];
      if(i == 0){
          canalNombre = "Presencial";
      }
      if(i == 1) {
          canalNombre = "Telefonico";
      }
      if(i == 2) {
          canalNombre = "Tienda Web";
      }
      if(i == 3) {
          canalNombre = "Tienda Movil";
      }
      
   } 
}

  
    
     System.out.println("El canal de mayor venta es: " + canalNombre);

salida = " El canal de mayor ventas es: "+ canalNombre;
 return salida;
 
}
}