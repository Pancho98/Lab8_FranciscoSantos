
package lab8_franciscosantos;


public class Hamadriades extends Hadas{
    private int arbol;

    public Hamadriades() {
        super();
    }
    
    public Hamadriades(int arbol) {
        this.arbol = arbol;
    }

    public Hamadriades(int arbol, String nombre, int edad, double salud, int estatura, int poder) {
        super(nombre, edad, salud, estatura, poder);
        this.arbol = arbol;
    }

    public int getArbol() {
        return arbol;
    }

    public void setArbol(int arbol) {
        this.arbol = arbol;
    }

    @Override
    public String toString() {
        return "Hamadriades";
    }
    
    
}
