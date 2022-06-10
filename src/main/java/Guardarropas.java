import java.util.List;

public class Guardarropas {
  List<Prenda> prendas;

  public Guardarropas(List<Prenda> prendas) {
    this.prendas = prendas;
  }

  public List<Prenda> getPrendas() {
    return prendas;
  }

  public void agregarPrenda(Prenda prenda) {
    prendas.add(prenda);
  }

  public void quitarPrenda(Prenda prenda) {
    prendas.remove(prenda);
  }

}