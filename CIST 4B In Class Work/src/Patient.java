import java.util.PriorityQueue;
import java.util.Scanner;

public class Patient implements Comparable<Patient> {
    String name;
    int priorty; 

    public Patient(String name, int priorty) {
        this.name = name;
        this.priorty = priorty;
    }

    public int compareTo(Patient other) {
        // higher priorty gets treated first
        return other.priorty - this.priorty;
    }

    public class Triage {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            PriorityQueue<Patient> queue = new PriorityQueue<>();

            System.out.print("How many patients are entered? ");
            int numberPatients = scanner.nextInt();
            scanner.nextLine(); 

            for (int i = 0; i < numberPatients; i++) {
                System.out.println("Enter patient number " + (i + 1));

                System.out.print("Patient Name: ");
                String name = scanner.nextLine();

                System.out.print("Priorty level ");
                int priority = scanner.nextInt();
                
                Patient patient = new Patient(name, priority);
                queue.offer(patient);
            }
        }
    }
}
