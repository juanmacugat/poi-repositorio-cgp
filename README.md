Repositorio CGPs
-------------------

Repositorio de CGP's publicos para ser consultados como dependencia externa para el Trabajo Práctico de Diseño de Sistemas - UTN FRBA 2016

Usage
-------------------

Agregar dependencia de maven al POM 

```xml
	<dependency>
  		<groupId>utn.frba.dds</groupId>
		<artifactId>poi-repositorio-cgp</artifactId>
		<version>0.0.1-SNAPSHOT</version>
	</dependency>
```
Crear una instancia de RepositorioCGPExterno

RepositorioCGPExterno repositorio = new RepositorioCGPExterno();
List<CentroDTO> resultado = repositorio.buscarCGPs("Av. de Mayo");

El servicio retorna una lista de CentroDTO con los CGP's que matchean el criterio de busqueda.
