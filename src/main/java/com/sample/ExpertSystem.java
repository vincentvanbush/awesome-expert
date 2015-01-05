package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class ExpertSystem {
	
	public static KieServices ks;
	public static KieContainer kContainer;
	public static KieSession kSession;
	
	public ExpertSystem () {
		
	}
    
    public static void initializeSystem () {
    	try {
            // load up the knowledge base
	        ks = KieServices.Factory.get();
    	    kContainer = ks.getKieClasspathContainer();
        	kSession = kContainer.newKieSession("ksession-rules");
        	
            // go !
            //kSession.insert(message);
            kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }

    }
    /*
    public static void main(String[] args) {
    	ExpertSystem ex = new ExpertSystem();
    	ex.initializeSystem();
    }
    */
    
}
