public class mahasiswa {
    public static void main(String[] args) {

        String nama1, nama2, nama3, nama4, nama5, nama6, nama7, nama8, nama9, nama10;
        String nim1, nim2, nim3, nim4, nim5, nim6, nim7, nim8, nim9, nim10;
        double ipk1, ipk2, ipk3, ipk4, ipk5, ipk6, ipk7, ipk8, ipk9, ipk10; 

        nama1 = "Andi";
        nim1 = "244107060001";
        ipk1 = 3.5;

        nama2 = "Budi";
        nim2 = "244107060002";
        ipk2 = 3.7;

        nama3 = "Citra";
        nim3 = "244107060003";
        ipk3 = 3.9;

        nama4 = "Dewi";
        nim4 = "244107060004";
        ipk4 = 3.2;

        nama5 = "Eka";
        nim5 = "244107060005";
        ipk5 = 3.6;

        nama6 = "Fajar";
        nim6 = "244107060006";
        ipk6 = 3.8;

        nama7 = "Gita";
        nim7 = "244107060007";
        ipk7 = 3.4;

        nama8 = "Hendra";
        nim8 = "244107060008";
        ipk8 = 3.1;

        nama9 = "Indah";
        nim9 = "244107060009";
        ipk9 = 3.85;

        nama10 = "Joko";
        nim10 = "244107060010";
        ipk10 = 3.45;

        belajar(nama1);
        belajar(nama5);
        belajar(nama10);

        melihatKHS(nama2, ipk2);
        melihatKHS(nama3, ipk3);
        melihatKHS(nama7, ipk7);
    }

    public static void belajar(String nama) {
        System.out.println(nama + " sedang belajar");
    }

    public static void melihatKHS(String nama, double ipk) {
        System.out.println(nama + " sedang melihat KHS dengan IPK: " + ipk);
    }    
}
