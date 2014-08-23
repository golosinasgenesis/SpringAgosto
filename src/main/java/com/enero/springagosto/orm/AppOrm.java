package com.enero.springagosto.orm;

import com.enero.springagosto.orm.dao.ProgramaDAO;
import com.enero.springagosto.orm.model.Programa;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppOrm {
    
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("hibernate-db.xml");
        AppOrm.doUpdate(context);
        AppOrm.doAll(context);
    }
    
    public static void doAll(ApplicationContext context) {
        ProgramaDAO programaDAO = (ProgramaDAO) context.getBean("programaDAO");
        List<Programa> programas = programaDAO.all();
        for(Programa programa: programas){
            System.out.println(programa.getNombre()+" - "+programa.getDescripcion()+" - "+programa.getCodigo());
        }
    }
    
    public static void dofindId(ApplicationContext context) {
        ProgramaDAO programaDAO = (ProgramaDAO) context.getBean("programaDAO");
        Programa programa = programaDAO.find(3);
        System.out.println(programa.getNombre()+" - "+programa.getDescripcion()+" - "+programa.getCodigo());
    }
    
    public static void doSave(ApplicationContext context) {
        ProgramaDAO programaDAO = (ProgramaDAO) context.getBean("programaDAO");
        Programa programa = new Programa();
        programa.setNombre("PHP");
        programa.setDescripcion("Curso de PHP");
        programa.setCodigo("8080");
        programaDAO.save(programa);
    }
    
    public static void doUpdate(ApplicationContext context) {
        ProgramaDAO programaDAO = (ProgramaDAO) context.getBean("programaDAO");
        Programa programa = new Programa();
        programa.setId(7);
        programa.setNombre("PHP POO");
        programa.setDescripcion("Curso de PHP POO");
        programa.setCodigo("77");
        programaDAO.update(programa);
    }
    
    public static void doDelete(ApplicationContext context) {
        ProgramaDAO programaDAO = (ProgramaDAO) context.getBean("programaDAO");
        Programa programa = new Programa();
        programa.setId(7);
        programaDAO.delete(programa);
    }
}
