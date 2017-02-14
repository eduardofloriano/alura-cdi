package br.com.alura.livraria.factory;

import java.util.Map;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;

import br.com.alura.livraria.factory.ScopeMap.Scope;

public class JSFFactory {
	
	@Produces
	@RequestScoped
	public FacesContext getFacesContext(){
		return FacesContext.getCurrentInstance();
	}
	
	@Produces
	@RequestScoped
	public Flash getFlash(){
		return getExternalContext().getFlash();
	}
	
	@Produces
	@ScopeMap(Scope.SESSION)
	public Map<String, Object> getSessionMap(){
		return getExternalContext().getSessionMap();
	}
	
	@Produces
	@ScopeMap(Scope.REQUEST)
	public Map<String, Object> getRequestMap(){
		return getExternalContext().getRequestMap();
	}

	private ExternalContext getExternalContext() {
		return getFacesContext().getExternalContext();
	}
}
