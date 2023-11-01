/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Keysi Ramirez
 */
@Entity
@Table(name = "visitas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Visitas.findAll", query = "SELECT v FROM Visitas v")
    , @NamedQuery(name = "Visitas.findByIdVisita", query = "SELECT v FROM Visitas v WHERE v.idVisita = :idVisita")
    , @NamedQuery(name = "Visitas.findByMedico", query = "SELECT v FROM Visitas v WHERE v.medico = :medico")
    , @NamedQuery(name = "Visitas.findByPaciente", query = "SELECT v FROM Visitas v WHERE v.paciente = :paciente")
    , @NamedQuery(name = "Visitas.findByFecha", query = "SELECT v FROM Visitas v WHERE v.fecha = :fecha")
    , @NamedQuery(name = "Visitas.findByHora", query = "SELECT v FROM Visitas v WHERE v.hora = :hora")
    , @NamedQuery(name = "Visitas.findBySintomas", query = "SELECT v FROM Visitas v WHERE v.sintomas = :sintomas")
    , @NamedQuery(name = "Visitas.findByMedicamento", query = "SELECT v FROM Visitas v WHERE v.medicamento = :medicamento")
    , @NamedQuery(name = "Visitas.findByRecomendaciones", query = "SELECT v FROM Visitas v WHERE v.recomendaciones = :recomendaciones")
    , @NamedQuery(name = "Visitas.findByEstado", query = "SELECT v FROM Visitas v WHERE v.estado = :estado")})
public class Visitas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdVisita")
    private Integer idVisita;
    @Size(max = 50)
    @Column(name = "Medico")
    private String medico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Paciente")
    private String paciente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Hora")
    @Temporal(TemporalType.TIME)
    private Date hora;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Sintomas")
    private String sintomas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Medicamento")
    private String medicamento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Recomendaciones")
    private String recomendaciones;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Estado")
    private boolean estado;

    public Visitas() {
    }

    public Visitas(Integer idVisita) {
        this.idVisita = idVisita;
    }

    public Visitas(Integer idVisita, String paciente, Date fecha, Date hora, String sintomas, String medicamento, String recomendaciones, boolean estado) {
        this.idVisita = idVisita;
        this.paciente = paciente;
        this.fecha = fecha;
        this.hora = hora;
        this.sintomas = sintomas;
        this.medicamento = medicamento;
        this.recomendaciones = recomendaciones;
        this.estado = estado;
    }

    public Integer getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(Integer idVisita) {
        this.idVisita = idVisita;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVisita != null ? idVisita.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Visitas)) {
            return false;
        }
        Visitas other = (Visitas) object;
        if ((this.idVisita == null && other.idVisita != null) || (this.idVisita != null && !this.idVisita.equals(other.idVisita))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CRUD.Visitas[ idVisita=" + idVisita + " ]";
    }
    
}
