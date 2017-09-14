
package lab8_franciscosantos;


public class Hadas {
    private String nombre;
    private int edad;
    private double salud;
    private int estatura;
    private int poder;

    public Hadas() {
    }

    public Hadas(String nombre, int edad, double salud, int estatura, int poder) {
        this.nombre = nombre;
        this.edad = edad;
        this.salud = salud;
        this.estatura = estatura;
        this.poder = poder;
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

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
