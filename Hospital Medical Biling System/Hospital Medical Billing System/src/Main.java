public class Main {
    public static void main(String[] args) {
        MedicalService[] services = {
                new Consultation("S101", 25, 20),
                new LaboratoryTest("S102", 20, 10),
                new Ultrasound("S103", 30, 20)
        };

        System.out.println("===== HOSPITAL BILLING SYSTEM =====\n");

        double totalBill = 0;
        for (MedicalService s : services) {
            s.displayServiceInfo();
            totalBill += s.calculateTotalCost();
        }

        System.out.println("------------------------------");
        System.out.printf("Total Hospital Bill: $%.2f%n", totalBill);
    }
}