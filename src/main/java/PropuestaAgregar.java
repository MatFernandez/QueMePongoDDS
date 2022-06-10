public class PropuestaAgregar implements PropuestaDeModificacion {

  public void aceptar(Usuario usuario, Guardarropas guardarropas, Prenda prenda) {
    usuario.agregarPrenda(prenda, guardarropas);
  }

  @Override
  public void deshacer(Usuario usuario, Guardarropas guardarropas, Prenda prenda) {
    usuario.quitarPrenda(prenda, guardarropas);
  }


}
