import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String response;

        System.out.println("Contact Tracing Program\n" +
                "Enter a newly infected person's information");
        Person person1 = new Person();
        System.out.println("What is a patient's name? ");
        person1.setName(input.nextLine());
        while(true) {
            try {
                System.out.println("What is a patient's phone number? ");
                person1.setPhone(input.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid phone number! Try again");
            }
        }

        while(true) {
            try {
                System.out.println("What is a patient's email? ");
                person1.setEmail(input.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid email address! Try again");
            }
        }

        System.out.println("What city does a patient live in? ");
        person1.setCity(input.nextLine());
        System.out.println("What state does a patient live in?");
        person1.setState(input.nextLine());

        //asking symptoms start here **********************
        //symptom Fever
        Symptom symptomFever = new Symptom();
        System.out.printf("Does %s have any symptom for Fever? (y/n) ", person1.getName());
        response = input.nextLine().toLowerCase(Locale.ROOT);
            if (response.charAt(0) == 'y') {
                person1.addSymptom(symptomFever);
                symptomFever.setNameOfSymptom("Fever");
                System.out.printf("How long has %s had this symptom for? ", person1.getName());
                symptomFever.setTimeframeOfSymptom(input.nextLine());
            }

        //symptom Cough
        Symptom symptomCough = new Symptom();
        System.out.printf("Does %s have any symptom for Cough? (y/n) ", person1.getName());
        response = input.nextLine().toLowerCase(Locale.ROOT);
            if (response.charAt(0) == 'y') {
                person1.addSymptom(symptomCough);
                symptomCough.setNameOfSymptom("Cough");
                System.out.printf("How long has %s had this symptom for? ", person1.getName());
                symptomCough.setTimeframeOfSymptom(input.nextLine());
            }

        //symptom difficulty breathing
        Symptom symptomBreathing = new Symptom();
        System.out.printf("Does %s have any symptom for Shortness of breath or difficulty breathing? (y/n) ", person1.getName());
        response = input.nextLine().toLowerCase(Locale.ROOT);
            if (response.charAt(0) == 'y') {
                person1.addSymptom(symptomBreathing);
                symptomBreathing.setNameOfSymptom("Difficulty breathing");
                System.out.printf("How long has %s had this symptom for? ", person1.getName());
                symptomBreathing.setTimeframeOfSymptom(input.nextLine());
            }

        //symptom Tiredness
        Symptom symptomTiredness = new Symptom();
        System.out.printf("Does %s have any symptom for Tiredness? (y/n) ", person1.getName());
        response = input.nextLine().toLowerCase(Locale.ROOT);
        if (response.charAt(0) == 'y') {
            person1.addSymptom(symptomTiredness);
            symptomTiredness.setNameOfSymptom("Tiredness");
            System.out.printf("How long has %s had this symptom for? ", person1.getName());
            symptomTiredness.setTimeframeOfSymptom(input.nextLine());
        }
        //symptom Aches
        Symptom symptomAches = new Symptom();
        System.out.printf("Does %s have any symptom for Aches? (y/n) ", person1.getName());
        response = input.nextLine().toLowerCase(Locale.ROOT);
        if (response.charAt(0) == 'y') {
            person1.addSymptom(symptomAches);
            symptomAches.setNameOfSymptom("Aches");
            System.out.printf("How long has %s had this symptom for? ", person1.getName());
            symptomAches.setTimeframeOfSymptom(input.nextLine());
        }
        //symptom Chills
        Symptom symptomChills = new Symptom();
        System.out.printf("Does %s have any symptom for Chills? (y/n) ", person1.getName());
        response = input.nextLine().toLowerCase(Locale.ROOT);
        if (response.charAt(0) == 'y') {
            person1.addSymptom(symptomChills);
            symptomChills.setNameOfSymptom("Chills");
            System.out.printf("How long has %s had this symptom for? ", person1.getName());
            symptomChills.setTimeframeOfSymptom(input.nextLine());
        }
        //symptom Sore throat
        Symptom symptomSoreThroat = new Symptom();
        System.out.printf("Does %s have any symptom for Sore throat? (y/n) ", person1.getName());
        response = input.nextLine().toLowerCase(Locale.ROOT);
        if (response.charAt(0) == 'y') {
            person1.addSymptom(symptomSoreThroat);
            symptomSoreThroat.setNameOfSymptom("Sore throat");
            System.out.printf("How long has %s had this symptom for? ", person1.getName());
            symptomSoreThroat.setTimeframeOfSymptom(input.nextLine());
        }
        //symptom Loss of smell
        Symptom symptomLossOfSmell = new Symptom();
        System.out.printf("Does %s have any symptom for Loss of smell? (y/n) ", person1.getName());
        response = input.nextLine().toLowerCase(Locale.ROOT);
        if (response.charAt(0) == 'y') {
            person1.addSymptom(symptomLossOfSmell);
            symptomLossOfSmell.setNameOfSymptom("Loss of smell");
            System.out.printf("How long has %s had this symptom for? ", person1.getName());
            symptomLossOfSmell.setTimeframeOfSymptom(input.nextLine());
        }
        //symptom Loss of taste
        Symptom symptomLossOfTaste = new Symptom();
        System.out.printf("Does %s have any symptom for Loss of taste? (y/n) ", person1.getName());
        response = input.nextLine().toLowerCase(Locale.ROOT);
        if (response.charAt(0) == 'y') {
            person1.addSymptom(symptomLossOfTaste);
            symptomLossOfTaste.setNameOfSymptom("Loss of taste");
            System.out.printf("How long has %s had this symptom for? ", person1.getName());
            symptomLossOfTaste.setTimeframeOfSymptom(input.nextLine());
        }
        //symptom Headache
        Symptom symptomHeadache = new Symptom();
        System.out.printf("Does %s have any symptom for Headache? (y/n) ", person1.getName());
        response = input.nextLine().toLowerCase(Locale.ROOT);
        if (response.charAt(0) == 'y') {
            person1.addSymptom(symptomHeadache);
            symptomHeadache.setNameOfSymptom("Headache");
            System.out.printf("How long has %s had this symptom for? ", person1.getName());
            symptomHeadache.setTimeframeOfSymptom(input.nextLine());
        }
        //symptom Diarrhea
        Symptom symptomDiarrhea = new Symptom();
        System.out.printf("Does %s have any symptom for Diarrhea? (y/n) ", person1.getName());
        response = input.nextLine().toLowerCase(Locale.ROOT);
        if (response.charAt(0) == 'y') {
            person1.addSymptom(symptomDiarrhea);
            symptomDiarrhea.setNameOfSymptom("Diarrhea");
            System.out.printf("How long has %s had this symptom for? ", person1.getName());
            symptomDiarrhea.setTimeframeOfSymptom(input.nextLine());
        }
        //symptom Severe vomiting
        Symptom symptomSevereVomiting = new Symptom();
        System.out.printf("Does %s have any symptom for Severe vomiting? (y/n) ", person1.getName());
        response = input.nextLine().toLowerCase(Locale.ROOT);
        if (response.charAt(0) == 'y') {
            person1.addSymptom(symptomSevereVomiting);
            symptomSevereVomiting.setNameOfSymptom("Severe vomiting");
            System.out.printf("How long has %s had this symptom for? ", person1.getName());
            symptomSevereVomiting.setTimeframeOfSymptom(input.nextLine());
        }
        //asking symptoms finish here *****************


        // contacted person info **********************
        System.out.printf("Has %s met or run into anyone? (y/n) ", person1.getName());
        response = input.nextLine().toLowerCase(Locale.ROOT);

        while(response.charAt(0) == 'y'){
            ContactedPerson contactedPerson = new ContactedPerson();
            person1.addContactedPerson(contactedPerson);
            System.out.println("What is his/her name?");
            contactedPerson.setContactedPersonName(input.nextLine());

            while(true) {
                try {
                    System.out.println("What is his/her phone number? ");
                    contactedPerson.setContactedPersonPhone(input.nextLine());
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid phone number! Try again");
                }
            }

            while(true) {
                try {
                    System.out.println("What is his/her email? ");
                    contactedPerson.setContactedPersonEmail(input.nextLine());
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid email address! Try again");
                }
            }

            System.out.printf("Has %s met or run into anyone else? (y/n) ", person1.getName());
            response = input.nextLine().toLowerCase(Locale.ROOT);
        };


        // printing person1's contact tracing report
        System.out.println(person1.displayPerson());
        person1.displaySymptom();
        person1.displayContactedPerson();


    }
}
