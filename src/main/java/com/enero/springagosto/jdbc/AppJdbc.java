package com.enero.springagosto.jdbc;

import com.enero.springagosto.jdbc.dao.CursoDAO;
import com.enero.springagosto.jdbc.dao.ProgramaDAO;
import com.enero.springagosto.jdbc.model.Curso;
import com.enero.springagosto.jdbc.model.Programa;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppJdbc {
    
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc_db.xml");
        //AppJdbc.doDelete(context);
        AppJdbc.doDeleteCurso(context);
        AppJdbc.doListCurso(context);
    }
    
    //CURSO
    public static void doListCurso(ApplicationContext context) {
        CursoDAO cursoDAO = (CursoDAO) context.getBean("cursoDAO");
        List<Curso> cursos = cursoDAO.all();
        for(Curso curso: cursos){
            System.out.println(curso.getNombre()+" - "+curso.getCodigo()+" - "+curso.getFechainicio()+" - "+curso.getIdprograma());
        }
    }
    
    public static void dofindIdCurso(ApplicationContext context) {
        CursoDAO cursoDAO = (CursoDAO) context.getBean("cursoDAO");
        Curso curso = cursoDAO.find(3);
        System.out.println(curso.getNombre()+" - "+curso.getCodigo()+" - "+curso.getFechainicio()+" - "+curso.getIdprograma());
    }
    
    public static void dofindCodeCurso(ApplicationContext context) {
        CursoDAO cursoDAO = (CursoDAO) context.getBean("cursoDAO");
        Curso curso = cursoDAO.find("369");
        System.out.println(curso.getNombre()+" - "+curso.getCodigo()+" - "+curso.getFechainicio()+" - "+curso.getIdprograma());
    }
    
    public static void doSaveCurso(ApplicationContext context) {
        CursoDAO cursoDAO = (CursoDAO) context.getBean("cursoDAO");
        Curso curso = new Curso();
        curso.setNombre("Mysql");
        curso.setCodigo("425");
        curso.setFechainicio("2014-09-05");
        curso.setIdprograma(2);
        cursoDAO.save(curso);
    }
    
    public static void doUpdateCurso(ApplicationContext context) {
        CursoDAO cursoDAO = (CursoDAO) context.getBean("cursoDAO");
        Curso curso = new Curso();
        curso.setId(5);
        curso.setNombre("Mysql1");
        curso.setCodigo("4252");
        curso.setFechainicio("2014-09-03");
        curso.setIdprograma(3);
        cursoDAO.update(curso);
    }
    
    public static void doDeleteCurso(ApplicationContext context) {
        CursoDAO cursoDAO = (CursoDAO) context.getBean("cursoDAO");
        Curso curso = new Curso();
        curso.setId(5);
        cursoDAO.delete(curso);
    }
    
    
    //PROGRAMA
    public static void doList(ApplicationContext context) {
        ProgramaDAO programaDAO = (ProgramaDAO) context.getBean("programaDAO");
        List<Programa> programas = programaDAO.all();
        for(Programa programa: programas){
            System.out.println(programa.getNombre()+" - "+programa.getDescripcion()+" - "+programa.getCodigo());
        }
    }
    
    public static void dofindId(ApplicationContext context) {
        ProgramaDAO programaDAO = (ProgramaDAO) context.getBean("programaDAO");
        Programa programa = programaDAO.find(2);
        System.out.println(programa.getNombre()+" - "+programa.getDescripcion()+" - "+programa.getCodigo());
    }
    
    public static void dofindCode(ApplicationContext context) {
        ProgramaDAO programaDAO = (ProgramaDAO) context.getBean("programaDAO");
        Programa programa = programaDAO.find(456);
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
        programa.setId(4);
        programa.setNombre("Linux1");
        programa.setDescripcion("Curso de Linux2");
        programa.setCodigo("1473");
        programaDAO.update(programa);
    }
    
    public static void doDelete(ApplicationContext context) {
        ProgramaDAO programaDAO = (ProgramaDAO) context.getBean("programaDAO");
        Programa programa = new Programa();
        programa.setId(4);
        programaDAO.delete(programa);
    }
    
}
