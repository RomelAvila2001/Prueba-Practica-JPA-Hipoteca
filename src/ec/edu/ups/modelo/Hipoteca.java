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
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author NANCY
 */
@Entity
@NamedQuery(name = "hipoteca.findAll", query = "SELECT h FROM Hipoteca h")
public class Hipoteca implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    @JoinColumn(name="Propietariofk")
    private Personas propietario;
    @OneToOne
    @JoinColumn(name="Avalfk")
    private Personas aval;
    @OneToOne
    @JoinColumn(name="Bienfk")
    private Bienes bien;  
    @Column
    @Temporal(TemporalType.DATE)
    private Calendar fechaInicio;
    @Column
    @Temporal(TemporalType.DATE)
    private Calendar fechaFinal;
    @Column
    private double monto;
    @Column
    private double pagoMensual;
    @Column
    private double Total;
    @Column
    private int meses;

    public Hipoteca() {
    }

    public Hipoteca(Long id, Personas propietario, Personas aval, Bienes bien, Calendar fechaInicio, Calendar fechaFinal, double monto, double pagoMensual, double Total, int meses) {
        this.id = id;
        this.propietario = propietario;
        this.aval = aval;
        this.bien = bien;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.monto = monto;
        this.pagoMensual = pagoMensual;
        this.Total = Total;
        this.meses = meses;
    }

    public Hipoteca(Personas propietario, Personas aval, Bienes bien, Calendar fechaInicio, Calendar fechaFinal, double monto, double pagoMensual, double Total, int meses) {
        this.propietario = propietario;
        this.aval = aval;
        this.bien = bien;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.monto = monto;
        this.pagoMensual = pagoMensual;
        this.Total = Total;
        this.meses = meses;
    }

    public Hipoteca(Personas propietario, Bienes bien, Calendar fechaInicio, Calendar fechaFinal, double monto, double pagoMensual, double Total, int meses) {
        this.propietario = propietario;
        this.bien = bien;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.monto = monto;
        this.pagoMensual = pagoMensual;
        this.Total = Total;
        this.meses = meses;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Calendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Calendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Calendar getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Calendar fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getPagoMensual() {
        return pagoMensual;
    }

    public void setPagoMensual(double pagoMensual) {
        this.pagoMensual = pagoMensual;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public Personas getPropietario() {
        return propietario;
    }

    public void setPropietario(Personas propietario) {
        this.propietario = propietario;
    }

    public Personas getAval() {
        return aval;
    }

    public void setAval(Personas aval) {
        this.aval = aval;
    }

    public Bienes getBien() {
        return bien;
    }

    public void setBien(Bienes bien) {
        this.bien = bien;
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
        if (!(object instanceof Hipoteca)) {
            return false;
        }
        Hipoteca other = (Hipoteca) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.modelo.Hipoteca[ id=" + id + " ]";
    }
    
}
