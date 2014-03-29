/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gob.mx.tfjfa.sctji.entity;

/**
 * Tesis.java
 * Fecha de creacion: Mar 03, 2011, 4:55:26 PM
 * Tesis del TFJFA Objeto de Dominio
 */

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.hibernate.annotations.GenericGenerator;

/**
 * Entidad Cliente
 * @author Juan Carlos Molina Castellanos(jcmc09@gmail.com)
 * @version 1.0
 * @since 1.0
 */
/**
 * @author neodark
 *
 */
@Entity
@Table(name = "tesis")
public class Tesis implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5879091018964038527L;
	@Id
  @Column(name = "id_tesis")
	@GeneratedValue(strategy=GenerationType.AUTO)
  private long idTesis;
	
	
  @Column(name = "cve_tesis")
    private String cveTesis;
	
	@Column(name = "no_reg")
    private long noReg;
	
	@Column(name = "materia")
    private String materia;
	
	@Column(name = "cve_epoca")
    private String cveEpoca;
	
	@Column(name = "rubro")
    private String rubro;
	
	@Column(name = "texto")
    private String texto;
	
	@Column(name = "precedente")
    private String precedente;
	
	@Column(name = "referencia")
    private String referencia;
	
	@Column(name = "sala_pleno")
    private String salaPleno;
	
	@Column(name = "cve_unica")
    private String cveUnica;
	
	
	
	/*
	@ManyToOne
	@JoinColumn(name = "cve_unica")
	private Sentencia sentencia;
	*/
	
  public long getIdTesis() {
    return idTesis;
  }

  public void setIdTesis(long idTesis) {
    this.idTesis=idTesis;
  }

  /*
  public Sentencia getSentencia() {
    return sentencia;
  }

  public void setSentencia(Sentencia sentencia) {
    this.sentencia=sentencia;
  }

*/
  public String getCveTesis() {
		return cveTesis;
	}

	public void setCveTesis(String cveTesis) {
		this.cveTesis = cveTesis;
	}
    
	public String getCveUnica() {
		return cveUnica;
	}

	public void setCveUnica(String cveUnica) {
		this.cveUnica = cveUnica;
	}
	
	
	public long getNoReg() {
		return noReg;
	}

	public void setNoReg(long noReg) {
		this.noReg = noReg;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getCveEpoca() {
		return cveEpoca;
	}

	public void setCveEpoca(String cveEpoca) {
		this.cveEpoca = cveEpoca;
	}

	public String getRubro() {
		return rubro;
	}

	public void setRubro(String rubro) {
		this.rubro = rubro;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getPrecedente() {
		return precedente;
	}

	public void setPrecedente(String precedente) {
		this.precedente = precedente;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getSalaPleno() {
		return salaPleno;
	}

	public void setSalaPleno(String salaPleno) {
		this.salaPleno = salaPleno;
	}

	
}
