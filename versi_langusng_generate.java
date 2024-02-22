import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class versi_langusng_generate {
    public static void main(String[] args) {
        // Nilai-nilai ditetapkan secara langsung
        String nama = "bagus ";
        String jenisKelaminInput = "L";
        String jenisKelamin;
        if (jenisKelaminInput.equalsIgnoreCase("L")) {
            jenisKelamin = "Laki-laki";
        } else if (jenisKelaminInput.equalsIgnoreCase("P")) {
            jenisKelamin = "Perempuan";
        } else {
            System.out.println("Input tidak valid.");
            return;
        }
        String tanggalLahirInput = "2004-04-21";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirInput, formatter);
        Period umur = Period.between(tanggalLahir, LocalDate.now());

        // Menampilkan hasil
        System.out.println("\\\\ output\n");
        System.out.println("// input");
        System.out.println("Nama " + nama);
        System.out.println("Jenis Kelamin (" + jenisKelaminInput + "/"
                + ((jenisKelaminInput.equalsIgnoreCase("L")) ? "P" : "L") + "): " + jenisKelamin);
        System.out.println("Tanggal Lahir (yyyy-mm-dd) " + tanggalLahirInput);
        System.out.println("// output");
        System.out.println("Nama " + nama);
        System.out.println("Jenis Kelamin");
        System.out.println(jenisKelamin);
        System.out.println("Umur Anda " + umur.getYears() + " tahun " + umur.getMonths() + " bulan");
    }
}
