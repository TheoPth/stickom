package entities;

public class Interestpoint {

    

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    
    private Integer id;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    

    private String name;

    
    private Integer longitude;

    
    private Integer latitude;



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
    public void setName( String name ) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setLongitude( Integer longitude ) {
        this.longitude = longitude;
    }
    public Integer getLongitude() {
        return this.longitude;
    }

    public void setLatitude( Integer latitude ) {
        this.latitude = latitude;
    }
    public Integer getLatitude() {
        return this.latitude;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
 
        public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(id);
        sb.append("|");
        sb.append(name);
        sb.append("|");
        sb.append(longitude);
        sb.append("|");
        sb.append(latitude);
        return sb.toString(); 
    } 


}
