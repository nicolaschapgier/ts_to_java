import java.util.ArrayList;
import java.util.Date;

public class User {
  private Date birthdate;
  private int size;
  private Photo[] photo;
  private Address address;

  public User (Date birthdate, int size, Photo[] photo, Address address){
    this.birthdate = birthdate;
    this.size = size;
    this.photo = photo;
    this.address = address;
  }
}
