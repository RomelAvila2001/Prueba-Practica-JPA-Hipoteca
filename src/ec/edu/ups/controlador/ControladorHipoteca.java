/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Hipoteca;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author NANCY
 */
public class ControladorHipoteca extends ControladorAbstracto<Hipoteca>{

    @Override
    public List<Hipoteca> findAll() {
        Query consulta = getEm().createNamedQuery("hipoteca.findAll");
        return consulta.getResultList();
    }
    
}
