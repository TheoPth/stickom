package entities;


public class Traveler {

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    
    private Integer id;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    
    
    private String firstname;

    
    
    private String lastname;

    
    private String birthdate;
    
    private String phone;

    
    private String street;

    
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
    public void setFirstname( String firstname ) {
        this.firstname = firstname;
    }
    public String getFirstname() {
        return this.firstname;
    }

    public void setLastname( String lastname ) {
        this.lastname = lastname;
    }
    public String getLastname() {
        return this.lastname;
    }

    public void setBirthdate( String birthdate ) {
        this.birthdate = birthdate;
    }
    public String getBirthdate() {
        return this.birthdate;
    }

    public void setPhone( String phone ) {
        this.phone = phone;
    }
    public String getPhone() {
        return this.phone;
    }

    public void setStreet( String street ) {
        this.street = street;
    }
    public String getStreet() {
        return this.street;
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
        sb.append(firstname);
        sb.append("|");
        sb.append(lastname);
        sb.append("|");
        sb.append(birthdate);
        sb.append("|");
        sb.append(phone);
        sb.append("|");
        sb.append(street);
        sb.append("|");
        sb.append(city);
        return sb.toString(); 
    } 


}
