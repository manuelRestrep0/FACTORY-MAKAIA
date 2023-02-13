public class FactoryFactura {

    public static FacturaPago generarFactura(boolean esReducida, double pago, int iva){
        if(esReducida){
            return new FacturaReducida(pago, iva);
        }
        else{
            return new FacturaCompleta(pago, iva);
        }
    }
}
