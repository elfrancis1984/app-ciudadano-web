package ec.gob.mdt.ciudadano.model.app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import ec.gob.mdt.ciudadano.model.app.base.BaseEntityAuditable;

@NamedQueries({ @NamedQuery(name = Noticia.FIND_ALL, query = "SELECT n FROM Noticia n ORDER BY n.fechaActualizacion DESC") })
@Entity
@Table(name = "noticia", schema = "public")
public class Noticia extends BaseEntityAuditable {

	private static final long serialVersionUID = -8848052297710885892L;

	public static final String FIND_ALL = "ec.gob.mdt.ciudadano.model.Noticia.findAll";
	public static final String GENERATOR_NOTICIA = "GENERATOR_NOTICIA";
	public static final String SEQUENCE_NOTICIA = "SEQUENCE_NOTICIA";

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GENERATOR_NOTICIA)
	@SequenceGenerator(name = GENERATOR_NOTICIA, sequenceName = SEQUENCE_NOTICIA, initialValue = 1, allocationSize = 1)
	private Integer id;

	private String titulo;	

	@Column(columnDefinition = "text")
	private String cuerpo;

	private String imagen;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	@Override
	public String toString() {
		return titulo;
	}

}
