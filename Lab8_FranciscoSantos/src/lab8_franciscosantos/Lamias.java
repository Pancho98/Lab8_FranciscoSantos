
package lab8_franciscosantos;


public class Lamias extends Hadas{
    private int AletaT;
    private int branquias;

    public Lamias() {
        super();
    }

    public Lamias(int AletaT, int branquias) {
        this.AletaT = AletaT;
        this.branquias = branquias;
    }

    public Lamias(int AletaT, int branquias, String nombre, int edad, double salud, int estatura, int poder) {
        super(nombre, edad, salud, estatura, poder);
        this.AletaT = AletaT;
        this.branquias = branquias;
    }

    public int getAletaT() {
        return AletaT;
    }

    public void setAletaT(int AletaT) {
        this.AletaT = AletaT;
    }

    public int getBranquias() {
        return branquias;
    }

    public void setBranquias(int branquias) {
        this.branquias = branquias;
    }

    @Override
    public String toString() {
        return "Lamias";
    }
    
    
}
