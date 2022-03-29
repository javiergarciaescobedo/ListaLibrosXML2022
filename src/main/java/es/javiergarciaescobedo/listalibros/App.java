package es.javiergarciaescobedo.listalibros;

import java.io.File;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        StackPane root = new StackPane();
        var scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
                
        Libro libro1 = new Libro("Ficheros en Java", "Luisa Pérez");
        System.out.println(libro1.getTitulo());
        libro1.setTitulo("Listas en Java");
        System.out.println(libro1.getTitulo());
        
        Libro libro2 = new Libro();
        Libro libro3 = new Libro("XML en Java");
        libro3.setTitulo("XML en Java 2");
        
        //int[] listaNum = new int[10];
        //Libro[] listaLibros = new Libro[10];
        
        ListaLibros listaLibros = new ListaLibros();
        listaLibros.getListaLibros().add(libro1);
        listaLibros.getListaLibros().add(libro2);
        listaLibros.getListaLibros().add(libro3);       
        
        Button buttonSelecFile = new Button("Guardar XML");
        root.getChildren().add(buttonSelecFile);
        buttonSelecFile.setOnAction((t) -> {
            UtilXML.guardarDatosXML(stage, listaLibros);
        });                               


        
//        // Mostrar el título del tercer libro
//        System.out.println(listaLibros.get(2).getTitulo());
//        
//        // Eliminar de la lista el segundo libro
//        listaLibros.remove(1);
//        
//        // Mostrar todos los títulos de libros de la lista
//        for(int i=0; i<listaLibros.size(); i++) {
//            System.out.println(listaLibros.get(i).getTitulo());
//        }
//        
//        for(int i=0; i<listaLibros.size(); i++) {
//            System.out.println(listaLibros.get(i));
//        }

    }
    


    public static void main(String[] args) {
        launch();
    }

}