package entities;

public class Rentwith  {
    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    
    private Integer idvehicule;

    private Integer idrenter;



    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    public void setIdvehicule( Integer idvehicule ) {
        this.idvehicule = idvehicule;
    }
    public Integer getIdvehicule() {
        return this.idvehicule;
    }

    public void setIdrenter( Integer idrenter ) {
        this.idrenter = idrenter;
    }
    public Integer getIdrenter() {
        return this.idrenter;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
 
        public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(idvehicule);
        sb.append("|");
        sb.append(idrenter);
        return sb.toString(); 
    } 


}
