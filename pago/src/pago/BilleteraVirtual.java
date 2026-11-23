package pago;

public class BilleteraVirtual extends MedioPago {
    private String nombreAplicacion;

    public BilleteraVirtual(String titular, String nombreAplicacion) {
        super(titular);
        this.nombreAplicacion = nombreAplicacion;
    }

    public String getNombreAplicacion() {
        return nombreAplicacion;
    }

    @Override
    public void procesarPago(double monto) {
        if (monto > 0) {
            System.out.println("Pago con Billetera Virtual " + nombreAplicacion + " de " 
                + getTitular() + " procesado por $" + monto);
        } else {
            System.out.println("Error: El monto del pago con billetera virtual debe ser mayor que cero.");
        }
    }
}
