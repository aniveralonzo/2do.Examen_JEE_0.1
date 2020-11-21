/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aniver.sistema1rest;

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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user hp
 */
@Entity
@Table(name = "motocicleta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Motocicleta.findAll", query = "SELECT m FROM Motocicleta m")
    , @NamedQuery(name = "Motocicleta.findById", query = "SELECT m FROM Motocicleta m WHERE m.id = :id")
    , @NamedQuery(name = "Motocicleta.findByMarca", query = "SELECT m FROM Motocicleta m WHERE m.marca = :marca")
    , @NamedQuery(name = "Motocicleta.findByProveedor", query = "SELECT m FROM Motocicleta m WHERE m.proveedor = :proveedor")
    , @NamedQuery(name = "Motocicleta.findByAnio", query = "SELECT m FROM Motocicleta m WHERE m.anio = :anio")})
public class Motocicleta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "marca")
    private String marca;
    @Size(max = 45)
    @Column(name = "proveedor")
    private String proveedor;
    @Column(name = "anio")
    private Integer anio;

    public Motocicleta() {
    }

    public Motocicleta(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Motocicleta)) {
            return false;
        }
        Motocicleta other = (Motocicleta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aniver.sistema1rest.Motocicleta[ id=" + id + " ]";
    }
    
}
