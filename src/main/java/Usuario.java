import java.util.ArrayList;
import java.util.List;

public class Usuario {
  List<Guardarropas> guardarropas = new ArrayList<>();
  List<Propuesta> propuestas = new ArrayList<>();
  String ciudad;


  public Usuario(String ciudad) {
    this.ciudad = ciudad;
  }

  public void agregarPrenda(Prenda prenda, Guardarropas guardarropas) {
    guardarropas.agregarPrenda(prenda);
  }

  public void quitarPrenda(Prenda prenda, Guardarropas guardarropas) {
    guardarropas.quitarPrenda(prenda);
  }


  public List<Prenda> getPrendas() {
    return guardarropas.get(0).getPrendas();
  }

  public List<Atuendo> recibirSugerenciaClimatica() {
    ServicioMeteorologico servicioMeteorologico = new ServicioMeteorologico(ciudad);
    SugerenciasClimaticas sugerenciaClima = new SugerenciasClimaticas(servicioMeteorologico.getTemperaturaActual());
    return sugerenciaClima.generarSugerencias(guardarropas.get(0).getPrendas());
  }


  public void agregarGuardarropas(Guardarropas unGuardarropas) {
    guardarropas.add(unGuardarropas);
  }

  public void eliminarGuardarropas(Guardarropas unGuardarropas) {
    guardarropas.remove(unGuardarropas);
  }

  public void recibirNuevaPropuesta(Guardarropas guardarropas, Prenda prenda, PropuestaDeModificacion propuestaDeModificacion) {
    Propuesta propuesta = new Propuesta(guardarropas, prenda, propuestaDeModificacion);
    propuestas.add(propuesta);
  }

  public void aceptarPropuestaRecibida(Propuesta propuesta) {
    propuesta.aceptarPropuesta(this);
  }

  public void rechazarPropuestaRecibida(Propuesta propuesta) {
    propuesta.rechazarPropuesta();
  }
}