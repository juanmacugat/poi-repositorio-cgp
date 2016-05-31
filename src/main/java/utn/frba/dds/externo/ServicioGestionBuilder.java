package utn.frba.dds.externo;

public class ServicioGestionBuilder {

	private ServicioDTO servicio;

	public ServicioGestionBuilder(String nombre) {
		this.servicio = new ServicioDTO();
		this.servicio.setNombre(nombre);
	}

	public ServicioDTO build() {
		return servicio;
	}

	public ServicioGestionBuilder setNombre(String nombre) {
		this.servicio.setNombre(nombre);
		return this;
	}

	public ServicioGestionBuilder agregarHorarioDisponible(RangoServicioDTO rango) {
		this.servicio.agregarRango(rango);
		return this;
	}

}
