package tienda;
import java.util.Scanner;


/**
 *
 * @author bayon
 */
public class Principal {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
         
        System.out.println("Ingrese los datos de su tienda: ");
         
        System.out.println("Nombre: ");
        String nombreTienda = scan.nextLine();
         
        System.out.println("Direccion: ");
        String direccionTienda = scan.nextLine();
         
        System.out.println("RUC: ");
        String rucTienda = scan.nextLine();
         
        Tienda tienda = new Tienda (nombreTienda, direccionTienda, rucTienda);
        
        
        System.out.println("Ingrese los productos de su inventario: ");
        System.out.println("Cuantos productos va a vender");
        int cantidadProductos = scan.nextInt();
        Producto[] productos = new Producto [cantidadProductos];
        
        for (int i=0; i<cantidadProductos; i++){
            System.out.println("Ingrese los datos del producto: " + (i+1));
            System.out.println("Ingrese la marca:  ");
            String marca = scan.nextLine();
            System.out.println();
            
            System.out.println("Ingrese el código:  ");
            String codigo = scan.nextLine();
            
            System.out.println("Ingrese el tipo:  ");
            String tipo = scan.nextLine();
            
            System.out.println("Ingrese el precio:  ");
            double precio = scan.nextDouble();    
        }
        int opcion;
        
        System.out.println("Datos de la tienda ingresados correctamente.");
        System.out.println();
        System.out.println();
        
        System.out.println("        MENU");
        System.out.println("1. Ingresar un nuevo producto");
        System.out.println("2. Visualizar lista de productos ");
        System.out.println("3. Salir");
        
        System.out.println("Ingrese la opción que desea realizar: ");
        opcion = scan.nextInt();
        
        switch(opcion){
            case 1:
                System.out.print("Cuantos productos va ingresar: ");
                int numPro = scan.nextInt();
                Producto [] articulos = new Producto [numPro];
                    for (int i=0; i< articulos.length;i++){
                        System.out.println("       Producto "+(i+1)+"   ");
                        scan.nextLine();
                    
                        System.out.println(" Marca: ");
                        String marca = scan.nextLine();
                    
                        System.out.println(" Codigo: ");
                        String codigo = scan.nextLine();
                    
                        System.out.println(" Tipo: ");
                        String tipo = scan.nextLine();
                    
                        System.out.println(" Precio: ");
                        double precio = scan.nextDouble();
                    }
                        
                        break;
            case 2:
                        break;
            default:
               
         
         
        
        }while(opcion != 3);
        
        System.out.println("Adios :");
        
    }
}

