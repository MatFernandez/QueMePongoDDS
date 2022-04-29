public class Uniforme {

  Prenda prendaSuperior;
  Prenda prendaInferior;
  Prenda calzado;

  public Uniforme(Sastre sastre) {
    prendaSuperior = sastre.crearParteSuperior();
    prendaInferior = sastre.crearParteInferior();
    calzado = sastre.crearCalzado();
  }
}
