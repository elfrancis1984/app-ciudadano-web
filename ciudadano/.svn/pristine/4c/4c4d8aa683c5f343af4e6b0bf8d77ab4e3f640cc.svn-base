package ec.gob.mdt.ciudadano.model.legacy;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the sgi_empleado_empresa database table.
 * 
 */
@Entity
@Table(name = "sgi_empleado_empresa")
@NamedQueries({ @NamedQuery(name = EntidadEmpleadoEmpresaSgi.NAMED_QUERY_CARGAR_POR_CEDULA, query = "select ee from EntidadEmpleadoEmpresaSgi ee where ee.id.perIdentificacion = :cedula") })
public class EntidadEmpleadoEmpresaSgi implements Serializable {

	private static final long serialVersionUID = 6934609553981082771L;

	public static final String NAMED_QUERY_CARGAR_POR_CEDULA = "EntidadEmpleadoEmpresaSgi.cargarPorCedula";

	@EmbeddedId
	private EntidadEmpleadoEmpresaSgiPK id;

	@Column(name = "aud_estado")
	private boolean audEstado;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_ruc")
	private EntidadEmpresaSgi empresa;

	// uni-directional many-to-one association to EntidadPersonaSgi
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "per_identificacion")
	private EntidadPersonaSgi datosPersonales;

	@Column(name = "eem_registrado_mdt")
	private boolean registradoMdt;

	@Column(name = "eem_fecha_registro_mdt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaRegistroMdt;

	@Column(name = "eem_fecha_registro_contrato_mdt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaRegistroContratoMdt;

	@Column(name = "eem_finiquitado_mdt")
	private boolean finiquitadoMdt;

	@Column(name = "eem_fecha_finiquito")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaFiniquito;

	@Column(name = "eem_fecha_fin_contrato")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaFiniquitoFirmada;

	@Column(name = "eem_decimo_tercero_b_mdt")
	private boolean decimoTerceroBMdt;

	@Column(name = "eem_decimo_tercero_v_mdt")
	private BigDecimal decimoTerceroVMdt;

	@Column(name = "eem_decimo_cuarto_b_mdt")
	private boolean decimoCuartoBMdt;

	@Column(name = "eem_decimo_cuarto_v_mdt")
	private BigDecimal decimoCuartoVMdt;

	@Column(name = "eem_fondos_b_mdt")
	private boolean fondosBMdt;

	@Column(name = "eem_fondos_v_mdt")
	private BigDecimal fondosVMdt;

	@Column(name = "eem_utilidades_b_mdt")
	private boolean utilidadesBMdt;

	@Column(name = "eem_utilidades_v_mdt")
	private BigDecimal utilidadesVMdt;

	@Column(name = "eem_extranjero_mdt")
	private boolean extranjeroMdt;

	@Column(name = "eem_sustituto_mdt")
	private boolean sustitutoMdt;

	@Column(name = "eem_discapacitado_mdt")
	private boolean discapacitadoMdt;

	@Column(name = "eem_registrado_iess")
	private boolean registradoIess;

	@Column(name = "eem_fecha_registro_iess")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaRegistroIess;

	@Column(name = "eem_aviso_salida_iess")
	private boolean avisoSalidaIess;

	@Column(name = "eem_fecha_salida_iess")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaSalidaIess;

	@Column(name = "eem_extranjero_iess")
	private boolean extranjeroIess;

	@Column(name = "eem_mora_patronal_b_iess")
	private boolean moraPatronalBIess;

	@Column(name = "eem_mora_patronal_v_iess")
	private BigDecimal moraPatronalVIess;

	@Column(name = "eem_registrado_ms")
	private boolean registradoMs;

	@Column(name = "eem_discapacitado_ms")
	private boolean discapacitadoMs;

	@Column(name = "eem_registrado_sri")
	private boolean registradoSri;

	@Column(name = "eem_impuesto_renta_b_sri")
	private boolean impuestoRentaBSri;

	@Column(name = "eem_impuesto_renta_v_sri")
	private BigDecimal impuestoRentaVSri;

	@Column(name = "eem_es_empresa")
	private boolean esEmpresa;

	@Column(name = "eem_es_considerado")
	private boolean esConsiderado;

	@JoinColumn(name = "per_identificacion_s")
	@ManyToOne
	private EntidadPersonaSgi sustituto;

	public EntidadEmpleadoEmpresaSgi() {
	}

	public EntidadEmpleadoEmpresaSgiPK getId() {
		return this.id;
	}

	public void setId(EntidadEmpleadoEmpresaSgiPK id) {
		this.id = id;
	}

	public EntidadEmpresaSgi getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(EntidadEmpresaSgi empresa) {
		this.empresa = empresa;
	}

	public EntidadPersonaSgi getDatosPersonales() {
		return this.datosPersonales;
	}

	public void setDatosPersonales(EntidadPersonaSgi datosPersonales) {
		this.datosPersonales = datosPersonales;
	}

	public boolean isAudEstado() {
		return audEstado;
	}

	public void setAudEstado(boolean audEstado) {
		this.audEstado = audEstado;
	}

	public boolean isRegistradoMdt() {
		return registradoMdt;
	}

	public void setRegistradoMdt(boolean registradoMdt) {
		this.registradoMdt = registradoMdt;
	}

	public Date getFechaRegistroMdt() {
		return fechaRegistroMdt == null ? null : new Date(fechaRegistroMdt.getTime());
	}

	public void setFechaRegistroMdt(Date fechaRegistroMdt) {
		this.fechaRegistroMdt = new Date(fechaRegistroMdt.getTime());
	}

	public Date getFechaRegistroContratoMdt() {
		return fechaRegistroContratoMdt;
	}

	public void setFechaRegistroContratoMdt(Date fechaRegistroContratoMdt) {
		this.fechaRegistroContratoMdt = fechaRegistroContratoMdt;
	}

	public boolean isFiniquitadoMdt() {
		return finiquitadoMdt;
	}

	public void setFiniquitadoMdt(boolean finiquitadoMdt) {
		this.finiquitadoMdt = finiquitadoMdt;
	}

	public Date getFechaFiniquito() {
		return fechaFiniquito == null ? null : new Date(fechaFiniquito.getTime());
	}

	public void setFechaFiniquito(Date fechaFiniquito) {
		this.fechaFiniquito = new Date(fechaFiniquito.getTime());
	}

	public Date getFechaFiniquitoFirmada() {
		return fechaFiniquitoFirmada;
	}

	public void setFechaFiniquitoFirmada(Date fechaFiniquitoFirmada) {
		this.fechaFiniquitoFirmada = fechaFiniquitoFirmada;
	}

	public boolean isDecimoTerceroBMdt() {
		return decimoTerceroBMdt;
	}

	public void setDecimoTerceroBMdt(boolean decimoTerceroBMdt) {
		this.decimoTerceroBMdt = decimoTerceroBMdt;
	}

	public BigDecimal getDecimoTerceroVMdt() {
		return decimoTerceroVMdt;
	}

	public void setDecimoTerceroVMdt(BigDecimal decimoTerceroVMdt) {
		this.decimoTerceroVMdt = decimoTerceroVMdt;
	}

	public boolean isDecimoCuartoBMdt() {
		return decimoCuartoBMdt;
	}

	public void setDecimoCuartoBMdt(boolean decimoCuartoBMdt) {
		this.decimoCuartoBMdt = decimoCuartoBMdt;
	}

	public BigDecimal getDecimoCuartoVMdt() {
		return decimoCuartoVMdt;
	}

	public void setDecimoCuartoVMdt(BigDecimal decimoCuartoVMdt) {
		this.decimoCuartoVMdt = decimoCuartoVMdt;
	}

	public boolean isFondosBMdt() {
		return fondosBMdt;
	}

	public void setFondosBMdt(boolean fondosBMdt) {
		this.fondosBMdt = fondosBMdt;
	}

	public BigDecimal getFondosVMdt() {
		return fondosVMdt;
	}

	public void setFondosVMdt(BigDecimal fondosVMdt) {
		this.fondosVMdt = fondosVMdt;
	}

	public boolean isUtilidadesBMdt() {
		return utilidadesBMdt;
	}

	public void setUtilidadesBMdt(boolean utilidadesBMdt) {
		this.utilidadesBMdt = utilidadesBMdt;
	}

	public BigDecimal getUtilidadesVMdt() {
		return utilidadesVMdt;
	}

	public void setUtilidadesVMdt(BigDecimal utilidadesVMdt) {
		this.utilidadesVMdt = utilidadesVMdt;
	}

	public boolean isExtranjeroMdt() {
		return extranjeroMdt;
	}

	public void setExtranjeroMdt(boolean extranjeroMdt) {
		this.extranjeroMdt = extranjeroMdt;
	}

	public boolean isSustitutoMdt() {
		return sustitutoMdt;
	}

	public void setSustitutoMdt(boolean sustitutoMdt) {
		this.sustitutoMdt = sustitutoMdt;
	}

	public boolean isDiscapacitadoMdt() {
		return discapacitadoMdt;
	}

	public void setDiscapacitadoMdt(boolean discapacitadoMdt) {
		this.discapacitadoMdt = discapacitadoMdt;
	}

	public boolean isRegistradoIess() {
		return registradoIess;
	}

	public void setRegistradoIess(boolean registradoIess) {
		this.registradoIess = registradoIess;
	}

	public Date getFechaRegistroIess() {
		return fechaRegistroIess == null ? null : new Date(fechaRegistroIess.getTime());
	}

	public void setFechaRegistroIess(Date fechaRegistroIess) {
		this.fechaRegistroIess = new Date(fechaRegistroIess.getTime());
	}

	public boolean isAvisoSalidaIess() {
		return avisoSalidaIess;
	}

	public void setAvisoSalidaIess(boolean avisoSalidaIess) {
		this.avisoSalidaIess = avisoSalidaIess;
	}

	public Date getFechaSalidaIess() {
		return fechaSalidaIess == null ? null : new Date(fechaSalidaIess.getTime());
	}

	public void setFechaSalidaIess(Date fechaSalidaIess) {
		this.fechaSalidaIess = new Date(fechaSalidaIess.getTime());
	}

	public boolean isExtranjeroIess() {
		return extranjeroIess;
	}

	public void setExtranjeroIess(boolean extranjeroIess) {
		this.extranjeroIess = extranjeroIess;
	}

	public boolean isMoraPatronalBIess() {
		return moraPatronalBIess;
	}

	public void setMoraPatronalBIess(boolean moraPatronalBIess) {
		this.moraPatronalBIess = moraPatronalBIess;
	}

	public BigDecimal getMoraPatronalVIess() {
		return moraPatronalVIess;
	}

	public void setMoraPatronalVIess(BigDecimal moraPatronalVIess) {
		this.moraPatronalVIess = moraPatronalVIess;
	}

	public boolean isRegistradoMs() {
		return registradoMs;
	}

	public void setRegistradoMs(boolean registradoMs) {
		this.registradoMs = registradoMs;
	}

	public boolean isDiscapacitadoMs() {
		return discapacitadoMs;
	}

	public void setDiscapacitadoMs(boolean discapacitadoMs) {
		this.discapacitadoMs = discapacitadoMs;
	}

	public boolean isRegistradoSri() {
		return registradoSri;
	}

	public void setRegistradoSri(boolean registradoSri) {
		this.registradoSri = registradoSri;
	}

	public boolean isImpuestoRentaBSri() {
		return impuestoRentaBSri;
	}

	public void setImpuestoRentaBSri(boolean impuestoRentaBSri) {
		this.impuestoRentaBSri = impuestoRentaBSri;
	}

	public BigDecimal getImpuestoRentaVSri() {
		return impuestoRentaVSri;
	}

	public void setImpuestoRentaVSri(BigDecimal impuestoRentaVSri) {
		this.impuestoRentaVSri = impuestoRentaVSri;
	}

	public EntidadPersonaSgi getSustituto() {
		return sustituto;
	}

	public void setSustituto(EntidadPersonaSgi sustituto) {
		this.sustituto = sustituto;
	}

	public boolean isEsEmpresa() {
		return esEmpresa;
	}

	public void setEsEmpresa(boolean esEmpresa) {
		this.esEmpresa = esEmpresa;
	}

	public boolean isEsConsiderado() {
		return esConsiderado;
	}

	public void setEsConsiderado(boolean esConsiderado) {
		this.esConsiderado = esConsiderado;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 73 * hash + (this.id != null ? this.id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final EntidadEmpleadoEmpresaSgi other = (EntidadEmpleadoEmpresaSgi) obj;
		if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

}