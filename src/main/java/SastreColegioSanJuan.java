public class SastreColegioSanJuan {

  public Prenda crearParteSuperior() {
    PrendaBorrador parteSuperior = new PrendaBorrador();
    parteSuperior.cargarTipoDePrenda(TipoDePrenda.CHOMBA);
    parteSuperior.cargarColorPrincipal(new Color(0, 100, 0));
    parteSuperior.cargarMaterial(Material.PIQUE);
    return parteSuperior.guardarPrenda();
  }

  public Prenda crearParteInferior() {
    PrendaBorrador parteInferior = new PrendaBorrador();
    parteInferior.cargarTipoDePrenda(TipoDePrenda.PANTALON);
    parteInferior.cargarColorPrincipal(new Color(128, 128, 128));
    parteInferior.cargarMaterial(Material.ACETATO);
    return parteInferior.guardarPrenda();
  }

  public Prenda crearCalzado() {
    PrendaBorrador calzado = new PrendaBorrador();
    calzado.cargarTipoDePrenda(TipoDePrenda.ZAPATILLAS);
    calzado.cargarColorPrincipal(new Color(255, 255, 255));
    calzado.cargarMaterial(Material.LONA);
    return calzado.guardarPrenda();
  }
}
