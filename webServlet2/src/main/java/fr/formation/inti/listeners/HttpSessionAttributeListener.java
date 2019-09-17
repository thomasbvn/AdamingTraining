package fr.formation.inti.listeners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Application Lifecycle Listener implementation class HttpSessionAttributeListener
 *
 */
@WebListener
public class HttpSessionAttributeListener implements javax.servlet.http.HttpSessionAttributeListener {
	private final static Log log=LogFactory.getLog(HttpSessionAttributeListener.class);
    /**
     * Default constructor. 
     */
    public HttpSessionAttributeListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent event)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent event)  { 
         // TODO Auto-generated method stub
    	log.info("attribute : "+event.getName()+" was removed");
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent event)  { 
         // TODO Auto-generated method stub
    }
	
}
