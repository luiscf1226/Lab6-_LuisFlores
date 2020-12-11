
import javax.swing.JProgressBar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Luis Carlos Flores
 */
public class Hilo extends Thread {

    private JProgressBar progBar;
    private boolean avanzar;
    int cont;

    public Hilo() {
    }

    public Hilo(JProgressBar progBar) {
        this.progBar = progBar;
    }

    public JProgressBar getProgBar() {
        return progBar;
    }

    public void setProgBar(JProgressBar progBar) {
        this.progBar = progBar;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = true;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    @Override
    public void run() {

        while (true) {
            if (avanzar) {
                progBar.setMaximum(10);
                progBar.setValue(progBar.getValue() + 1);
                //activar y modificar propiedad stringPainted para que esto funciones
                progBar.setString(Integer.toString(progBar.getValue()) + " Pasando");
                
            }
            try {
                Thread.sleep(this.cont+10);
            } catch (InterruptedException ex) {
            }

        }

    }

}
