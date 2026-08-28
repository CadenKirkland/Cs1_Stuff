//Cadenk
//demonstrate creating objects from class & its methods
class Doctor {
    String speciality;
    int years;
    String name;

    void consults() {
        System.out.println(speciality + "reviews xrays, mri, bloodtests");
    }

    void performsProcedure() {
        System.out.println(name + "performs procedure");
    }

    void prescribeMeds() {
        System.out.println(name + "prescribes meds");
    }
    void attendsConferences() {
        System.out.println(name + "attendsConferences");
    }
}
public class Java8Docter {

    public static void main(String[] args){
        Doctor nuero = new Doctor();  // create neuro object from Doctor class
        nuero.speciality = "brainDr";
        nuero.years = 12;
        nuero.name = "Dr. Jekyll";

        nuero.consults();
        nuero.performsProcedure();
        nuero.prescribeMeds();
        nuero.attendsConferences();

        Doctor surgeon = new Doctor();  // create neuro object from Doctor class
        surgeon.speciality = "surgicalDr";
        surgeon.years = 15;
        surgeon.name = "Dr. abcde";

        surgeon.consults();
        surgeon.performsProcedure();
        surgeon.prescribeMeds();
        surgeon.attendsConferences();


        Doctor pediatric = new Doctor();  // create neuro object from Doctor class
        pediatric.speciality = "childDr";
        pediatric.years = 12;
        pediatric.name = "Dr. apple";

        pediatric.consults();
        pediatric.performsProcedure();
        pediatric.prescribeMeds();
        pediatric.attendsConferences();



    }
}