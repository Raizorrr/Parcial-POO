package Vehiculos;

public class Moto extends Vehiculo {
    private boolean tieneSidecar;

    public Moto(String marca, double precio, int cilindraje, boolean tieneSidecar) {
        super(marca, precio, cilindraje);
        this.tieneSidecar = tieneSidecar;
        if (tieneSidecar) {
            this.cuotaMesGaraje *= 1.5; // Incremento cuota con sidecar
        }
    }

    @Override
    public double calcularImpuestoCirculacion() {
        return this.precio * 0.02 * (tieneSidecar ? 1.1 : 1); // Impuesto con incremento si tiene sidecar
    }
}
