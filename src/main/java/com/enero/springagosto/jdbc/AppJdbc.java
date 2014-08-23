package com.enero.springagosto.jdbc;

import com.enero.springagosto.jdbc.dao.ProgramaDAO;
import com.enero.springagosto.jdbc.model.Programa;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppJdbc {
    
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc_db.xml");
        //AppJdbc.doDelete(context);
        AppJdbc.doList(context);
    }
    
    public static void doList(ApplicationContext context) {
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
    
    public static void dofindCode(ApplicationContext context) {
        ProgramaDAO programaDAO = (ProgramaDAO) context.getBean("programaDAO");
        Programa programa = programaDAO.find("1473");
        System.out.println(programa.getNombre()+" - "+programa.getDescripcion()+" - "+programa.getCodigo());
    }
    
    public static void doSave(ApplicationContext context) {
        ProgramaDAO programaDAO = (ProgramaDAO) context.getBean("programaDAO");
        Programa programa = new Programa();
        programa.setNombre("Linux");
        programa.setDescripcion("Curso de Linux");
        programa.setCodigo("147");
        programaDAO.save(programa);
    }
    
    public static void doUpdate(ApplicationContext context) {
        ProgramaDAO programaDAO = (ProgramaDAO) context.getBean("programaDAO");
        Programa programa = new Programa();
        programa.setId(5);
        programa.setNombre("Linux1");
        programa.setDescripcion("Curso de Linux2");
        programa.setCodigo("1473");
        programaDAO.update(programa);
    }
    
    public static void doDelete(ApplicationContext context) {
        ProgramaDAO programaDAO = (ProgramaDAO) context.getBean("programaDAO");
        Programa programa = new Programa();
        programa.setId(6);
        programaDAO.delete(programa);
    }
    
}
