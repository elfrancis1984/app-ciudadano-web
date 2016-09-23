package ec.gob.mdt.ciudadano.web.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import ec.gob.mdt.ciudadano.ejb.facade.legacy.EmpleadoEmpresaFacade;
import ec.gob.mdt.ciudadano.model.legacy.EntidadEmpleadoEmpresaSgi;
import ec.gob.mdt.ciudadano.model.legacy.EntidadPersonaSgi;

@Named
@ViewScoped
public class EmpleadoBean implements Serializable {

	private static final long serialVersionUID = -228645803100837223L;

	private List<EntidadEmpleadoEmpresaSgi> empleadosEmpresa;

	private EntidadPersonaSgi entidadPersonaSgi;

	@EJB
	private EmpleadoEmpresaFacade empleadoEmpresaFacade;

	@PostConstruct
	public void init() {
		empleadosEmpresa = empleadoEmpresaFacade.getListaEmpleadosEmpresas("0100014141");
	}

	public List<EntidadEmpleadoEmpresaSgi> getEmpleadosEmpresa() {
		return empleadosEmpresa;
	}

	public EntidadPersonaSgi getEntidadPersonaSgi() {
		if (empleadosEmpresa != null && !empleadosEmpresa.isEmpty() && entidadPersonaSgi == null) {
			entidadPersonaSgi = empleadosEmpresa.get(0).getDatosPersonales();
		}
		return entidadPersonaSgi;
	}
}
