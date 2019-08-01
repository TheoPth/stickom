package entities;

public class Provide {
	//----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    
    private Integer idvehicule;

    
    private Integer idhotel;



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

    public void setIdhotel( Integer idhotel ) {
        this.idhotel = idhotel;
    }
    public Integer getIdhotel() {
        return this.idhotel;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
 
        public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(idvehicule);
        sb.append("|");
        sb.append(idhotel);
        return sb.toString(); 
    } 


}
