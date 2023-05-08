package org;

public class SommeArgent {

    private int quantite ;
    private String unite;

    public SommeArgent(int quantite, String unite) {
        this.quantite = quantite;
        this.unite = unite;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public String getUnite() {
        return unite;
    }

    public void setUnite(String unite) {
        this.unite = unite;
    }

    public SommeArgent add(SommeArgent m) {
        return new SommeArgent(getQuantite()+m.getQuantite(), getUnite());
    }

    public boolean equals (SommeArgent anOBject){
        return (this.getQuantite()==anOBject.getQuantite()&&this.getUnite().equals(anOBject.getUnite()));
    }

}
