package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class ExpertSystem {
	
	public KieServices ks;
	public KieContainer kContainer;
	public KieSession kSession;
	
	
//    public static final void main(String[] args) {
//            }
	public ExpertSystem () {
		
	}
    
    public void initializeSystem () {
    	try {
            // load up the knowledge base
	        this.ks = KieServices.Factory.get();
    	    this.kContainer = ks.getKieClasspathContainer();
        	this.kSession = kContainer.newKieSession("ksession-rules");

            // go !
            //kSession.insert(message);
            kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }

    }
    
    
}
