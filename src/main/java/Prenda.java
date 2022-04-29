public class Prenda {

  TipoDePrenda tipoDePrenda;
  Material material;
  Color colorPrincipal;
  Color colorSecundario;
  Trama trama;

  public Prenda(TipoDePrenda tipoDePrenda, Material material, Color colorPrincipal, Color colorSecundario, Trama trama) {

    if (tipoDePrenda == null || tipoDePrenda.categoria == null || material == null || colorPrincipal == null) {
      throw new ParametrosNulosEnLaPrenda();
    }

    this.tipoDePrenda = tipoDePrenda;
    this.material = material;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
    this.trama = trama;
  }

}