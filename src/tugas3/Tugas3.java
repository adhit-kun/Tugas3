/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 * @author Adhitya Kuncoro Jatti
 *         10116472
 *         PBO 11 / IF 11
 *         UNIKOM Indonesia
 */ 

 class Mahasiswa {                                                              // Class 

    String nama, nim, ket;                                               
    double quiz, uts, uas, nilaiAkhir;
    char index;                                                                 // End Class

    public double getNilaiAkhir(double quiz, double uts, double uas) {          
        nilaiAkhir = 0.2 * quiz + 0.3 * uts + 0.5 * uas;
        return nilaiAkhir;
    }

    public void getIndex(double nilaiAkhir) {                                   // Method
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            index = 'A';
            ket = "Sangat Baik";
        } else if (nilaiAkhir > 68 && nilaiAkhir <= 80) {
            index = 'B';
            ket = "Baik";
        } else if (nilaiAkhir > 56 && nilaiAkhir <= 68) {
            index = 'C';
            ket = "Cukup";
        } else if (nilaiAkhir > 45 && nilaiAkhir <= 56) {
            index = 'D';
            ket = "Kurang";
        } else if (nilaiAkhir <= 45) {
            index = 'E';
            ket = "Sangat Kurang";
        }
    }                                                                           // End Method
}

// main program
public class Tugas3 {   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Mahasiswa mhss = new Mahasiswa();                                       // Object
        mhss.nama = "Rizki Adam kurniawan";
        mhss.nim  = "7.51.15.036";
        mhss.quiz = 85;
        mhss.uts  = 80;
        mhss.uas  = 85;
        mhss.getNilaiAkhir(mhss.quiz, mhss.uts, mhss.uas);
        mhss.getIndex(mhss.nilaiAkhir);                                         // End Object

        for (int i = 1; i <= 4; i++) {
            System.out.println(" Nama ke " + i + "\t\t = " + mhss.nama);
        }
        for (int ii = 8; ii >= 1; ii--) {
            System.out.println(" NIM ke " + ii + "\t\t = " + mhss.nim + "." + ii);
        }

        System.out.println("\n Quiz \t \t= " + mhss.quiz);
        System.out.println(" UTS \t \t= " + mhss.uts);
        System.out.println(" UAS \t \t= " + mhss.uas);
        System.out.println("\n Nilai Akhir \t= " + mhss.getNilaiAkhir(mhss.quiz, mhss.uts, mhss.uas));
        System.out.println("\n Index    \t= "+mhss.index);
        System.out.println(" Keterangan \t= "+mhss.ket);
    }
}
    //end main program

    // P.S.  Correct me if i'm wrong :)