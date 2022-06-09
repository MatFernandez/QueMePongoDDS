public class Prenda {

  TipoDePrenda tipoDePrenda;
  Material material;
  Color colorPrincipal;
  Color colorSecundario;
  Trama trama;

  Double temperaturaMaxima;

  public Prenda(TipoDePrenda tipoDePrenda, Material material, Color colorPrincipal, Color colorSecundario, Trama trama, Double temperaturaMaxima) {

    if (tipoDePrenda == null || tipoDePrenda.categoria == null || material == null || colorPrincipal == null) {
      throw new ParametrosNulosEnLaPrenda();
    }

    this.tipoDePrenda = tipoDePrenda;
    this.material = material;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
    this.trama = trama;
    this.temperaturaMaxima = temperaturaMaxima;
  }


  public TipoDePrenda getTipoDePrenda() {
    return tipoDePrenda;
  }

  public boolean aptaParaTemperaturaEspecifica(Double temperatura){
    return temperatura < temperaturaMaxima;
  }


}