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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "farmacos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Farmacos.findAll", query = "SELECT f FROM Farmacos f")
    , @NamedQuery(name = "Farmacos.findByIdFarmacos", query = "SELECT f FROM Farmacos f WHERE f.idFarmacos = :idFarmacos")
    , @NamedQuery(name = "Farmacos.findByDescripcion", query = "SELECT f FROM Farmacos f WHERE f.descripcion = :descripcion")
    , @NamedQuery(name = "Farmacos.findByEstado", query = "SELECT f FROM Farmacos f WHERE f.estado = :estado")})
public class Farmacos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdFarmacos")
    private Integer idFarmacos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Estado")
    private boolean estado;

    public Farmacos() {
    }

    public Farmacos(Integer idFarmacos) {
        this.idFarmacos = idFarmacos;
    }

    public Farmacos(Integer idFarmacos, String descripcion, boolean estado) {
        this.idFarmacos = idFarmacos;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Integer getIdFarmacos() {
        return idFarmacos;
    }

    public void setIdFarmacos(Integer idFarmacos) {
        this.idFarmacos = idFarmacos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        hash += (idFarmacos != null ? idFarmacos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Farmacos)) {
            return false;
        }
        Farmacos other = (Farmacos) object;
        if ((this.idFarmacos == null && other.idFarmacos != null) || (this.idFarmacos != null && !this.idFarmacos.equals(other.idFarmacos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CRUD.Farmacos[ idFarmacos=" + idFarmacos + " ]";
    }
    
}
