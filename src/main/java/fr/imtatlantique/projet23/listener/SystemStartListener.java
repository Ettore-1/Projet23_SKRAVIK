package fr.imtatlantique.projet23.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class SystemStartListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext applicaiton = servletContextEvent.getServletContext();
        String contextPath = applicaiton.getContextPath();
        applicaiton.setAttribute("APP_PATH", contextPath);
        System.out.println("APP_PATH: " + contextPath);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
