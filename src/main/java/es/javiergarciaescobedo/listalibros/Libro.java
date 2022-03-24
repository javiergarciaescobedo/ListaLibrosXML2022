package es.javiergarciaescobedo.listalibros;

public class Libro {
    
    private String titulo;
    private String autor;
    private String ISBN;
    private int numPaginas;
    private float precio;
    private String fechaPublicacion;
    
    public Libro() {        
    }
    
    public Libro(String titulo) {
        this.titulo = titulo.toUpperCase();
    }
    
    public Libro(String titulo, String autor) {
        this.titulo = titulo.toUpperCase();
        this.autor = autor;
    }
    
    public String getTitulo() {        
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo.toUpperCase();
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getISBN() {
        return ISBN;
    }
    
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
    public int getNumPaginas() {
        return numPaginas;
    }
    
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    public float getPrecio() {
        return precio;
    }
    
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public String getFechaPublicacion() {
        return fechaPublicacion;
    }
    
    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    
    @Override
    public String toString() {
        String r = "";
        r += "Titulo: " + titulo + "\n";
        r += "Autor: " + autor + "\n";
        return r;
    }
}
