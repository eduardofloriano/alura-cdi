package br.com.alura.livraria.util;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;

public class PhaseListener implements javax.faces.event.PhaseListener{

	@Override
	public void afterPhase(PhaseEvent event) {
		System.out.println("FASE: " + event.getPhaseId());
		
	}

	@Override
	public void beforePhase(PhaseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

	
	
	
	
	
}
