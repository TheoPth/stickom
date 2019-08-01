package entities;

public class Room {

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    
    private Integer id;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    
    private Integer number;

    
    private Integer floor;

    
    private Integer capacity;

    
    private Integer idhotel;



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
    public void setNumber( Integer number ) {
        this.number = number;
    }
    public Integer getNumber() {
        return this.number;
    }

    public void setFloor( Integer floor ) {
        this.floor = floor;
    }
    public Integer getFloor() {
        return this.floor;
    }

    public void setCapacity( Integer capacity ) {
        this.capacity = capacity;
    }
    public Integer getCapacity() {
        return this.capacity;
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
        sb.append(id);
        sb.append("|");
        sb.append(number);
        sb.append("|");
        sb.append(floor);
        sb.append("|");
        sb.append(capacity);
        sb.append("|");
        sb.append(idhotel);
        return sb.toString(); 
    } 


}
