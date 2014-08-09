package com.enero.springagosto.beans;

import com.enero.springagosto.model.Musico;
import com.enero.springagosto.model.Instrumento;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppBean {
    
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        AppBean.AutoWireByType(context);
    }
    
    public static void valoresConstructor(ApplicationContext context) {
        Musico bob = (Musico)context.getBean("bob");
        System.out.println(bob.getNumerocanciones());
    }
    
    private static void referenciaConstructor(ApplicationContext context) {
        Musico musico = (Musico)context.getBean("slash");
        System.out.println(musico.getInstrumento().getMarca());
    }
    
    private static void valoresMetodos(ApplicationContext context) {
        Musico musico = (Musico)context.getBean("lennon");
        System.out.println(musico.getNombres()+" Nro. Canciones: "+musico.getNumerocanciones());
    }
    
    private static void referenciaMetodos(ApplicationContext context) {
        Musico musico = (Musico)context.getBean("lennon");
        System.out.println(musico.getNombres()+" Canciones: "+musico.getNumerocanciones());
        System.out.println(musico.getInstrumento().getMarca());
    } 
    
    private static void referenciaInternos(ApplicationContext context) {
        Musico musico = (Musico) context.getBean("james");
        System.out.println(musico.getNombres());
        System.out.println(musico.getInstrumento().getMarca());
    }
    
    public static void referenciaColecciones(ApplicationContext context) {
        Musico musico = (Musico) context.getBean("jimy");
        List<Instrumento> instrumentos = musico.getInstrumentos();
        for(Instrumento instrumento : instrumentos){
            System.out.println(instrumento.getMarca());
        }
    }
    
    public static void AutoWireByName(ApplicationContext context) {
        Musico musico = (Musico) context.getBean("sanz");
        System.out.println(musico.getInstrumento().getMarca());
    }
    
    public static void AutoWireByType(ApplicationContext context) {
        Musico sanz = (Musico) context.getBean("sanz");
        System.out.println(sanz.getInstrumento().getMarca());
        
        Musico cerati = (Musico) context.getBean("cerati");
        System.out.println(cerati.getInstrumento().getMarca());
        
        Musico charly = (Musico) context.getBean("charly");
        System.out.println(charly.getInstrumento().getMarca());
    }

}
