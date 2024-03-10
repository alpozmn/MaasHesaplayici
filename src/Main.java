import java.time.LocalDate;

public class Main {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary <= 1000) {
            return 0; // Vergi uygulanmaz
        } else {
            return salary * 0.03; // Maaşın %3'ü kadar vergi uygulanır
        }
    }

    public double bonus() {
        int extraHours = Math.max(workHours - 40, 0); // Ekstra çalışma saatlerini hesapla
        return extraHours * 30; // Her fazla saat başına 30 TL bonus
    }

    public void raiseSalary() {
        int yearsWorked = LocalDate.now().getYear() - hireYear; // Çalışılan yıl sayısı

        if (yearsWorked < 10) {
            salary *= 1.05; // %5 zam
        } else if (yearsWorked < 20) {
            salary *= 1.10; // %10 zam
        } else {
            salary *= 1.15; // %15 zam
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }

    // Getter ve setter metodları (kısaltılmış)
}
