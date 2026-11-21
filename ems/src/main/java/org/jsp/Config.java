package org.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Con
@Configuration
@ComponentScan("org.jsp")
public class Config {

    @Bean
    EntityManager getEntityManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ems");
        return emf.createEntityManager();
    }
}
