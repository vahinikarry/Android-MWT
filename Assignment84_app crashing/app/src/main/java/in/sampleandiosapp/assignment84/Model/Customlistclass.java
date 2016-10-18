package in.sampleandiosapp.assignment84.Model;

/**
 * Created by lenovo on 10/18/2016.
 */
public class Customlistclass
{
    public Customlistclass(String personName, String phoneNumber, String dateofbirth)
    {
        dateofbirth=dateofbirth;
        personName=personName;
        phoneNumber=phoneNumber;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    String personName;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    String phoneNumber;



    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    String dateofbirth;
}
