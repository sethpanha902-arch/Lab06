package Challenge;

class PatientRecord {

    private String ssn;
    protected String medical_history;

    public PatientRecord(String ssn, String history) {
        this.ssn = ssn;
        this.medical_history = history;
    }

    public void showSSN() {
        System.out.println("SSN: " + ssn);
    }
}

class OutpatientRecord extends PatientRecord {

    public OutpatientRecord(String ssn, String history) {
        super(ssn, history);
    }

    public void display() {
        System.out.println("Outpatient Record");
        System.out.println("Medical History: " +
                medical_history);

        showSSN();
    }
}

class InpatientRecord extends PatientRecord {

    public InpatientRecord(String ssn, String history) {
        super(ssn, history);
    }

    public void display() {
        System.out.println("Inpatient Record");
        System.out.println("Medical History: " +
                medical_history);

        showSSN();
    }
}

public class Challenge5 {
    public static void main(String[] args) {

        OutpatientRecord out = new OutpatientRecord(
                "123456", "Fever");

        InpatientRecord in = new InpatientRecord(
                "789012", "Broken arm");

        out.display();

        System.out.println();

        in.display();
        System.out.println(out.medical_history);
    }
}
