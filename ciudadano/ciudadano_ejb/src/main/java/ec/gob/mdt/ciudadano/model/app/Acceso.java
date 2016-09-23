package ec.gob.mdt.ciudadano.model.app;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import ec.gob.mdt.ciudadano.model.app.base.BaseEntity;

@NamedQueries({ @NamedQuery(name = Acceso.FIND_ALL, query = "SELECT a FROM Acceso a ORDER BY a.fecha DESC") })
@Entity
@Table(name = "acceso", schema = "seguridad")
public class Acceso extends BaseEntity {

	private static final long serialVersionUID = 3504358649554676892L;

	public static final String FIND_ALL = "ec.gob.mdt.ciudadano.model.Acceso.findAll";
	public static final String GENERATOR_ACCESO = "GENERATOR_ACCESO";
	public static final String SEQUENCE_ACCESO = "SEQUENCE_ACCESO";

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GENERATOR_ACCESO)
	@SequenceGenerator(name = GENERATOR_ACCESO, sequenceName = SEQUENCE_ACCESO, schema = "seguridad", initialValue = 1, allocationSize = 1)
	private Integer id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	private String usuario;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Acceso))
			return false;
		return ((Acceso) obj).id.equals(id);
	}
}