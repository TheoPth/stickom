package entities;


public class Address {

 
    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    
    private Integer id;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    
    private Integer numstreet;

    
    private String namestreet;

    
    private Integer postalcode;

    
    private String city;



    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setId( Integer id ) {
        this.id = id ;
    }

    public Integer getId() {
        return this.id;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    public void setNumstreet( Integer numstreet ) {
        this.numstreet = numstreet;
    }
    public Integer getNumstreet() {
        return this.numstreet;
    }

    public void setNamestreet( String namestreet ) {
        this.namestreet = namestreet;
    }
    public String getNamestreet() {
        return this.namestreet;
    }

    public void setPostalcode( Integer postalcode ) {
        this.postalcode = postalcode;
    }
    public Integer getPostalcode() {
        return this.postalcode;
    }

    public void setCity( String city ) {
        this.city = city;
    }
    public String getCity() {
        return this.city;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
 
        public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(id);
        sb.append("|");
        sb.append(numstreet);
        sb.append("|");
        sb.append(namestreet);
        sb.append("|");
        sb.append(postalcode);
        sb.append("|");
        sb.append(city);
        return sb.toString(); 
    } 


}
