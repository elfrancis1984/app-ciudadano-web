package ec.gob.mdt.ciudadano.model.legacy;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import ec.gob.mdt.ciudadano.model.converter.ConverterGenero;

/**
 * The persistent class for the sgi_persona database table.
 * 
 */
@Entity
@Table(name = "sgi_persona")
public class EntidadPersonaSgi implements Serializable {

	private static final long serialVersionUID = 6175721090073205914L;

	@Id
	@Column(name = "per_identificacion")
	private String identificacion;

	@Column(name = "aud_estado")
	private boolean audEstado;

	@Column(name = "per_apellidos")
	private String apellidos;

	@Column(name = "per_mail")
	private String correo;

	@Column(name = "per_nombres")
	private String nombres;

	@Column(name = "per_nacionalidad")
	private String nacionalidad;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "per_fecha_nacimiento")
	private Date fechaNacimiento;

	@Convert(converter = ConverterGenero.class)
	@Column(name = "det_id_genero")
	private String genero;

	@Column(name = "per_telefono")
	private String telefono;

	public EntidadPersonaSgi() {
	}

	public String getIdentificacion() {
		return this.identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public boolean isAudEstado() {
		return audEstado;
	}

	public void setAudEstado(boolean audEstado) {
		this.audEstado = audEstado;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getNombreCompleto() {
		return nombres + " " + apellidos;
	}
}