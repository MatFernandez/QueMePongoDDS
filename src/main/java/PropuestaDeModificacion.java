public interface PropuestaDeModificacion {

  void deshacer(Usuario usuario, Guardarropas guardarropas, Prenda prenda);
  void aceptar(Usuario usuario, Guardarropas guardarropas, Prenda prenda);

}
