package entities;

public class Propose {

    

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    
    private Integer idflight;

    
    private Integer idcompagnie;



    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    public void setIdflight( Integer idflight ) {
        this.idflight = idflight;
    }
    public Integer getIdflight() {
        return this.idflight;
    }

    public void setIdcompagnie( Integer idcompagnie ) {
        this.idcompagnie = idcompagnie;
    }
    public Integer getIdcompagnie() {
        return this.idcompagnie;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
 
        public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(idflight);
        sb.append("|");
        sb.append(idcompagnie);
        return sb.toString(); 
    } 


}
