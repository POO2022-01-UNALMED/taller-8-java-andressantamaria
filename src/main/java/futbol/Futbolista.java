package futbol;

public abstract class Futbolista implements Comparable<Object> {
    private String nombre;
    private int edad;
    private final String posicion;
  
    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }
    
    public Futbolista() {
        this("maradona", 30, "delantero");
    }
    
    @Override
    public String toString() {
        return "El futbolista " + nombre + " tiene " + edad + " y juega de " + posicion;
    }
    
    public boolean equals(Futbolista f)
    {	
    	if(this == f)
    		return true;
    	else  				
    		return false;
    }
    
    public abstract boolean jugarConLasManos();
    
    public int compareTo(Object obj) {
    	return 0;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    

    public String getPosicion() {
        return posicion;
    }

    
}
