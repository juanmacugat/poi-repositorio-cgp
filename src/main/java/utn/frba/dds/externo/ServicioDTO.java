package utn.frba.dds.externo;

import java.util.ArrayList;
import java.util.List;

public class ServicioDTO {

	private String nombre;
	private List<RangoServicioDTO> horariosDisponibles = new ArrayList<RangoServicioDTO>();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<RangoServicioDTO> getHorariosDisponibles() {
		return horariosDisponibles;
	}

	public void setHorariosDisponibles(List<RangoServicioDTO> horariosDisponibles) {
		this.horariosDisponibles = horariosDisponibles;
	}

	public boolean matchea(String criterio) {

		if (getNombre().equals("Mesa de informes"))
			return getNombre().contains(criterio);

		return false;
	}

	public void agregarRango(RangoServicioDTO rango) {
		this.horariosDisponibles.add(rango);
	}

}
