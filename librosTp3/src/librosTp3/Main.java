package librosTp3;

public class Main {
    public static void main(String[] args) {
        LibroDigital libro = new LibroDigital("asterix el galo");
        AudioLibro audio = new AudioLibro("el eternauta");

        libro.mostrarDescripcion();
        audio.mostrarDescripcion();
    }
}