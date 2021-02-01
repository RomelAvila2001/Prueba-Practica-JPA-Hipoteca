/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 *
 * @author NANCY
 */
@Entity
@NamedQuery(name = "Bienes.findAll", query = "SELECT b FROM Bienes b")
public class Bienes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String Direccion;
    @Column
    private String calles;
    @Column
    private String numero;
    @Column
    private double precio;

    public Bienes() {
    }

    public Bienes(Long id, String Direccion, String calles, String numero, double precio) {
        this.id = id;
        this.Direccion = Direccion;
        this.calles = calles;
        this.numero = numero;
        this.precio = precio;
    }

    public Bienes(String Direccion, String calles, String numero, double precio) {
        this.Direccion = Direccion;
        this.calles = calles;
        this.numero = numero;
        this.precio = precio;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCalles() {
        return calles;
    }

    public void setCalles(String calles) {
        this.calles = calles;
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
        if (!(object instanceof Bienes)) {
            return false;
        }
        Bienes other = (Bienes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bienes{" + "id=" + id + ", Direccion=" + Direccion + ", calles=" + calles + ", numero=" + numero + ", precio=" + precio + '}';
    } 
    
}
