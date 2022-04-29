
public class Color {

  Integer rojo;
  Integer verde;
  Integer azul;

  public Color(Integer rojo, Integer verde, Integer azul) {
    if(rojo > 256 || rojo < 0){
      throw new RuntimeException("El valor del color rojo debe estar comprendido entre 0 y 256");
    }
    if(verde > 256 || verde < 0){
      throw new RuntimeException("El valor del color verde debe estar comprendido entre 0 y 256");
    }
    if(azul > 256 || azul < 0){
      throw new RuntimeException("El valor del color azul debe estar comprendido entre 0 y 256");
    }
    this.rojo = rojo;
    this.verde = verde;
    this.azul = azul;
  }

}