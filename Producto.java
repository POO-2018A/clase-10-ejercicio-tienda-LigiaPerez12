package tienda;
import java.lang.reflect.Array;
 
/**
 *
 * @author bayon
 */
public class Producto {
     
    private static String[] POSIBLES_TIPOS = {"Computador", "Televisor", "Proyector"};
     
    private String marca;
    private String codigo;
    private String tipo;
    private double precio;
 
    public String getMarca() {
        return marca;
    }
 
    public void setMarca(String nombre) {
        this.marca = nombre;
    }
 
    public String getCodigo() {
        return codigo;
    }
 
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
 
    public String getTipo() {
        return tipo;
    }
 
    public void setTipo(String tipo) {
        for (int i=0; i<POSIBLES_TIPOS.length; i++){
            if(tipo.equals(POSIBLES_TIPOS[i])){
                this.tipo = tipo;
                return;
            }
            System.out.println("El tipo de articulo no es valido");
        }
         
    }
 
    public double getPrecio() {
        return precio;
    }
 
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    //@override
    public String toString(){
        return super.toString();
    }
     
     
}