import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
    //private attributes
    private String name;
    private String email;
    private String phone;
    private String city;
    private String state;
    private ArrayList<Symptom> symptomArrayList = new ArrayList<>();
    private ArrayList<ContactedPerson> contactedPersonArrayList = new ArrayList<>();

    //default constructor
    public Person(){
        this.symptomArrayList = new ArrayList<>();
        this.contactedPersonArrayList = new ArrayList<>();
    }


    // adding a symptom to the list of symptoms
    public void addSymptom(Symptom s){
        symptomArrayList.add(s);
    }
    // displaying all symptoms
    public void displaySymptom(){
        System.out.println("\n**\tSymptoms: ");
        for (Symptom s : symptomArrayList)
            System.out.println("\thad " + s.getNameOfSymptom() + " for " + s.getTimeframeOfSymptom());

    }

    // adding a contacted person to the list of contacted persons
    public void addContactedPerson(ContactedPerson cp){
        contactedPersonArrayList.add(cp);
    }

    // displaying all contacted person
    public void displayContactedPerson(){
        System.out.print("\n**\tContacts: ");
        for (ContactedPerson cp : contactedPersonArrayList)
            System.out.println( "\nName: " + cp.getContactedPersonName() +
                                "\nPhone: " + cp.getContactedPersonPhone() +
                                "\nEmail: " + cp.getContactedPersonEmail());
    }


    //getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        if(isEmailValid(email) == true)
            this.email = email;
        else
            throw new IllegalArgumentException("Invalid email address " + email);
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


    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        if (isPhoneNumberValid(phone) == true)
            this.phone = phone;
        else
            throw new IllegalArgumentException("Invalid phone number " + phone);

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

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }


    public String displayPerson(){
        return "\n**** Contact Tracing Report ****" +
                "\nName: " + name +
                "\nPhone: " + phone +
                "\nEmail: " + email +
                "\nCity: " + city +
                "\nStat: " + state;

    }

}
