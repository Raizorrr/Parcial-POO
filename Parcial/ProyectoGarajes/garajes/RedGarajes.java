package garajes;

import excepciones.GarajeInexistenteException;
import java.util.ArrayList;

public class RedGarajes {
    private ArrayList<Garaje> garajes;

    public RedGarajes() {
        garajes = new ArrayList<>();
    }

    public void agregarGaraje(Garaje garaje) {
        garajes.add(garaje);
    }

    public void eliminarGaraje(Garaje garaje) {
        garajes.remove(garaje);
    }

    public Garaje obtenerGarajePorUbicacion(String ciudad) throws GarajeInexistenteException {
        return garajes.stream().filter(g -> g.getCiudad().equals(ciudad)).findFirst()
                .orElseThrow(() -> new GarajeInexistenteException("Garaje no encontrado en la ciudad: " + ciudad));
    }
}
