public class Main {
    public static void main(String[] args) {
        FacturaPago factura = FactoryFactura.generarFactura(true,1000,8);
        factura.pago();

        factura = FactoryFactura.generarFactura(false, 1000,19);
        factura.pago();
    }
}