package Hospital;

class Patient {
    String name;
    double consultFee;

    public Patient(String name, double consultFee) {
        this.name = name;
        this.consultFee = consultFee;
    }

    public double CalculateBill() {
        return consultFee;
    }

    public void Display() {
        System.out.println("Name: " + name);
        System.out.println("Consult Fee: $" + consultFee);
        System.out.println("Total Bill: $" + CalculateBill());
    }
}

class Outpatient extends Patient {
     double labCharge;

    public Outpatient(String name, double consultFee, double labCharge) {
        super(name, consultFee);
        this.labCharge = labCharge;
    }

    @Override
    public double CalculateBill() {
        return labCharge + consultFee;
    }

    @Override
    public void Display() {
        System.out.println("Name: " + name);
        System.out.println("Consult Fee: $" + consultFee);
        System.out.println("Lab Charge: $" + labCharge);
        System.out.println("Total Bill: $" + CalculateBill());
    }
}

class Inpatient extends Patient {
    private double roomCharge;
    private int numberOfDays;

    public Inpatient(String name, double consultFee, double roomCharge, int numberOfDays) {
        super(name, consultFee);
        this.roomCharge = roomCharge;
        this.numberOfDays = numberOfDays;
    }

    @Override
    public double CalculateBill() {
        return (numberOfDays * roomCharge) + consultFee;
    }

    @Override
    public void Display() {
        System.out.println("Name: " + name);
        System.out.println("Consult Fee: $" + consultFee);
        System.out.println("Room Charge: $" + roomCharge);
        System.out.println("Number of Days: " + numberOfDays);
        System.out.println("Total Bill: $" + CalculateBill());
    }
}
 class Main {
    public static void main(String[] args) {
        Patient p = new Patient("Farah", 10);
        Outpatient op = new Outpatient("Hodan", 20, 15);
        Inpatient ip = new Inpatient("Ali", 50, 30, 5);

        System.out.println("===== PATIENT =====");
        p.Display();

        System.out.println("\n===== OUTPATIENT =====");
        op.Display();

        System.out.println("\n===== INPATIENT =====");
        ip.Display();
    }
}