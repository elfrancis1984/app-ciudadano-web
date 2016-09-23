package ec.gob.mdt.ciudadano.model.app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import ec.gob.mdt.ciudadano.model.app.base.BaseEntity;

@Entity
@Table(name = "rol", schema = "seguridad")
public class Rol extends BaseEntity {

	private static final long serialVersionUID = -8059510715658032582L;

	public static final String FIND_ALL = "ec.gob.mdt.ciudadano.model.Rol.findAll";
	public static final String GENERATOR_ROL = "GENERATOR_ROL";
	public static final String SEQUENCE_ROL = "SEQUENCE_ROL";

	public static final String ROL_ADMINISTRADOR = "administrador";
	public static final String ROL_EDITOR = "editor";
	public static final String ROL_USUARIO = "usuario";	
	public static final String AUTHORIZED = "AUTHORIZED";	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GENERATOR_ROL)
	@SequenceGenerator(name = GENERATOR_ROL, sequenceName = SEQUENCE_ROL, schema = "seguridad", initialValue = 1, allocationSize = 1)
	private Integer id;

	@Column(unique = true)
	private String nombre;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Rol))
			return false;
		return ((Rol) obj).nombre.equals(nombre);
	}
}