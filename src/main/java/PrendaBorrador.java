import java.util.Objects;

public class PrendaBorrador {

  TipoDePrenda tipoDePrenda;
  Material material;
  Color colorPrincipal;
  Color colorSecundario;
  Trama trama = Trama.LISA;

  Double temperaturaMaxima;

  public PrendaBorrador cargarTipoDePrenda(TipoDePrenda prenda) {
    this.tipoDePrenda = Objects.requireNonNull(tipoDePrenda);
    return this;
  }

  public PrendaBorrador cargarMaterial(Material material) {
    this.material = Objects.requireNonNull(material);
    return this;
  }

  public PrendaBorrador cargarColorPrincipal(Color colorPrincipal) {
    this.colorPrincipal = Objects.requireNonNull(colorPrincipal);
    return this;
  }

  public PrendaBorrador cargarColorSecundario(Color colorSecundario) {
    this.colorSecundario = Objects.requireNonNull(colorSecundario);
    return this;
  }

  public PrendaBorrador cargarTrama(Trama trama) {
    if (trama == null) this.trama = null;
    else this.trama = trama;
    return this;
  }

  public Prenda guardarPrenda() {
    if (this.tipoDePrenda.getCategoria() == null) {
      throw new RuntimeException("Imposible crear la prenda. El tipo de prenda no puede ser nulo. ");
    }
    if (this.material == null) {
      throw new RuntimeException("Imposible crear la prenda. El material no puede ser nulo. ");
    }
    if (this.colorPrincipal == null) {
      throw new RuntimeException("Imposible crear la prenda. El color principal no puede ser nulo. ");
    }
    return new Prenda(this.tipoDePrenda, this.material, this.colorPrincipal, this.colorSecundario, this.trama, this.temperaturaMaxima);
  }

}
