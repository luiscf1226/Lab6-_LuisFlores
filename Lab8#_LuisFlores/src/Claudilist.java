
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Luis Carlos Flores
 */
public class Claudilist {

    private String nombre;
    private ArrayList<Programas> lista=new ArrayList();

    public Claudilist(String nombre) {
        this.nombre = nombre;
    }

    public Claudilist() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Programas> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Programas> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return nombre;
    }
    //extra mutador

    public void setPrograma(Programas p) {
        this.lista.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        File archivo = new File("./" + getNombre() + ".txt");
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Programas t : lista) {
                bw.write(t.getNombre() + "/");
                bw.write(t.getPuntuacion() + "/");
                bw.write(t.getFecha() + "/");
                bw.write(t.getTipo() + "/");
                bw.write(t.getGenero() + "/");
                bw.newLine();
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        lista = new ArrayList();
          File archivo = new File("./"+getNombre() + ".txt");
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("/");
                while (sc.hasNext()) {
                    lista.add(new Programas(sc.next(),
                            sc.nextInt(), sc.next(),
                            sc.next(), sc.next()
                    )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
