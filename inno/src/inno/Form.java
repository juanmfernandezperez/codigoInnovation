package inno;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class Form extends ActionForm { 
	
	private Map<Integer, Mitablaform> mapa;

	public Map<Integer, Mitablaform> getMapa() {
		return mapa;
	}

	public void setMapa(Map<Integer, Mitablaform> mapa) {
		this.mapa = mapa;
	}


	
	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		
	}

}
