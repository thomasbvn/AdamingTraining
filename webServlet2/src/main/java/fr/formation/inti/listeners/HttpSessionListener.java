package fr.formation.inti.listeners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Application Lifecycle Listener implementation class HttpSessionListener
 *
 */
@WebListener
public class HttpSessionListener implements javax.servlet.http.HttpSessionListener {
	private final static Log log=LogFactory.getLog(HttpSessionListener.class);
    /**
     * Default constructor. 
     */
    public HttpSessionListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    }
	
}
