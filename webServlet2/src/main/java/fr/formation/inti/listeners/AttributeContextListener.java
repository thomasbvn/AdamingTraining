package fr.formation.inti.listeners;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Application Lifecycle Listener implementation class AttributeContextListener
 *
 */
@WebListener
public class AttributeContextListener implements ServletContextAttributeListener {
	private final static Log log=LogFactory.getLog(AttributeContextListener.class);
    /**
     * Default constructor. 
     */
    public AttributeContextListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
     */
    public void attributeAdded(ServletContextAttributeEvent event)  { 
         // TODO Auto-generated method stub
    	log.info("attribute : "+event.getName()+" was added with value "+event.getValue());
    }

	/**
     * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
     */
    public void attributeRemoved(ServletContextAttributeEvent event)  { 
         // TODO Auto-generated method stub
    	log.info("attribute : "+event.getName()+" was removed");
    }

	/**
     * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
     */
    public void attributeReplaced(ServletContextAttributeEvent event)  { 
         // TODO Auto-generated method stub
    	log.info("attribute : "+event.getName()+" was replaced with value "+event.getValue());
    }
	
}
