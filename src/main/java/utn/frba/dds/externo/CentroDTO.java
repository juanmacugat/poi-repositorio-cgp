package utn.frba.dds.externo;

import java.util.ArrayList;
import java.util.List;

public class CentroDTO {

	private int comuna;
	private double latitud;
	private double longitud;
	private String zonas;
	private String nombreDirector;
	private String domicilio;
	private String telefono;
	private List<ServicioDTO> servicios = new ArrayList<ServicioDTO>();

	public String getDirector() {
		return nombreDirector;
	}

	public int getComuna() {
		return comuna;
	}

	public String getZonas() {
		return zonas;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setComuna(int numeroComuna) {
		this.comuna = numeroComuna;
	}

	public void setZonas(String zonas) {
		this.zonas = zonas;
	}

	public void setDirector(String director) {
		this.nombreDirector = director;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void agregarServicio(ServicioDTO servicio) {
		this.servicios.add(servicio);
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public boolean matchea(String criterio) {
		return getZonas().contains(criterio) || getDirector().contains(criterio) || getDomicilio().contains(criterio)
				|| getTelefono().contains(criterio)
				|| servicios.stream().anyMatch(servicio -> servicio.matchea(criterio));
	}

}
