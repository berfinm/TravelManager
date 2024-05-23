


interface ILoginable {
    boolean isPasswordTrue(String password);

    boolean isNameTrue(String name);
}

public abstract class User implements ILoginable {
    String name;
    String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
       
    }

  //  public String getName() {
    //    return this.name;
   // }

   // public String getPassword() {
    //    return this.password;
   // }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isPasswordTrue(String password) {
        return this.password != null && this.password.equals(password);
    }

    public boolean isNameTrue(String name) {
        return this.name != null && this.name.equals(name);
    }
}
