
package lab8_franciscosantos;


public class Salamandra extends Hadas{
    private int alas;
    
    public Salamandra(){
        super();
    }

    public Salamandra(int alas) {
        this.alas = alas;
    }

    public Salamandra(int alas, String nombre, int edad, double salud, int estatura, int poder) {
        super(nombre, edad, salud, estatura, poder);
        this.alas = alas;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    @Override
    public String toString() {
        return "Salamandra";
    }
    
    
}
