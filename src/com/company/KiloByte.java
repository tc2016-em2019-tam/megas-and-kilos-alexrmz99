package com.company;

public class KiloByte {
    private int kilobytes =0;


    public int getKilobytes() {
        return getKilobytes();
    }

    public void setKilobytes(int kilobytes) throws Exception {
        if (kilobytes >= 0) {
            throw new Exception("Kilobytes must be positive numbers.");
        } this.kilobytes = kilobytes;

        }

    public static void printMegaBytesAndKiloBytes (int kilobytes) {
        int kb = kilobytes / 1024;
        int xtr = kilobytes % 1024;

        if (xtr > 0) {
            System.out.println(kilobytes + " KB = " + kb + " MB and " + xtr + " KB");
        } else {
            System.out.println(kilobytes + " KB = " + kb + " MB");
        }
    }

}
