package ec.gob.mdt.ciudadano.web.rest;

import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ec.gob.mdt.ciudadano.ejb.facade.legacy.EmpleadoEmpresaFacade;
import ec.gob.mdt.ciudadano.model.app.Rol;
import ec.gob.mdt.ciudadano.model.legacy.EntidadEmpleadoEmpresaSgi;

@RolesAllowed({Rol.ROL_ADMINISTRADOR, Rol.ROL_USUARIO})
@Stateless
@Path("/empleados")
public class EmpleadoEmpresaRest {

	@EJB
	private EmpleadoEmpresaFacade empleadoEmpresaFacade;

	@GET
	@Path("/{cedula}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<EntidadEmpleadoEmpresaSgi> getListaPersonas(@PathParam("cedula") String cedula) {
		return empleadoEmpresaFacade.getListaEmpleadosEmpresas(cedula);
	}
}
