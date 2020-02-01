package pucrs.smart.ontology;

import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;
import org.semanticweb.owlapi.reasoner.structural.StructuralReasonerFactory;

import pucrs.smart.ontology.oo.OntoQueryLayerString;

/**
 * main
 */
public class main {
	public static void main(String[] args) {
		try {
			OwlOntoLayer onto = new OwlOntoLayer("/home/user/eclipse-workspace/MasOntology-master/src/resources/New-Bed-allocation.owl");
				
			OWLReasonerFactory reasonerFactory = new StructuralReasonerFactory();			
			onto.setReasoner(reasonerFactory.createReasoner(onto.getOntology()));
					
			OntoQueryLayerString queryEngine = new OntoQueryLayerString(onto);
			System.out.println("Ontology ready");
		} catch (Exception e) {
			System.out.println("an exception has occurred: "+e.getMessage());
		}		
	} 	
}
