public class TipoDePrenda {

  Categoria categoria;

  private TipoDePrenda(Categoria categoria) {
    this.categoria = categoria;
  }

  public Categoria getCategoria() {
    return this.categoria;
  }

  public static final TipoDePrenda ZAPATILLAS = new TipoDePrenda(Categoria.CALZADO);
  public static final TipoDePrenda ZAPATOS = new TipoDePrenda(Categoria.CALZADO);
  public static final TipoDePrenda ZAPATILLAS_CONVERSE = new TipoDePrenda(Categoria.CALZADO);
  public static final TipoDePrenda CROCS = new TipoDePrenda(Categoria.CALZADO);
  public static final TipoDePrenda MUSCULOSA = new TipoDePrenda(Categoria.PARTE_SUPERIOR);
  public static final TipoDePrenda CAMISA = new TipoDePrenda(Categoria.PARTE_SUPERIOR);
  public static final TipoDePrenda REMERA_MANGA_CORTA = new TipoDePrenda(Categoria.PARTE_SUPERIOR);
  public static final TipoDePrenda REMERA_MANGA_LARGA = new TipoDePrenda(Categoria.PARTE_SUPERIOR);
  public static final TipoDePrenda PANTALON_REGALADO = new TipoDePrenda(Categoria.PARTE_INFERIOR);
  public static final TipoDePrenda PANTALON_DE_VESTIR = new TipoDePrenda(Categoria.PARTE_INFERIOR);
  public static final TipoDePrenda CHOMBA = new TipoDePrenda(Categoria.PARTE_SUPERIOR);
  public static final TipoDePrenda PANTALON = new TipoDePrenda(Categoria.PARTE_INFERIOR);
  public static final TipoDePrenda POLLERA = new TipoDePrenda(Categoria.PARTE_INFERIOR);
  public static final TipoDePrenda ANTEOJOS_DE_SOL = new TipoDePrenda(Categoria.ACCESORIO);
  public static final TipoDePrenda PAÑUELO = new TipoDePrenda(Categoria.ACCESORIO);
}