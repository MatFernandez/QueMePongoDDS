public class Atuendo {
  Prenda prendaSuperior;
  Prenda prendaInferior;
  Prenda calzado;
  Prenda accesorio;

  public Atuendo(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado, Prenda accesorio) {
    validadorDeCategoriasDePrendas(prendaSuperior, prendaInferior, calzado, accesorio);
    this.prendaSuperior = prendaSuperior;
    this.prendaInferior = prendaInferior;
    this.calzado = calzado;
    this.accesorio = accesorio;
  }

  void validadorDeCategoriasDePrendas(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado, Prenda accesorio) {
    if (!prendaSuperior.getTipoDePrenda().categoria.equals(Categoria.PARTE_SUPERIOR)) {
      throw new CategoriaIncorrectaParaSugerencia("Prenda invalida para la parte superior");
    }
    if (!prendaInferior.getTipoDePrenda().categoria.equals(Categoria.PARTE_INFERIOR)) {
      throw new CategoriaIncorrectaParaSugerencia("Prenda invalida para la parte inferior");
    }
    if (!calzado.getTipoDePrenda().categoria.equals(Categoria.CALZADO)) {
      throw new CategoriaIncorrectaParaSugerencia("Prenda invalida para la parte calzado");
    }
    if (!accesorio.getTipoDePrenda().categoria.equals(Categoria.ACCESORIO)) {
      throw new CategoriaIncorrectaParaSugerencia("Prenda invalida para el accesorio");
    }
  }
}
