/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pablog23
 */
@Entity
@Table(name = "CapDif")
@XmlRootElement

public class CapDif implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idCapDif")
    private Integer idCapDif;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "capDif")
    private Collection<Alumno> alumnoCollection;
    
    public CapDif() {
    }

    public CapDif(Integer idCapDif) {
        this.idCapDif = idCapDif;
    }

    public CapDif(Integer idCapDif, String nombre) {
        this.idCapDif = idCapDif;
        this.nombre = nombre;
    }

    public Integer getIdCapDif() {
        return idCapDif;
    }

    public void setIdCapDif(Integer idCapDif) {
        this.idCapDif = idCapDif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCapDif != null ? idCapDif.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CapDif)) {
            return false;
        }
        CapDif other = (CapDif) object;
        if ((this.idCapDif == null && other.idCapDif != null) || (this.idCapDif != null && !this.idCapDif.equals(other.idCapDif))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.CapDif[ idCapDif=" + idCapDif + " ]";
    }
    
}
