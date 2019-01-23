/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import model.Asistenciamedica;
import model.Seguro;
import model.componentes.Coberturas;
import model.componentes.Enfermedades;
import model.componentes.NIF;
import model.enums.Sexo;
import model.enums.TipoAsistencia;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Maite
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CREAMOS CONEXION
        //SessionFactory sessionFactory;
        //Configuration configuration = new Configuration();
        //configuration.configure();
        //sessionFactory = configuration.buildSessionFactory();
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        // CREAMOS UN OBJETO
        //Profesor profesor=new Profesor(7,"Pepe","Garci1a","Perez");
        NIF nif = new NIF("X34543643");
        Coberturas cober = new Coberturas(false, false, false);
        Enfermedades enfer = new Enfermedades(false, false, false, false, "Ninguna alergia");

        Seguro seg = new Seguro(437, "TIHOMIR", "STOYCHEV", "STOYCHEV", 22, false, 0, false, Calendar.getInstance().getTime());
        seg.setNif(nif);
        seg.setCober(cober);
        seg.setEnfer(enfer);
        seg.setSexo(Sexo.Hombre);

        
        Set<Asistenciamedica> asistencias = new HashSet<>();
        Asistenciamedica asis = new Asistenciamedica(seg, "Suelta el torpedo loco", "Mi casa", "La palmas loco", Calendar.getInstance().getTime(), Calendar.getInstance().getTime(), new BigDecimal(1000), 2);
        asis.setAsis(TipoAsistencia.Domiciliaria);
        asistencias.add(asis);

        seg.setAsistenciamedicas(asistencias);
        //CREAR UNA SESION
        Session session = factory.openSession();
        session.beginTransaction();

        //GUARDAR OBJETO
        session.saveOrUpdate(asis);
        session.saveOrUpdate(seg);
        //CERRAR CONEXION
        session.getTransaction().commit();
        session.close();
        factory.close();

    }

}
