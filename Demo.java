

Package PPA1;  //userdefined package

public class Demo  //userdefined class 
{
    private int id;
    private String username;
    private String password;

  public  int setid(int id)  //setter
  {
      this.id=id;  //current class object get created 
  }
  public int getid()   //getter
  {
     return id; 
  }
  public String setname(int name)
  {
      this.name=name;
  }
  public String getname()
  {
      return name;
  }
  public String setpass(int pass)
  {
     this.pass=pass;   
  }
  public String getpass()
  {
     return pass;
  }
}