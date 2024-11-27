package garajes;

import Vehiculos.*;
import excepciones.*;

import java.util.Scanner;

public class GestionEmpresa {

    private static RedGarajes redGarajes = new RedGarajes();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n----- Menú Gestión Empresa -----");
            System.out.println("1.- Crear garaje");
            System.out.println("2.- Eliminar garaje");
            System.out.println("3.- Ingresar vehículo");
            System.out.println("4.- Retirar vehículo");
            System.out.println("5.- Generar informes");
            System.out.println("6.- Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    crearGaraje();
                    break;
                case 2:
                    eliminarGaraje();
                    break;
                case 3:
                    ingresarVehiculo();
                    break;
                case 4:
                    retirarVehiculo();
                    break;
                case 5:
                    generarInformes();
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);
    }

    private static void crearGaraje() {
        System.out.println("Crear Garaje:");
        System.out.print("Ingrese nombre del garaje: ");
        String nombre = sc.nextLine();
        // Continúa pidiendo datos como ubicación, teléfono, etc.
    }
    
    private static void eliminarGaraje() {
        System.out.print("Ingrese ciudad del garaje a eliminar: ");
        String ciudad = sc.nextLine();
        try {
            Garaje garaje = redGarajes.obtenerGarajePorUbicacion(ciudad);
            redGarajes.eliminarGaraje(garaje);
            System.out.println("Garaje eliminado exitosamente.");
        } catch (GarajeInexistenteException e) {
            System.out.println(e.getMessage());
        }
    }
    
    private static void ingresarVehiculo() {
        System.out.print("Ingrese tipo de vehículo (Moto, Auto, Camioneta, Camion): ");
        String tipo = sc.nextLine().toLowerCase();
        Vehiculo vehiculo = null;
        
        switch (tipo) {
            case "moto":
                // Pide datos de moto y crea la instancia
                break;
            case "auto":
                // Pide datos de auto y crea la instancia
                break;
            case "camioneta":
                // Pide datos de camioneta y crea la instancia
                break;
            case "camion":
                // Pide datos de camión y crea la instancia
                break;
            default:
                System.out.println("Tipo de vehículo no válido.");
                return;
        }
        try {
            // Supón que seleccionas el garaje y lo alquilas
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    private static void retirarVehiculo() {
        // Retirar vehículo según placa
    }
    
    private static void generarInformes() {
        // Genera los informes de ocupación, recaudación, etc.
    }
}
