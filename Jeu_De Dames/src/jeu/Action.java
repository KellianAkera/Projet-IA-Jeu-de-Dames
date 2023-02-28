package jeu;

import java.util.List;

public class Action {
    private Case caseDebut;
    private Case caseFin;
    private List<Case> mangepion;

    public Action(Case caseDebut ,Case caseFin){
        this.caseDebut=caseDebut;
        this.caseFin=caseFin;
        mangepion=null;
    }

    public Action(Case caseDebut ,Case caseFin, List<Case> mangepion){
        this.caseDebut=caseDebut;
        this.caseFin=caseFin;
        this.mangepion= mangepion;
    }

    public boolean mangepion(){
        if (mangepion != null) {
            return true;
        }
        return false;
    }

    /**
     * Fonction qui retourne la position final du pion apres son action
     * @return case de positon final
     */
    public Case getCaseFin(){
        return caseFin;
    }
    

    public Action reverse(){
        return new Action(caseFin, caseDebut,mangepion);
    }
}
