/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Keysi Ramirez
 */
@Entity
@Table(name = "pacientes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pacientes.findAll", query = "SELECT p FROM Pacientes p")
    , @NamedQuery(name = "Pacientes.findByIdpacientes", query = "SELECT p FROM Pacientes p WHERE p.idpacientes = :idpacientes")
    , @NamedQuery(name = "Pacientes.findByCarnet", query = "SELECT p FROM Pacientes p WHERE p.carnet = :carnet")
    , @NamedQuery(name = "Pacientes.findByCedula", query = "SELECT p FROM Pacientes p WHERE p.cedula = :cedula")
    , @NamedQuery(name = "Pacientes.findByEstado", query = "SELECT p FROM Pacientes p WHERE p.estado = :estado")
    , @NamedQuery(name = "Pacientes.findByNombre", query = "SELECT p FROM Pacientes p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Pacientes.findByTipo", query = "SELECT p FROM Pacientes p WHERE p.tipo = :tipo")})
public class Pacientes implements Serializable {

    @Column(name = "ESTADO")
    private Boolean estado;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPACIENTES")
    private Integer idpacientes;
    @Size(max = 255)
    @Column(name = "CARNET")
    private String carnet;
    @Column(name = "CEDULA")
    private Integer cedula;
    @Size(max = 255)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 255)
    @Column(name = "TIPO")
    private String tipo;

    public Pacientes() {
    }

    public Pacientes(Integer idpacientes) {
        this.idpacientes = idpacientes;
    }

    public Integer getIdpacientes() {
        return idpacientes;
    }

    public void setIdpacientes(Integer idpacientes) {
        this.idpacientes = idpacientes;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpacientes != null ? idpacientes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pacientes)) {
            return false;
        }
        Pacientes other = (Pacientes) object;
        if ((this.idpacientes == null && other.idpacientes != null) || (this.idpacientes != null && !this.idpacientes.equals(other.idpacientes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CRUD.Pacientes[ idpacientes=" + idpacientes + " ]";
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    
}
