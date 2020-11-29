package clases;

public abstract class Producto implements Comparable<Producto>{

    private String nombre;
    private float precio;
    

    public Producto() {
    }
    public Producto(String nombre, float precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }
    
    @Override
    public int compareTo(Producto p){
        int resultado=0;
        
        if(this.precio > p.getPrecio()){
             resultado = 1;
             
        }else if(this.precio < p.getPrecio()){
            resultado = -1;
        }
        return resultado;
    }
    
}
