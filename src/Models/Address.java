package Models;

/**
 * Address.java
 * Purpose      :   Models an address (used by Customer and Person)
 * Author       :   Jared Frenzel, Abbie Jarratt, Emily Wagner
 * Created On   :   February 4, 2016
 **/
public class Address {
  private String street;
  private String city;
  private String state;
  private int zipcode;
  private String country;
  
  public Address(String street, String city, String state, int zipcode, String country){
    this.street = street;
    this.city = city;
    this.state = state;
    this.zipcode = zipcode;
    this.country = country;
  }
}
