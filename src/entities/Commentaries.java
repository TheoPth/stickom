
package entities;



public class Commentaries  {

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    
    private Integer id;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    

    private String body;

    
    private Integer rate;

    
    private Integer idhotel;

    
    private Integer idroom;



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
    public void setBody( String body ) {
        this.body = body;
    }
    public String getBody() {
        return this.body;
    }

    public void setRate( Integer rate ) {
        this.rate = rate;
    }
    public Integer getRate() {
        return this.rate;
    }

    public void setIdhotel( Integer idhotel ) {
        this.idhotel = idhotel;
    }
    public Integer getIdhotel() {
        return this.idhotel;
    }

    public void setIdroom( Integer idroom ) {
        this.idroom = idroom;
    }
    public Integer getIdroom() {
        return this.idroom;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
 
        public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(id);
        sb.append("|");
        sb.append(body);
        sb.append("|");
        sb.append(rate);
        sb.append("|");
        sb.append(idhotel);
        sb.append("|");
        sb.append(idroom);
        return sb.toString(); 
    } 


}
