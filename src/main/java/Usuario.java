import java.util.List;

public class Usuario {
  Guardarropas guardarropas = new Guardarropas();
  String ciudad;


  public Usuario(String ciudad) {
    this.ciudad = ciudad;
  }

  public void agregarPrenda(Prenda prenda){
    guardarropas.agregarPrenda(prenda);
  }

  public List<Prenda> getPrendas() {
    return guardarropas.getPrendas();
  }
  public List<Atuendo> recibirSugerenciaClimatica(){
    ServicioMeteorologico servicioMeteorologico = new ServicioMeteorologico(ciudad);
    SugerenciasClimaticas sugerenciaClima = new SugerenciasClimaticas(servicioMeteorologico.getTemperaturaActual());
    return sugerenciaClima.generarSugerencias(guardarropas.getPrendas());
  }
  

}