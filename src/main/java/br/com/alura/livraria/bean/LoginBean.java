package br.com.alura.livraria.bean;

import java.io.Serializable;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.inject.Inject;

import br.com.alura.livraria.annotation.ModelView;
import br.com.alura.livraria.dao.UsuarioDAO;
import br.com.alura.livraria.factory.ScopeMap;
import br.com.alura.livraria.factory.ScopeMap.Scope;
import br.com.alura.livraria.model.Usuario;

@ModelView
public class LoginBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private UsuarioDAO usuarioDAO;

	@Inject
	private FacesContext context;

	@Inject
	@ScopeMap(Scope.SESSION)
	private transient Map<String, Object> sessionMap;
	
	@Inject
	private Flash flash;

	private Usuario usuario = new Usuario();

	public Usuario getUsuario() {
		return usuario;
	}

	public String autenticar() {

		Usuario usuario = usuarioDAO.obterUsuarioPorEmail(this.usuario);

		if (usuario == null) {
			context.addMessage(null, new FacesMessage("Usuario nao encontrado."));
			flash.setKeepMessages(true);
			return "login?faces-redirect=true";
		} else {
			sessionMap.put("usuarioLogado", usuario);
			return "livro.xhtml?faces-redirect=true";
		}
	}

	public String logout() {

		sessionMap.remove("usuarioLogado");

		return "login.xhtml?faces-redirect=true";

	}

}
