package br.com.alura.livraria.util;

import java.util.Map;

import javax.enterprise.event.Observes;
import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.inject.Inject;

import br.com.alura.livraria.factory.ScopeMap;
import br.com.alura.livraria.factory.ScopeMap.Scope;
import br.com.alura.livraria.model.Usuario;
import br.com.alura.livraria.util.Phase.Phases;

public class Autorizador {
//	@Inject
//	private FacesContext context;
//
//	@Inject
//	@ScopeMap(Scope.SESSION)
//	private Map<String, Object> sessionMap;
//
//	@Inject
//	private NavigationHandler handler;
//
//	public void autoriza(@Observes @After @Phase(Phases.RESTORE_VIEW) PhaseEvent event) {
//		String nomePagina = context.getViewRoot().getViewId();
//
//		System.out.println(nomePagina);
//
//		if ("/login.xhtml".equals(nomePagina)) {
//			return;
//		}
//
//		Usuario usuarioLogado = (Usuario) sessionMap.get("usuarioLogado");
//
//		if (usuarioLogado != null) {
//			return;
//		}
//
//		// redirecionamento para login.xhtml
//
//		handler.handleNavigation(context, null, "/login?faces-redirect=true");
//		context.renderResponse();
//	}
}
