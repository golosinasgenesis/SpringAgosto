package com.enero.springagosto.beans;

import com.enero.springagosto.model.Musico;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppBean {
    
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        AppBean.valoresMetodos(context);
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

}
