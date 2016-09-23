package ec.gob.mdt.ciudadano.ejb.facade.legacy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import ec.gob.mdt.ciudadano.ejb.service.LegacySgiServiceBean;
import ec.gob.mdt.ciudadano.model.legacy.EntidadEmpleadoEmpresaSgi;

@Stateless
public class EmpleadoEmpresaFacade {

	@EJB
	private LegacySgiServiceBean legacySgiServiceBean;

	@SuppressWarnings("unchecked")
	public List<EntidadEmpleadoEmpresaSgi> getListaEmpleadosEmpresas(String cedula) {
		Map<String, Object> params = new HashMap<>();
		params.put("cedula", cedula);
		return (List<EntidadEmpleadoEmpresaSgi>) legacySgiServiceBean.findByNamedQuery(EntidadEmpleadoEmpresaSgi.NAMED_QUERY_CARGAR_POR_CEDULA, params);
	}
}
