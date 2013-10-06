package org.impressivecode.depress.its.bugzilla;

import java.util.HashMap;

/**
 * 
 * @author Micha� Negacz
 * 
 */
public interface BugzillaOnlineClient {
	
	Object execute(String method, HashMap<String, Object> parameters) throws BugzillaOnlineClientException;
	
}
