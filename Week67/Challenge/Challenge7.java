package Challenge;


abstract class Document {

    public final void generate() {
        write_header();
        write_body();
        write_footer();
    }

    public abstract void write_header();

    public abstract void write_body();

    public abstract void write_footer();
}

class InvoiceDocument extends Document {

    public void write_header() {
        System.out.println("Invoice Header");
    }

    public void write_body() {
        System.out.println("Customer: John");
        System.out.println("Total: $500");
    }

    public void write_footer() {
        System.out.println("Thank you!");
    }
}

class ResumeDocument extends Document {

    public void write_header() {
        System.out.println("Resume");
    }

    public void write_body() {
        System.out.println("Name: Alex");
        System.out.println("Skills: Java and Python");
    }

    public void write_footer() {
        System.out.println("Contact: alex@email.com");
    }
}

class ReportDocument extends Document {

    public void write_header() {
        System.out.println("Annual Report");
    }

    public void write_body() {
        System.out.println("Company Performance: Good");
    }

    public void write_footer() {
        System.out.println("End of Report");
    }
}

public class Challenge7 {
    public static void main(String[] args) {

        Document[] documents = {
            new InvoiceDocument(),
            new ResumeDocument(),
            new ReportDocument()
        };

        for (Document d : documents) {
            d.generate();
            System.out.println();
        }
    }
}
