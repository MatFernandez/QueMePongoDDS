
  public class Propuesta {
  Prenda prendaPropuesta;
  PropuestaDeModificacion propuestaModificacion;
  Guardarropas guardarropas;
  CondicionPropuesta condicion;

  public Propuesta(Guardarropas Guardarropas, Prenda prendaPropuesta, PropuestaDeModificacion propuestaModificacion) {
      this.guardarropas = Guardarropas;
      this.prendaPropuesta = prendaPropuesta;
      this.propuestaModificacion= propuestaModificacion;
    }
    public Prenda getPrendaPropuesta() {
      return prendaPropuesta;
    }

    public PropuestaDeModificacion getPropuestaModificacion() {
      return propuestaModificacion;
    }

    public Guardarropas getGuardarropas() {
      return guardarropas;
    }
    public void aceptarPropuesta(Usuario usuario) {
      propuestaModificacion.aceptar(usuario, guardarropas, prendaPropuesta);
      this.condicion = condicion.ACEPTADA;
    }

    public void rechazarPropuesta() {
    this.condicion = condicion.RECHAZADA;
  }

    public void deshacerPropuesta(Usuario usuario) {
      propuestaModificacion.deshacer(usuario, guardarropas, prendaPropuesta);
    }


}
