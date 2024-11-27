package Vehiculos;

public class Camioneta extends Vehiculo {
    private String tipoServicio;
    private boolean tieneRemolque;

    public Camioneta(String marca, double precio, int cilindraje, String tipoServicio, boolean tieneRemolque) {
        super(marca, precio, cilindraje);
        this.tipoServicio = tipoServicio;
        this.tieneRemolque = tieneRemolque;
    }

    @Override
    public double calcularImpuestoCirculacion() {
        return this.precio * 0.02;  // Impuesto básico
    }
}
