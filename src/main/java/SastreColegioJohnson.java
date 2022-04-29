public class SastreColegioJohnson implements Sastre{
  public Prenda crearParteSuperior() {
    PrendaBorrador parteSuperior = new PrendaBorrador();
    parteSuperior.cargarTipoDePrenda(TipoDePrenda.CAMISA);
    parteSuperior.cargarColorPrincipal(new Color(255, 255, 255));
    parteSuperior.cargarMaterial(Material.ALGODON);
    return parteSuperior.guardarPrenda();
  }

  public Prenda crearParteInferior() {
    PrendaBorrador parteInferior = new PrendaBorrador();
    parteInferior.cargarTipoDePrenda(TipoDePrenda.PANTALON_DE_VESTIR);
    parteInferior.cargarColorPrincipal(new Color(0, 0, 0));
    parteInferior.cargarMaterial(Material.LINO);
    return parteInferior.guardarPrenda();
  }

  public Prenda crearCalzado() {
    PrendaBorrador calzado = new PrendaBorrador();
    calzado.cargarTipoDePrenda(TipoDePrenda.ZAPATOS);
    calzado.cargarColorPrincipal(new Color(0, 0, 0));
    calzado.cargarMaterial(Material.CUERO);
    return calzado.guardarPrenda();
  }

}


