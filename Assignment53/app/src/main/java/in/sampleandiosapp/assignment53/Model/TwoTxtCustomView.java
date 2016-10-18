package in.sampleandiosapp.assignment53.Model;

/**
 * Created by lenovo on 10/16/2016.
 */
public class TwoTxtCustomView {
    private  String PersonName="";
    private  String PhoneNumber="";


    /*********** Set Methods ******************/

    public void setPersonNameName(String PersonName)
    {
        this.PersonName = PersonName;
    }

    public void setPhonenumber(String PhoneNumber)
    {
        this.PhoneNumber = PhoneNumber;
    }



    /*********** Get Methods ****************/

    public String getPersonName()
    {
        return this.PersonName;
    }

    public String getPhoneNumber()
    {
        return this.PhoneNumber;
    }


}
