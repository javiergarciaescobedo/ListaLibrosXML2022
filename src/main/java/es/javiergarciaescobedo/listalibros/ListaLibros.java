package es.javiergarciaescobedo.listalibros;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ListaLibros {
    
    private ArrayList<Libro> listaLibros = new ArrayList();
    
    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }
    
    @XmlElement(name = "libro")
    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }
    
}
