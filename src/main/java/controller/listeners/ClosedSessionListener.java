package main.java.controller.listeners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class ClosedSessionLostener
 *
 */
@WebListener
public class ClosedSessionListener implements HttpSessionListener {

    /**
     * Default constructor.
     */
    public ClosedSessionListener() {
	// TODO Auto-generated constructor stub
    }

    /**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    @Override
    public void sessionCreated(HttpSessionEvent se) {
	// TODO Auto-generated method stub
    }

    /**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {

    }

}
