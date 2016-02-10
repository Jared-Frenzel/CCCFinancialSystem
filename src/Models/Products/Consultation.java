package Models.Products;

/**
 * Consultation.java
 * Purpose      :   Models a consultation instance
 * Author       :   Jared Frenzel
 * Created On   :   February 4, 2016
 */
public class Consultation extends Product{
    private String consultantPersonCode;
    private double hourlyFee;


    public String getConsultantPersonCode() { return consultantPersonCode; }
    public double getHourlyFee() { return hourlyFee; }


    public Consultation(String object, String notationFormat) {
        if (notationFormat.equals("CSV")) {

        } else if(notationFormat.equals("JSON")) {

        } else if(notationFormat.equals("XML")) {

        } else {
            throw new IllegalArgumentException("Invalid notation format entered.");
        }
    }
}
