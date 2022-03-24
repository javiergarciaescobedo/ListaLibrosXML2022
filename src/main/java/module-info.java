module es.javiergarciaescobedo.listalibros {
    requires javafx.controls;
    requires java.xml.bind;
    requires jakarta.activation;
    requires java.activation;
    exports es.javiergarciaescobedo.listalibros;
    opens es.javiergarciaescobedo.listalibros to java.xml.bind;
}
