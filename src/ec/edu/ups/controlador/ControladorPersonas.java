/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Personas;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author NANCY
 */
public class ControladorPersonas extends ControladorAbstracto<Personas> {

    @Override
    public List<Personas> findAll() {
        Query consulta = getEm().createNamedQuery("Personas.findAll");
        return consulta.getResultList();
    }
    
    public Personas buscarCedula(String cedula){
        Query consulta = getEm().createNamedQuery("ConsultaCedula");
        consulta.setParameter("cedula", cedula);
        return (Personas) consulta.getSingleResult();
    }
}
