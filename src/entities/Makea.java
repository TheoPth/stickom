package entities;

public class Makea {

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    
    private Integer idtraveler;

    
    private Integer idtrip;



    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    public void setIdtraveler( Integer idtraveler ) {
        this.idtraveler = idtraveler;
    }
    public Integer getIdtraveler() {
        return this.idtraveler;
    }

    public void setIdtrip( Integer idtrip ) {
        this.idtrip = idtrip;
    }
    public Integer getIdtrip() {
        return this.idtrip;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
 
        public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(idtraveler);
        sb.append("|");
        sb.append(idtrip);
        return sb.toString(); 
    } 


}
