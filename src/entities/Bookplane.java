package entities;


public class Bookplane{

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    
    private Integer id;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    
    private Integer price;

    
    private Integer idtrip;

    
    private Integer idflight;



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

    public void setIdtrip( Integer idtrip ) {
        this.idtrip = idtrip;
    }
    public Integer getIdtrip() {
        return this.idtrip;
    }

    public void setIdflight( Integer idflight ) {
        this.idflight = idflight;
    }
    public Integer getIdflight() {
        return this.idflight;
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
        sb.append(idtrip);
        sb.append("|");
        sb.append(idflight);
        return sb.toString(); 
    } 


}
