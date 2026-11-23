package librosTp3;

public class AudioLibro extends MaterialDigital {
    public AudioLibro(String titulo) {
        super(titulo);
    }

    @Override
    public void mostrarDescripcion() {
        System.out.println("Título: " + getTitulo() + "  Se puede escuchar");
    }
}