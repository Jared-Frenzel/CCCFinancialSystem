package Models;

/**
 * Person.java
 * Purpose      :   Models a person (referenced by customer)
 * Author       :   Jared Frenzel, Abbie Jarratt, Emily Wagner
 * Created On   :   February 4, 2016
 */
public class Person {
  private String personCode;
  private String fistName;
  private String lastName;
  private Address address;
  private Arraylist<String> email;
 
  public Person(String personCode, String firstName, String lastName, Address address, Arraylist<String> email){
    this.personCode = personCode;
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.email = email;
  }
}
