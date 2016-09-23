package ec.gob.mdt.ciudadano.ejb.service;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class LegacySgiServiceBean {

	@PersistenceContext(unitName = "sgi_jpa")
	private EntityManager em;

	public EntityManager getEntityManager() {
		return em;
	}

	public Object getSecuenceNextValue(String sequenceName, String schema) {
		if (schema != null)
			sequenceName = schema + "." + sequenceName;
		Query query = getEntityManager().createNativeQuery("SELECT nextval( '" + sequenceName + "' ) FROM generate_series( 1, 1)");
		return query.getSingleResult();
	}

	public void updateSecuenceValue(String sequenceName, String schema, long value) {
		if (schema != null)
			sequenceName = schema + "." + sequenceName;
		Query query = getEntityManager().createNativeQuery("SELECT setval( '" + sequenceName + "', " + value + ", true)");
		query.getSingleResult();
	}

	public Object saveOrUpdate(Object entidad) {
		getEntityManager().persist(entidad);
		getEntityManager().flush();
		getEntityManager().refresh(entidad);
		return entidad;
	}

	public Object update(Object entidad) {
		return getEntityManager().merge(entidad);
	}

	public List<?> findByNamedQuery(final String namedQueryName, final Map<String, Object> parameters) {
		Query query = getEntityManager().createNamedQuery(namedQueryName);
		if (parameters != null) {
			for (Entry<String, Object> entry : parameters.entrySet()) {
				query.setParameter(entry.getKey(), entry.getValue());
			}
		}
		return query.getResultList();
	}

	public Object findByNamedQuerySingleResult(final String namedQueryName, final Map<String, Object> parameters) {
		Query query = getEntityManager().createNamedQuery(namedQueryName);
		if (parameters != null) {
			for (Entry<String, Object> entry : parameters.entrySet()) {
				query.setParameter(entry.getKey(), entry.getValue());
			}
		}
		try {
			return query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}
}
