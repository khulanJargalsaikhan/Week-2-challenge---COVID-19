import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContactedPerson {
    //private attributes
    private String contactedPersonName;
    private String contactedPersonEmail;
    private String contactedPersonPhone;

    //default constructor
    public ContactedPerson(){

    }

    //getters and setters
    public String getContactedPersonName() {
        return contactedPersonName;
    }
    public void setContactedPersonName(String contactedPersonName) {
        this.contactedPersonName = contactedPersonName;
    }
    public String getContactedPersonEmail() {
        return contactedPersonEmail;
    }
    public void setContactedPersonEmail(String contactedPersonEmail) {
        if(isEmailValid(contactedPersonEmail) == true)
            this.contactedPersonEmail = contactedPersonEmail;
        else
            throw new IllegalArgumentException("Invalid email address " + contactedPersonEmail);
    }
    // validating email address before set it
    private boolean isEmailValid(String email){
        boolean isValid = false;

        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        CharSequence inputStr = email;
        //Make the comparison case-insensitive.
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
        if(matcher.matches()){
            isValid = true;
        }
        return isValid;
    }

    public String getContactedPersonPhone() {
        return contactedPersonPhone;
    }
    public void setContactedPersonPhone(String contactedPersonPhone) {
        if (isPhoneNumberValid(contactedPersonPhone) == true)
            this.contactedPersonPhone = contactedPersonPhone;
        else
            throw new IllegalArgumentException("Invalid phone number " + contactedPersonPhone);
    }

    // validating phone number before set it
    private boolean isPhoneNumberValid(String phoneNumber){
        boolean isValid = false;

        String expression = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";
        CharSequence inputStr = phoneNumber;
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(inputStr);
        if(matcher.matches()){
            isValid = true;
        }
        return isValid;
    }


}
