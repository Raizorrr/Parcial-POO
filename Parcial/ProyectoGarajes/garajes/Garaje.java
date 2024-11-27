package garajes;

import excepciones.*;
import vehiculos.*;
import java.util.ArrayList;

public class Garaje {
    private String departamento;
    private String ciudad;
    private String direccion;
    private String telefono;
    private String email;
    private String administrador;
    private int numeroEspacios;
    private ArrayList<Vehiculo> vehiculos;

    public Garaje(String departamento, String ciudad, String direccion, String telefono, String email, String administrador, int numeroEspacios) {
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.administrador = administrador;
        this.numeroEspacios = numeroEspacios;
        this.vehiculos = new ArrayList<>();
    }

    public boolean alquilarEspacio(Vehiculo vehiculo) throws GarajeLlenoException, ExcesoMotosException, ExcesoCamionesException, VehiculoYaRegistradoException {
        if (vehiculos.size() >= numeroEspacios) {
            throw new GarajeLlenoException("El garaje está lleno.");
        }
        
        if (vehiculo instanceof Moto && obtenerCantidadMotos() >= numeroEspacios * 0.2) {
            throw new ExcesoMotosException("El número de motos ha superado el límite permitido.");
        }
        
        if (vehiculo instanceof Camion && obtenerCantidadCamiones() >= (numeroEspacios < 100 ? 10 : 20)) {
            throw new ExcesoCamionesException("El número de camiones ha superado el límite permitido.");
        }
        
        if (vehiculos.contains(vehiculo)) {
            throw new VehiculoYaRegistradoException("El vehículo ya está registrado en este garaje.");
        }
        
        vehiculos.add(vehiculo);
        return true;
    }

    public boolean retirarVehiculo(String placa) {
        return vehiculos.removeIf(v -> v.getPlaca().equals(placa));
    }

    public int obtenerCantidadMotos() {
        return (int) vehiculos.stream().filter(v -> v instanceof Moto).count();
    }

    public int obtenerCantidadCamiones() {
        return (int) vehiculos.stream().filter(v -> v instanceof Camion).count();
    }

    public double calcularIngresos() {
        return vehiculos.stream().mapToDouble(Vehiculo::getCuotaMesGaraje).sum();
    }
}
