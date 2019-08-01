package entities;



public class Doa{

  
    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    
    private Integer idactivities;

    
    private Integer idtrip;



    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    public void setIdactivities( Integer idactivities ) {
        this.idactivities = idactivities;
    }
    public Integer getIdactivities() {
        return this.idactivities;
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
        sb.append(idactivities);
        sb.append("|");
        sb.append(idtrip);
        return sb.toString(); 
    } 


}
