
package lab8_franciscosantos;


public class Silfides extends Hadas{
    private int alas;

    public Silfides(){
        super();
    }
    
    public Silfides(int alas) {
        this.alas = alas;
    }

    public Silfides(int alas, String nombre, int edad, double salud, int estatura, int poder) {
        super(nombre, edad, salud, estatura, poder);
        this.alas = alas;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }
    
    
}
