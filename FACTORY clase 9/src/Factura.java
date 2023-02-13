public class Factura {


    private double pago;
    private int porcentajeIVA;

    public Factura(double pago, int porcentajeIVA) {
        this.pago = pago;
        this.porcentajeIVA = porcentajeIVA;
    }

    public double getPago() {
        return pago;
    }

    public int getPorcentajeIVA() {
        return porcentajeIVA;
    }
    public double calcularPagoTotal(){
        return(pago+(pago*porcentajeIVA)/100);
    }
}
