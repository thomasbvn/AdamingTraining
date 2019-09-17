package fr.formation.inti.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Application Lifecycle Listener implementation class ContextListener
 *
 */
@WebListener
public class ContextListener implements ServletContextListener {
private final static Log log=LogFactory.getLog(ContextListener.class);
int countD=0;
int countI=0;
    /**
     * Default constructor. 
     */
    public ContextListener() {
        // tdiodkydtkeyh
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	countD++;
    	log.info("---- Server stopped");
    	log.info(countD);
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	countI++;
    	log.info("---- Server started");
    	log.info(countI);
    }
	
}
