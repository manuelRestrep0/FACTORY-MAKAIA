public class FacturaCompleta extends Factura implements FacturaPago {

    public FacturaCompleta(double pago, int porcentajeIVA) {
        super(pago, porcentajeIVA);
    }

    @Override
    public void pago() {
        System.out.println("El total a pagar con un IVA del 19%: "+super.calcularPagoTotal());
    }
}
