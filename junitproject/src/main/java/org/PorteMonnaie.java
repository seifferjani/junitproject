package org;

import java.util.HashMap;

public class PorteMonnaie {
	private HashMap<String, Integer> contenu;

	public HashMap<String, Integer> getContenu() {
		return contenu;
	}

	public PorteMonnaie() {
		contenu = new HashMap<String, Integer>();
	}

	public void ajouteSomme(SommeArgent sa) {
		contenu.put(sa.getUnite(), (contenu.containsKey(sa.getUnite())) ? contenu.get(sa.getUnite()) + sa.getQuantite()
				: sa.getQuantite());
	}
	@Override
	public String toString() {
		return contenu.toString();
	}
	@Override
	public boolean equals(Object obj) {

		if (obj instanceof PorteMonnaie) {
			PorteMonnaie porteMonnaie = (PorteMonnaie) obj;
			for(String key : porteMonnaie.getContenu().keySet()) {
				if (this.getContenu().size() != porteMonnaie.getContenu().size() || !this.getContenu().containsKey(key)
						|| this.getContenu().get(key) != porteMonnaie.getContenu().get(key)) {
					return false;
				}
			}
			return true; 
		} else {
			return false;
		}
	 
	}
}
