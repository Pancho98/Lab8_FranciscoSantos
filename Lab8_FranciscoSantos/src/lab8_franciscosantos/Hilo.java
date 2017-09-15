
package lab8_franciscosantos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class Hilo extends Thread{
    private Hadas peleadora1;
    private Hadas peleadora2;
    private JProgressBar p1;
    private JProgressBar p2;

    public Hilo() {
    }

    public Hilo(Hadas peleadora1, Hadas peleadora2, JProgressBar p1, JProgressBar p2) {
        this.peleadora1 = peleadora1;
        this.peleadora2 = peleadora2;
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public void run() {
        p1.setValue((int) peleadora1.getSalud());
        p2.setValue((int) peleadora2.getSalud());
        p1.setMaximum((int) peleadora1.getSalud());
        p2.setMaximum((int) peleadora2.getSalud());
        String ganador = "";
        boolean bandera = true;
        while (bandera) {
            if ((peleadora1 instanceof Salamandra) && (peleadora2 instanceof Hamadriades)) {
                peleadora2.setSalud(peleadora2.getSalud() - (peleadora1.getPoder() + (peleadora1.getPoder() * 0.37)));
            } else if ((peleadora1 instanceof Lamias) && (peleadora2 instanceof Salamandra)) {
                peleadora2.setSalud(peleadora2.getSalud() - (peleadora1.getPoder() + (peleadora1.getPoder() * 0.42)));
            } else if ((peleadora1 instanceof Silfides) && (peleadora2 instanceof Salamandra)) {
                peleadora2.setSalud(peleadora2.getSalud() - (peleadora1.getPoder() + (peleadora1.getPoder() * 0.37)));
            } else {
                peleadora2.setSalud(peleadora2.getSalud() - peleadora1.getPoder());
            }
            p2.setValue((int) peleadora2.getSalud());

            if (peleadora2.getSalud() <= 0) {
                bandera = false;
                ganador = peleadora1.getNombre();
            }
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }

            if (bandera) {
                if ((peleadora2 instanceof Salamandra) && (peleadora2 instanceof Hamadriades)) {
                    peleadora1.setSalud(peleadora1.getSalud() - (peleadora2.getPoder() + (peleadora2.getPoder() * 0.37)));
                } else if ((peleadora2 instanceof Lamias) && (peleadora2 instanceof Salamandra)) {
                    peleadora1.setSalud(peleadora1.getSalud() - (peleadora2.getPoder() + (peleadora2.getPoder() * 0.42)));
                } else if ((peleadora2 instanceof Silfides) && (peleadora2 instanceof Salamandra)) {
                    peleadora1.setSalud(peleadora1.getSalud() - (peleadora2.getPoder() + (peleadora2.getPoder() * 0.37)));
                } else {
                    peleadora1.setSalud(peleadora1.getSalud() - peleadora2.getPoder());
                }
                p1.setValue((int) peleadora1.getSalud());

                if (peleadora1.getSalud() <= 0) {
                    bandera = false;
                    ganador = peleadora2.getNombre();
                }
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                }
            }

        }
        JOptionPane.showMessageDialog(null, "ganador es: " + ganador);
    }
    }
    
    
    
}
