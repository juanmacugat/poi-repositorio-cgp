package utn.frba.dds.externo;

public class CGPBuilder {

	private CentroDTO cgp;

	public CGPBuilder(int numeroComuna) {
		cgp = new CentroDTO();
		cgp.setComuna(numeroComuna);
	}

	public CentroDTO build() {
		return cgp;
	}

	public CGPBuilder setZonas(String zonas) {
		cgp.setZonas(zonas);
		return this;
	}

	public CGPBuilder setDirector(String director) {
		cgp.setDirector(director);
		return this;
	}

	public CGPBuilder setDomicilio(String domicilio) {
		cgp.setDomicilio(domicilio);
		return this;
	}

	public CGPBuilder setTelefono(String telefono) {
		cgp.setTelefono(telefono);
		return this;
	}

	public CGPBuilder agregarServicio(ServicioDTO servicio) {
		cgp.agregarServicio(servicio);
		return this;
	}

}
