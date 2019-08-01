package entities;


public class Renta  {


    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    
    private Integer id;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    
    private Integer datebegining;

    
    private Integer dateend;

    
    private Integer price;

    
    private Integer idtrip;

    
    private Integer idvehicule;



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
    public void setDatebegining( Integer datebegining ) {
        this.datebegining = datebegining;
    }
    public Integer getDatebegining() {
        return this.datebegining;
    }

    public void setDateend( Integer dateend ) {
        this.dateend = dateend;
    }
    public Integer getDateend() {
        return this.dateend;
    }

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

    public void setIdvehicule( Integer idvehicule ) {
        this.idvehicule = idvehicule;
    }
    public Integer getIdvehicule() {
        return this.idvehicule;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
 
        public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(id);
        sb.append("|");
        sb.append(datebegining);
        sb.append("|");
        sb.append(dateend);
        sb.append("|");
        sb.append(price);
        sb.append("|");
        sb.append(idtrip);
        sb.append("|");
        sb.append(idvehicule);
        return sb.toString(); 
    } 


}
