package Vehiculos;

public class Camion extends Vehiculo {
    public Camion(String marca, double precio, int cilindraje) {
        super(marca, precio, cilindraje);
    }

    @Override
    public double calcularImpuestoCirculacion() {
        return this.precio * 0.03;  // Impuesto básico para camiones
    }
}
