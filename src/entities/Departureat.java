package entities;


public class Departureat {


    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    
    private Integer idflight;

    
    private Integer idairport;



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

    public void setIdairport( Integer idairport ) {
        this.idairport = idairport;
    }
    public Integer getIdairport() {
        return this.idairport;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
 
        public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(idflight);
        sb.append("|");
        sb.append(idairport);
        return sb.toString(); 
    } 


}
