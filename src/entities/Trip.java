package entities;

public class Trip {

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    
    private Integer id;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    
    private String name;

    
    private String departuredate;

    
    private String arrivaldate;



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

    public void setDeparturedate( String departuredate ) {
        this.departuredate = departuredate;
    }
    public String getDeparturedate() {
        return this.departuredate;
    }

    public void setArrivaldate( String arrivaldate ) {
        this.arrivaldate = arrivaldate;
    }
    public String getArrivaldate() {
        return this.arrivaldate;
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
        sb.append(departuredate);
        sb.append("|");
        sb.append(arrivaldate);
        return sb.toString(); 
    } 


}
