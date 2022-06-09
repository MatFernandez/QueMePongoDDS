import java.util.ArrayList;
import java.util.List;

public class Guardarropas {
  List<Prenda> prendas;

  public Guardarropas() {
    this.prendas = new ArrayList<>();
  }

  public List<Prenda> getPrendas() {
    return prendas;
  }

  public void agregarPrenda(Prenda prenda){
    prendas.add(prenda);
  }

  public void quitarPrenda(Prenda prenda){
    prendas.remove(prenda);
  }


}