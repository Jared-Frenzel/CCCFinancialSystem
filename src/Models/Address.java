package Models;

/**
 * Address.java
 * Purpose      :   Models an address (used by Customer and Person)
 * Author       :   Jared Frenzel
 * Created On   :   February 4, 2016
 **/
public class Address {
  private String street;
  private String city;
  private String state;
  private int zipcode;
  
  public Address(String street, String city, String state, int zipcode){
    this.street = street;
    this.city = city;
    this.state = state;
    this.zipcode = zipcode;
  }
}
