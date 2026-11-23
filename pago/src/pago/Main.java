package pago;

public class Main {
    public static void main(String[] args) {
        Tarjeta tarjeta = new Tarjeta("Paulo Lopez", "1010");
        BilleteraVirtual billetera = new BilleteraVirtual("Paulo Lopez", "Mercado Pago");

        tarjeta.procesarPago(15000.5);
        billetera.procesarPago(4200);
        
        tarjeta.procesarPago(-500);
    }
}