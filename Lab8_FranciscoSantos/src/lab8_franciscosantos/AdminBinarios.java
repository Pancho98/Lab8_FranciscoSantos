
package lab8_franciscosantos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class AdminBinarios {
    private ArrayList<Hadas>listaPersonas=new ArrayList();
    private File archivo;

    public AdminBinarios(String path) {
        archivo=new File(path);
    }
    
    

    public ArrayList<Hadas> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Hadas> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setPersona(Hadas p){
        this.listaPersonas.add(p);
    }

    @Override
    public String toString() {
        return "listaPersonas=" + listaPersonas;
    }
    
    public void cargarArchivo(){
        try {
            listaPersonas = new ArrayList();
            Hadas temp;
            if (archivo.exists()) {
                FileInputStream entrada=new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while((temp=(Hadas)objeto.readObject())!=null){
                        listaPersonas.add(temp);
                    }
                } catch (Exception e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
        }
    }
    
    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw= new FileOutputStream(archivo);
            bw=new ObjectOutputStream(fw);
            for (Hadas t : listaPersonas) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        }finally{
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}
