package fr.formation.inti;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class AppLog {

	private static final Log log  = LogFactory.getLog(AppLog.class);
	public static void main(String[] args) {
		log.debug("message debug !");
		log.info("message info !");
		log.warn("message warn !");
		log.error("message error !");
		log.fatal("message fatal !");
	}

}
