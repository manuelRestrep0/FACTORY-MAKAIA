public class FacturaReducida extends Factura implements FacturaPago{

    public FacturaReducida(double pago, int porcentajeIVA) {
        super(pago, porcentajeIVA);
    }

    @Override
    public void pago() {
        System.out.println("El total a pagar con un IVA del 8% es: "+super.calcularPagoTotal());
    }
}
