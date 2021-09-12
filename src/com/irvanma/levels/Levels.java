package src.com.irvanma.levels;
public class Levels {
    private String diff[];

    public Levels() {
        // intentionally empty
    }

    public void setLevel(int i) {
        if (i == 1)
            this.diff = new String[]{
                "Apel", "Jeruk", "Pisang", "Pir", "Nanas"
            };
        else if (i == 2)
            this.diff = new String[]{
                "Kerbau", "Kepiting", "Kerang", "Kelinci", "Merpati",
                "Belut", "Bekicot", "Cacing", "Lintah", "Manusia"
            };
        else if (i == 3)
            this.diff = new String[]{
                "Jayapura", "Palembang", "Tasikmalaya", "Bengkulu", "Lubuklinggau",
                "Banjarmasin", "Lhokseumawe", "Betung", "Indralaya", "Depok",
                "Tangerang", "Jogjakarta", "Malang", "Bandung", "Baturaja"
            };
        else if (i == 4)
            this.diff = new String[]{
                "Amerika", "Jepang", "Mikronesia", "Nigeria", "Cekoslovakia",
                "Irlandia", "Singapura", "Australia", "Belorusia", "Norwegia",
                "Denmark", "Belanda", "Estonia", "Latvia", "Hungaria",
                "Finlandia", "Kazakhstan", "Uzbekistan", "Turkmenistan", "Israel"
            };
        else if (i == 5)
            this.diff = new String[]{
                "Aini", "Irvan", "Fathur", "Aldi", "Nazifah",
                "Munawaroh", "Alif", "Pasha", "Bintang", "Elwina",
                "Dzaky", "Dini", "Tamir", "Gandi", "Nabiel",
                "Arya", "Hanif", "Bulan", "Yuansheva", "Sheva",
                "Alvian", "Taveto", "Rivaldo", "Chosmas", "Lastri",
                "Agustina", "Erika", "Depit", "Alhafiz", "Bagus"
            };
    }

    public String getLevelString(int i) {
        return this.diff[i];
    }

    public int getLength() {
        return this.diff.length;
    }

    public void displayLevel() {
        System.out.println("\nTerdapat 5 level:");
        System.out.println("1. Easy (Nama-nama buah)");
        System.out.println("2. Medium (Nama-nama hewan)");
        System.out.println("3. Hard (Nama-nama kota di Indonesia)");
        System.out.println("4. Very Hard (Nama-nama negara)");
        System.out.println("5. Chaos (Nama-nama teman-teman di TI Unsri '20)");
        System.out.print("Masukkan level sesuai nomor: ");
    }
}