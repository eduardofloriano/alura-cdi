package br.com.alura.livraria.util;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;

public class PhaseListenerGenerico implements javax.faces.event.PhaseListener {

	private static final long serialVersionUID = 1L;

	private PhaseListernerObserver observer = new PhaseListernerObserver();

	@Override
	public void afterPhase(PhaseEvent event) {
		observer.after().fire(event);
	}

	@Override
	public void beforePhase(PhaseEvent event) {
		observer.before().fire(event);

	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

}
