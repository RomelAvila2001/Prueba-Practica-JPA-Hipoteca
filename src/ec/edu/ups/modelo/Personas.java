/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author NANCY
 */
@Entity
@NamedQuery(name = "Personas.findAll", query = "SELECT p FROM Personas p")
@NamedQuery(name = "ConsultaCedula", query = "SELECT p FROM Personas p where p.cedula = :cedula")
public class Personas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column
    private String cedula;
    @Column
    private String tipo;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private double sueldo;
    @Column
    @Temporal(TemporalType.DATE)
    private Calendar fechaNacimiento;

    public Personas() {
    }

    public Personas(String cedula, String tipo, String nombre, String apellido, double sueldo, Calendar fechaNacimiento) {
        this.cedula = cedula;
        this.tipo = tipo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
        this.fechaNacimiento = fechaNacimiento;
    }
    

    public Personas(Long id, String cedula, String tipo, String nombre, String apellido, double sueldo, Calendar fechaNacimiento) {
        this.id = id;
        this.cedula = cedula;
        this.tipo = tipo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
        this.fechaNacimiento = fechaNacimiento;
    }
 
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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
        if (!(object instanceof Personas)) {
            return false;
        }
        Personas other = (Personas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Personas{" + "id=" + id + ", cedula=" + cedula + ", tipo=" + tipo + ", nombre=" + nombre + ", apellido=" + apellido + ", sueldo=" + sueldo + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

}
