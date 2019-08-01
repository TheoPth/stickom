package entities;

public class Activitie  {
 

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
     
    private Integer id;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
     
    private String name;

     
    private Integer takesplace;

     
    private Integer idguide;

     
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
    public void setName( String name ) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setTakesplace( Integer takesplace ) {
        this.takesplace = takesplace;
    }
    public Integer getTakesplace() {
        return this.takesplace;
    }

    public void setIdguide( Integer idguide ) {
        this.idguide = idguide;
    }
    public Integer getIdguide() {
        return this.idguide;
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
        sb.append(name);
        sb.append("|");
        sb.append(takesplace);
        sb.append("|");
        sb.append(idguide);
        sb.append("|");
        sb.append(idhotel);
        return sb.toString(); 
    } 


}
