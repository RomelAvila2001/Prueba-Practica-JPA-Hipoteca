/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Bienes;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author NANCY
 */
public class ControladorBienes extends ControladorAbstracto<Bienes>{

    @Override
    public List<Bienes> findAll() {
        Query consulta = getEm().createNamedQuery("Bienes.findAll");
        return consulta.getResultList();
    }
    
}
