package Vehiculos;

public class Auto extends Vehiculo {
    private boolean tieneRadio;
    private boolean tieneNavegador;

    public Auto(String marca, double precio, int cilindraje, boolean tieneRadio, boolean tieneNavegador) {
        super(marca, precio, cilindraje);
        this.tieneRadio = tieneRadio;
        this.tieneNavegador = tieneNavegador;
    }

    @Override
    public double calcularImpuestoCirculacion() {
        double impuesto = this.precio * 0.02;
        if (tieneRadio) impuesto += this.precio * 0.01;
        if (tieneNavegador) impuesto += this.precio * 0.02;
        return impuesto;
    }
}
