package Vehiculos;

public abstract class Vehiculo {
    protected String placa;
    protected String marca;
    protected double precio;
    protected int cilindraje;
    protected double cuotaMesGaraje;

    public Vehiculo(String marca, double precio, int cilindraje) {
        this.marca = marca;
        this.precio = precio;
        this.cilindraje = cilindraje;
        this.cuotaMesGaraje = 100;  // Cuota base
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public abstract double calcularImpuestoCirculacion();
    public double getCuotaMesGaraje() {
        return cuotaMesGaraje;
    }
}
