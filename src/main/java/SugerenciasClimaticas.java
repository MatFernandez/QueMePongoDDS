import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SugerenciasClimaticas {
  Double temperaturaActual;

  public SugerenciasClimaticas(Double temperaturaActual) {
    this.temperaturaActual = temperaturaActual;
  }

  public List<Atuendo> generarSugerencias(List<Prenda> prendasAptas) {
    List<Prenda> prendasConTemperaturaApta = prendasAptas.stream().
        filter(prenda -> prenda.aptaParaTemperaturaEspecifica(temperaturaActual)).
        collect(Collectors.toList());

    Prenda prendaSuperior = prendasConTemperaturaApta.stream().
        filter(prenda -> prenda.getTipoDePrenda().
            categoria.equals(Categoria.PARTE_SUPERIOR)).
        collect(Collectors.toList()).get(0);

    Prenda prendaInferior = prendasConTemperaturaApta.stream().
        filter(prenda -> prenda.getTipoDePrenda().
            categoria.equals(Categoria.PARTE_SUPERIOR)).
        collect(Collectors.toList()).get(0);

    Prenda calzado = prendasConTemperaturaApta.stream().
        filter(prenda -> prenda.getTipoDePrenda().
            categoria.equals(Categoria.CALZADO)).
        collect(Collectors.toList()).get(0);

    Prenda accesorio = prendasConTemperaturaApta.stream().
        filter(prenda -> prenda.getTipoDePrenda().
            categoria.equals(Categoria.ACCESORIO)).
        collect(Collectors.toList()).get(0);

    List<Atuendo> sugerencias = new ArrayList<>();
    sugerencias.add(new Atuendo(prendaSuperior, prendaInferior, calzado, accesorio));
    return sugerencias;
  }
}