package pago;

public class Tarjeta extends MedioPago {
    private String ultimosCuatroDigitos;

    public Tarjeta(String titular, String ultimosCuatroDigitos) {
        super(titular);
        this.ultimosCuatroDigitos = ultimosCuatroDigitos;
    }

    public String getUltimosCuatroDigitos() {
        return ultimosCuatroDigitos;
    }

    @Override
    public void procesarPago(double monto) {
        if (monto > 0) {
            System.out.println("Pago con Tarjeta terminada en " + ultimosCuatroDigitos + " a nombre de " 
                + getTitular() + " procesado por $" + monto);
        } else {
            System.out.println("Error: El monto del pago con tarjeta debe ser mayor que cero.");
        }
    }
}