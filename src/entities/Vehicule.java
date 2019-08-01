package entities;


public class Vehicule {

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    
    private Integer id;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    
    private String registration;
    
    private String model;

    private String mark;



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
    public void setRegistration( String registration ) {
        this.registration = registration;
    }
    public String getRegistration() {
        return this.registration;
    }

    public void setModel( String model ) {
        this.model = model;
    }
    public String getModel() {
        return this.model;
    }

    public void setMark( String mark ) {
        this.mark = mark;
    }
    public String getMark() {
        return this.mark;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
 
        public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(id);
        sb.append("|");
        sb.append(registration);
        sb.append("|");
        sb.append(model);
        sb.append("|");
        sb.append(mark);
        return sb.toString(); 
    } 


}
