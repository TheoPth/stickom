package entities;


public class Hotel {

 

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    
    private Integer id;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    
    private Integer price;

    
    private Integer arrivaldate;

    
    private Integer departuredate;

    
    private Integer rate;



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
    public void setPrice( Integer price ) {
        this.price = price;
    }
    public Integer getPrice() {
        return this.price;
    }

    public void setArrivaldate( Integer arrivaldate ) {
        this.arrivaldate = arrivaldate;
    }
    public Integer getArrivaldate() {
        return this.arrivaldate;
    }

    public void setDeparturedate( Integer departuredate ) {
        this.departuredate = departuredate;
    }
    public Integer getDeparturedate() {
        return this.departuredate;
    }

    public void setRate( Integer rate ) {
        this.rate = rate;
    }
    public Integer getRate() {
        return this.rate;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
 
        public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(id);
        sb.append("|");
        sb.append(price);
        sb.append("|");
        sb.append(arrivaldate);
        sb.append("|");
        sb.append(departuredate);
        sb.append("|");
        sb.append(rate);
        return sb.toString(); 
    } 


}
