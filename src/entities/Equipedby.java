package entities;

public class Equipedby  {

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    
    private Integer idroom;

    
    private Integer idequipement;



    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    public void setIdroom( Integer idroom ) {
        this.idroom = idroom;
    }
    public Integer getIdroom() {
        return this.idroom;
    }

    public void setIdequipement( Integer idequipement ) {
        this.idequipement = idequipement;
    }
    public Integer getIdequipement() {
        return this.idequipement;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
 
        public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(idroom);
        sb.append("|");
        sb.append(idequipement);
        return sb.toString(); 
    } 


}
