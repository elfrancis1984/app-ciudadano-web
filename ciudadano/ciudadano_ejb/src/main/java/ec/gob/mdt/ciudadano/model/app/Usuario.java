package ec.gob.mdt.ciudadano.model.app;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import ec.gob.mdt.ciudadano.model.app.base.BaseEntityAuditable;

@NamedQueries({ @NamedQuery(name = Usuario.FIND_BY_USER, query = "SELECT u FROM Usuario u WHERE u.usuario = :user"), @NamedQuery(name = Usuario.FIND_BY_USER_PASS, query = "SELECT u FROM Usuario u WHERE u.usuario = :user AND u.contrasenna = :pass") })
@Entity
@Table(name = "usuario", schema = "seguridad")
public class Usuario extends BaseEntityAuditable {

	private static final long serialVersionUID = 619347666865001926L;

	public static final String FIND_BY_USER = "ec.gob.mdt.ciudadano.model.Usuario.findByUser";
	public static final String FIND_BY_USER_PASS = "ec.gob.mdt.ciudadano.model.Usuario.findByUserPass";
	public static final String GENERATOR_USUARIO = "GENERATOR_USUARIO";
	public static final String SEQUENCE_USUARIO = "SEQUENCE_USUARIO";

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GENERATOR_USUARIO)
	@SequenceGenerator(name = GENERATOR_USUARIO, sequenceName = SEQUENCE_USUARIO, schema = "seguridad", initialValue = 1, allocationSize = 1)
	private Integer id;

	private String usuario;
	private String contrasenna;

	@ManyToMany
	@JoinTable(name = "usuario_rol", schema = "seguridad")
	private Set<Rol> roles;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasenna() {
		return contrasenna;
	}

	public void setContrasenna(String contrasenna) {
		this.contrasenna = contrasenna;
	}

	public Set<Rol> getRoles() {
		return roles;
	}

	public void setRoles(Set<Rol> roles) {
		this.roles = roles;
	}
}