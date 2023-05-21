package sample;

import java.io.*;
import java.io.RandomAccessFile;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.paint.Paint;

import static javafx.scene.paint.Color.WHITE;

/**
 * @author David Havel, 3.IT, SČMSD Humpolec
 */
public class Resistor {
    public double rawvalue;
    public double finalvalue;

    public int serie = 1;

    /**
     * barvy proužku rezistoru
     */
    public enum Colours {NONE, BLACK, BROWN, RED, ORANGE, YELLOW, GREEN, BLUE, PURPLE, GREY, WHITE, GOLD, SILVER}

    Colours colours[] = {Colours.NONE, Colours.NONE, Colours.NONE, Colours.NONE, Colours.NONE};

    public static void main(String[] A) {
        System.out.println("test odporu");
        /**
         * objekt Resistor
         */
        Resistor newResistor = new Resistor();
        newResistor.serie = 3;
        newResistor.setColours(Colours.BROWN, 0);
        newResistor.setColours(Colours.BROWN, 1);
        newResistor.setColours(Colours.BROWN, 2);
        newResistor.setColours(Colours.BROWN, 3);
        newResistor.setRawvalue(152);
        newResistor.normalize();
        System.out.println(newResistor.getColours(0));
        System.out.println(newResistor.Convertcolorstopaint(Colours.BROWN));
        newResistor.convertcolortovaluefiveband();
        System.out.println(newResistor.getFinalvalue());
        newResistor.convertcolortovaluefourband();
        System.out.println(newResistor.getFinalvalue());
        newResistor.setFinalvalue(125);
        newResistor.convertvaluetocolorsfourband(false, true, false);
        System.out.println(newResistor.getColours(0));
        System.out.println(newResistor.getColours(1));
        System.out.println(newResistor.getColours(2));
        System.out.println(newResistor.getColours(3));
        newResistor.convertvaluetocolorsfiveband(true, false, false);
        System.out.println(newResistor.getColours(0));
        System.out.println(newResistor.getColours(1));
        System.out.println(newResistor.getColours(2));
        System.out.println(newResistor.getColours(3));
        System.out.println(newResistor.getColours(4));
    }

    /**
     * Metoda convertcolortovaluefiveband převádí barevný kód 5 pásmového rezistoru na číselnou hodnotu
     */

    public void convertcolortovaluefiveband() {
        double buffervalue = 0;

        if (this.getColours(0) == Colours.BLACK) buffervalue += 0;
        if (this.getColours(0) == Colours.BROWN) buffervalue += 100;
        if (this.getColours(0) == Colours.RED) buffervalue += 200;
        if (this.getColours(0) == Colours.ORANGE) buffervalue += 300;
        if (this.getColours(0) == Colours.YELLOW) buffervalue += 400;
        if (this.getColours(0) == Colours.GREEN) buffervalue += 500;
        if (this.getColours(0) == Colours.BLUE) buffervalue += 600;
        if (this.getColours(0) == Colours.PURPLE) buffervalue += 700;
        if (this.getColours(0) == Colours.GREY) buffervalue += 800;
        if (this.getColours(0) == Colours.WHITE) buffervalue += 900;

        if (this.getColours(1) == Colours.BLACK) buffervalue += 0;
        if (this.getColours(1) == Colours.BROWN) buffervalue += 10;
        if (this.getColours(1) == Colours.RED) buffervalue += 20;
        if (this.getColours(1) == Colours.ORANGE) buffervalue += 30;
        if (this.getColours(1) == Colours.YELLOW) buffervalue += 40;
        if (this.getColours(1) == Colours.GREEN) buffervalue += 50;
        if (this.getColours(1) == Colours.BLUE) buffervalue += 60;
        if (this.getColours(1) == Colours.PURPLE) buffervalue += 70;
        if (this.getColours(1) == Colours.GREY) buffervalue += 80;
        if (this.getColours(1) == Colours.WHITE) buffervalue += 90;

        if (this.getColours(2) == Colours.BLACK) buffervalue += 0;
        if (this.getColours(2) == Colours.BROWN) buffervalue += 1;
        if (this.getColours(2) == Colours.RED) buffervalue += 2;
        if (this.getColours(2) == Colours.ORANGE) buffervalue += 3;
        if (this.getColours(2) == Colours.YELLOW) buffervalue += 4;
        if (this.getColours(2) == Colours.GREEN) buffervalue += 5;
        if (this.getColours(2) == Colours.BLUE) buffervalue += 6;
        if (this.getColours(2) == Colours.PURPLE) buffervalue += 7;
        if (this.getColours(2) == Colours.GREY) buffervalue += 8;
        if (this.getColours(2) == Colours.WHITE) buffervalue += 9;


        if (this.getColours(3) == Colours.BROWN) buffervalue *= 10;
        if (this.getColours(3) == Colours.RED) buffervalue *= 100;
        if (this.getColours(3) == Colours.ORANGE) buffervalue *= 1000;
        if (this.getColours(3) == Colours.YELLOW) buffervalue *= 10000;
        if (this.getColours(3) == Colours.GREEN) buffervalue *= 100000;
        if (this.getColours(3) == Colours.BLUE) buffervalue *= 1000000;
        if (this.getColours(3) == Colours.PURPLE) buffervalue *= 10000000;
        if (this.getColours(3) == Colours.GOLD) buffervalue *= 0.1;
        if (this.getColours(3) == Colours.SILVER) buffervalue *= 0.01;

        setFinalvalue(buffervalue);

    }

    /**
     * Metoda convertcolortovaluefourband převádí barevný kód 4 pásmového rezistoru na číselnou hodnotu
     */

    public void convertcolortovaluefourband() {
        double buffervalue = 0;
        if (this.getColours(0) == Colours.BLACK) buffervalue += 0;
        if (this.getColours(0) == Colours.BROWN) buffervalue += 10;
        if (this.getColours(0) == Colours.RED) buffervalue += 20;
        if (this.getColours(0) == Colours.ORANGE) buffervalue += 30;
        if (this.getColours(0) == Colours.YELLOW) buffervalue += 40;
        if (this.getColours(0) == Colours.GREEN) buffervalue += 50;
        if (this.getColours(0) == Colours.BLUE) buffervalue += 60;
        if (this.getColours(0) == Colours.PURPLE) buffervalue += 70;
        if (this.getColours(0) == Colours.GREY) buffervalue += 80;
        if (this.getColours(0) == Colours.WHITE) buffervalue += 90;

        if (this.getColours(1) == Colours.BLACK) buffervalue += 0;
        if (this.getColours(1) == Colours.BROWN) buffervalue += 1;
        if (this.getColours(1) == Colours.RED) buffervalue += 2;
        if (this.getColours(1) == Colours.ORANGE) buffervalue += 3;
        if (this.getColours(1) == Colours.YELLOW) buffervalue += 4;
        if (this.getColours(1) == Colours.GREEN) buffervalue += 5;
        if (this.getColours(1) == Colours.BLUE) buffervalue += 6;
        if (this.getColours(1) == Colours.PURPLE) buffervalue += 7;
        if (this.getColours(1) == Colours.GREY) buffervalue += 8;
        if (this.getColours(1) == Colours.WHITE) buffervalue += 9;


        if (this.getColours(2) == Colours.BROWN) buffervalue *= 10;
        if (this.getColours(2) == Colours.RED) buffervalue *= 100;
        if (this.getColours(2) == Colours.ORANGE) buffervalue *= 1000;
        if (this.getColours(2) == Colours.YELLOW) buffervalue *= 10000;
        if (this.getColours(2) == Colours.GREEN) buffervalue *= 100000;
        if (this.getColours(2) == Colours.BLUE) buffervalue *= 1000000;
        if (this.getColours(2) == Colours.PURPLE) buffervalue *= 10000000;
        if (this.getColours(2) == Colours.GOLD) buffervalue *= 0.1;
        if (this.getColours(2) == Colours.SILVER) buffervalue *= 0.01;
        setFinalvalue(buffervalue);
    }

    /**
     * Metoda Convertcolorstopaint převede barvu na odpovídající HEX kód
     *
     * @param Colorvalue hodnota ke zpracování
     * @return vrátí hex kod
     */
    public Paint Convertcolorstopaint(Colours Colorvalue) {
        if (Colorvalue == Colours.WHITE) return WHITE;
        if (Colorvalue == Colours.BLUE) return Paint.valueOf("#065ffc");
        if (Colorvalue == Colours.BROWN) return Paint.valueOf("#994D00");
        if (Colorvalue == Colours.GOLD) return Paint.valueOf("#DAA520");
        if (Colorvalue == Colours.GREY) return Paint.valueOf("#808080");
        if (Colorvalue == Colours.YELLOW) return Paint.valueOf("#f7ff00");
        if (Colorvalue == Colours.BLACK) return Paint.valueOf("#000000");
        if (Colorvalue == Colours.ORANGE) return Paint.valueOf("#ff9d00");
        if (Colorvalue == Colours.RED) return Paint.valueOf("#ff0000");
        if (Colorvalue == Colours.SILVER) return Paint.valueOf("#C0C0C0");
        if (Colorvalue == Colours.GREEN) return Paint.valueOf("#09a800");
        if (Colorvalue == Colours.PURPLE) return Paint.valueOf("#aa03be");
        return Paint.valueOf("#ffc448");
    }

    public void convertvaluetocolorsfiveband(boolean ohm, boolean kohm, boolean mohm) {
        double fivebandvalue = 0;
        char[] fivebandvaluearray = new char[0];
        if (ohm) {
            if ((this.getFinalvalue()) < 10) {
                this.setColours(Colours.SILVER, 3);
                fivebandvalue = (this.getFinalvalue()) * 100;
                fivebandvaluearray = new String((String.valueOf(fivebandvalue))).toCharArray();

            }
            if (((this.getFinalvalue()) >= 10) && ((this.getFinalvalue()) < 100)) {
                this.setColours(Colours.GOLD, 3);
                fivebandvalue = (this.getFinalvalue()) * 10;
                fivebandvaluearray = new String((String.valueOf(fivebandvalue))).toCharArray();

            }
            if (((this.getFinalvalue()) >= 100) && ((this.getFinalvalue()) < 1000)) {
                this.setColours(Colours.BLACK, 3);
                fivebandvalue = (this.getFinalvalue()) * 1;
                fivebandvaluearray = new String((String.valueOf(fivebandvalue))).toCharArray();

            }
            if (((this.getFinalvalue()) == 1000)) {
                this.setColours(Colours.BROWN, 3);
                fivebandvalue = (this.getFinalvalue()) / 10;
                fivebandvaluearray = new String((String.valueOf(fivebandvalue))).toCharArray();
            }
        }
        if (kohm) {
            if ((this.getFinalvalue()) < 10) {
                this.setColours(Colours.BROWN, 3);
                fivebandvalue = (this.getFinalvalue()) * 100;
                fivebandvaluearray = new String((String.valueOf(fivebandvalue))).toCharArray();

            }
            if (((this.getFinalvalue()) >= 10) && ((this.getFinalvalue()) < 100)) {
                this.setColours(Colours.RED, 3);
                fivebandvalue = (this.getFinalvalue()) * 10;
                fivebandvaluearray = new String((String.valueOf(fivebandvalue))).toCharArray();

            }
            if (((this.getFinalvalue()) >= 100) && ((this.getFinalvalue()) < 1000)) {
                this.setColours(Colours.ORANGE, 3);
                fivebandvalue = (this.getFinalvalue()) * 1;
                fivebandvaluearray = new String((String.valueOf(fivebandvalue))).toCharArray();

            }
            if (((this.getFinalvalue()) == 1000)) {
                this.setColours(Colours.YELLOW, 3);
                fivebandvalue = (this.getFinalvalue()) / 10;
                fivebandvaluearray = new String((String.valueOf(fivebandvalue))).toCharArray();
            }
        }
        if (mohm) {
            if ((this.getFinalvalue()) < 10) {
                this.setColours(Colours.YELLOW, 3);
                fivebandvalue = (this.getFinalvalue()) * 100;
                fivebandvaluearray = new String((String.valueOf(fivebandvalue))).toCharArray();

            }
            if (((this.getFinalvalue()) >= 10) && ((this.getFinalvalue()) < 100)) {
                this.setColours(Colours.GREEN, 3);
                fivebandvalue = (this.getFinalvalue()) * 10;
                fivebandvaluearray = new String((String.valueOf(fivebandvalue))).toCharArray();

            }
            if (((this.getFinalvalue()) >= 100) && ((this.getFinalvalue()) < 1000)) {
                this.setColours(Colours.BLUE, 3);
                fivebandvalue = (this.getFinalvalue()) * 1;
                fivebandvaluearray = new String((String.valueOf(fivebandvalue))).toCharArray();

            }
            if (((this.getFinalvalue()) == 1000)) {
                this.setColours(Colours.PURPLE, 3);
                fivebandvalue = (this.getFinalvalue()) / 10;
                fivebandvaluearray = new String((String.valueOf(fivebandvalue))).toCharArray();

            }
        }
        this.showfirstband(fivebandvaluearray);
        this.showsecondband(fivebandvaluearray);
        this.showthirdband(fivebandvaluearray);

    }

    public void convertvaluetocolorsfourband(boolean ohm, boolean kohm, boolean mohm) {
        double fourbandvalue = 0;
        char[] fourbandvaluearray = new char[0];
        if (ohm) {
            if ((this.getFinalvalue()) < 10) {
                this.setColours(Colours.GOLD, 2);
                fourbandvalue = (this.getFinalvalue()) * 10;
                fourbandvaluearray = new String((String.valueOf(fourbandvalue))).toCharArray();

            }
            if (((this.getFinalvalue()) >= 10) && ((this.getFinalvalue()) < 100)) {
                this.setColours(Colours.BLACK, 2);
                fourbandvalue = (this.getFinalvalue()) * 1;
                fourbandvaluearray = new String((String.valueOf(fourbandvalue))).toCharArray();

            }
            if (((this.getFinalvalue()) >= 100) && ((this.getFinalvalue()) < 1000)) {
                this.setColours(Colours.BROWN, 2);
                fourbandvalue = (this.getFinalvalue()) / 10;
                fourbandvaluearray = new String((String.valueOf(fourbandvalue))).toCharArray();

            }
            if (((this.getFinalvalue()) == 1000)) {
                this.setColours(Colours.RED, 2);
                fourbandvalue = (this.getFinalvalue()) / 100;
                fourbandvaluearray = new String((String.valueOf(fourbandvalue))).toCharArray();

            }

        }
        if (kohm) {
            if ((this.getFinalvalue()) < 10) {
                this.setColours(Colours.RED, 2);
                fourbandvalue = (this.getFinalvalue()) * 10;
                fourbandvaluearray = new String((String.valueOf(fourbandvalue))).toCharArray();

            }
            if (((this.getFinalvalue()) >= 10) && ((this.getFinalvalue()) < 100)) {
                this.setColours(Colours.ORANGE, 2);
                fourbandvalue = (this.getFinalvalue()) * 1;
                fourbandvaluearray = new String((String.valueOf(fourbandvalue))).toCharArray();

            }
            if (((this.getFinalvalue()) >= 100) && ((this.getFinalvalue()) < 1000)) {
                this.setColours(Colours.YELLOW, 2);
                fourbandvalue = (this.getFinalvalue()) / 10;
                fourbandvaluearray = new String((String.valueOf(fourbandvalue))).toCharArray();

            }
            if (((this.getFinalvalue()) == 1000)) {
                this.setColours(Colours.GREEN, 2);
                fourbandvalue = (this.getFinalvalue()) / 100;
                fourbandvaluearray = new String((String.valueOf(fourbandvalue))).toCharArray();
            }

        }
        if (mohm) {
            if ((this.getFinalvalue()) < 10) {
                this.setColours(Colours.GREEN, 2);
                fourbandvalue = (this.getFinalvalue()) * 10;
                fourbandvaluearray = new String((String.valueOf(fourbandvalue))).toCharArray();

            }
            if (((this.getFinalvalue()) >= 10) && ((this.getFinalvalue()) < 100)) {
                this.setColours(Colours.BLUE, 2);
                fourbandvalue = (this.getFinalvalue()) * 1;
                fourbandvaluearray = new String((String.valueOf(fourbandvalue))).toCharArray();

            }
            if (((this.getFinalvalue()) >= 100) && ((this.getFinalvalue()) < 1000)) {
                this.setColours(Colours.PURPLE, 2);
                fourbandvalue = (this.getFinalvalue()) / 10;
                fourbandvaluearray = new String((String.valueOf(fourbandvalue))).toCharArray();

            }
            if (((this.getFinalvalue()) == 1000)) {
                this.setColours(Colours.GREY, 2);
                fourbandvalue = (this.getFinalvalue()) / 100;
                fourbandvaluearray = new String((String.valueOf(fourbandvalue))).toCharArray();
            }

        }
        this.showfirstband(fourbandvaluearray);
        this.showsecondband(fourbandvaluearray);
    }

    public void showfirstband(char[] valuefirstband) {
        if (valuefirstband[0] == '0') {
            this.setColours(Colours.BLACK, 0);
        }
        if (valuefirstband[0] == '1') {
            this.setColours(Colours.BROWN, 0);
        }
        if (valuefirstband[0] == '2') {
            this.setColours(Colours.RED, 0);
        }
        if (valuefirstband[0] == '3') {
            this.setColours(Colours.ORANGE, 0);
        }
        if (valuefirstband[0] == '4') {
            this.setColours(Colours.YELLOW, 0);
        }
        if (valuefirstband[0] == '5') {
            this.setColours(Colours.GREEN, 0);
        }
        if (valuefirstband[0] == '6') {
            this.setColours(Colours.BLUE, 0);
        }
        if (valuefirstband[0] == '7') {
            this.setColours(Colours.PURPLE, 0);
        }
        if (valuefirstband[0] == '8') {
            this.setColours(Colours.GREY, 0);
        }
        if (valuefirstband[0] == '9') {
            this.setColours(Colours.WHITE, 0);
        }
    }

    public void showsecondband(char[] valuesecondband) {
        if (valuesecondband[1] == '0') {
            this.setColours(Colours.BLACK, 1);
        }
        if (valuesecondband[1] == '1') {
            this.setColours(Colours.BROWN, 1);
        }
        if (valuesecondband[1] == '2') {
            this.setColours(Colours.RED, 1);
        }
        if (valuesecondband[1] == '3') {
            this.setColours(Colours.ORANGE, 1);
        }
        if (valuesecondband[1] == '4') {
            this.setColours(Colours.YELLOW, 1);
        }
        if (valuesecondband[1] == '5') {
            this.setColours(Colours.GREEN, 1);
        }
        if (valuesecondband[1] == '6') {
            this.setColours(Colours.BLUE, 1);
        }
        if (valuesecondband[1] == '7') {
            this.setColours(Colours.PURPLE, 1);
        }
        if (valuesecondband[1] == '8') {
            this.setColours(Colours.GREY, 1);
        }
        if (valuesecondband[1] == '9') {
            this.setColours(Colours.WHITE, 1);
        }
    }

    public void showthirdband(char[] valuethirdband) {
        if (valuethirdband[2] == '0') {
            this.setColours(Colours.BLACK, 2);
        }
        if (valuethirdband[2] == '1') {
            this.setColours(Colours.BROWN, 2);
        }
        if (valuethirdband[2] == '2') {
            this.setColours(Colours.RED, 2);
        }
        if (valuethirdband[2] == '3') {
            this.setColours(Colours.ORANGE, 2);
        }
        if (valuethirdband[2] == '4') {
            this.setColours(Colours.YELLOW, 2);
        }
        if (valuethirdband[2] == '5') {
            this.setColours(Colours.GREEN, 2);
        }
        if (valuethirdband[2] == '6') {
            this.setColours(Colours.BLUE, 2);
        }
        if (valuethirdband[2] == '7') {
            this.setColours(Colours.PURPLE, 2);
        }
        if (valuethirdband[2] == '8') {
            this.setColours(Colours.GREY, 2);
        }
        if (valuethirdband[2] == '9') {
            this.setColours(Colours.WHITE, 2);
        }
    }


    public void normalize() {


        try {
            RandomAccessFile monFichier = null;
            switch (this.getSerie()) {
                case 1:

                    File fileToBeFound = findFile(new File("").getAbsolutePath(), "E12.serie");
                    System.out.println(fileToBeFound != null ? fileToBeFound.getAbsolutePath() : "Not found");
                    String pathE12 = fileToBeFound.getAbsolutePath();
                    String newpathE12 = pathE12.replaceAll("\\\\", "\\\\\\\\");
                    System.out.println(newpathE12);
                    monFichier = new RandomAccessFile(newpathE12, "rw");

                    break;
                case 2:

                    fileToBeFound = findFile(new File("").getAbsolutePath(), "E24.serie");
                    System.out.println(fileToBeFound != null ? fileToBeFound.getAbsolutePath() : "Not found");
                    String pathE24 = fileToBeFound.getAbsolutePath();
                    String newpathE24 = pathE24.replaceAll("\\\\", "\\\\\\\\");
                    System.out.println(newpathE24);
                    monFichier = new RandomAccessFile(newpathE24, "rw");
                    break;
                case 3:

                    fileToBeFound = findFile(new File("").getAbsolutePath(), "E96.serie");
                    System.out.println(fileToBeFound != null ? fileToBeFound.getAbsolutePath() : "Not found");
                    String pathE96 = fileToBeFound.getAbsolutePath();
                    String newpathE96 = pathE96.replaceAll("\\\\", "\\\\\\\\");
                    System.out.println(newpathE96);
                    monFichier = new RandomAccessFile(newpathE96, "rw");
                    break;
            }

            double buffer1 = 0;
            double buffer2 = 0;
            boolean bool = true;
            String value;
            value = monFichier.readLine();
            Double monnombre = new Double(value);
            buffer1 = monnombre.doubleValue(); //conversion d'String en double

            value = monFichier.readLine();
            monnombre = new Double(value);
            buffer2 = monnombre.doubleValue(); //conversion d'String en double
            while (bool) {
                if ((Math.abs(this.getRawvalue() - buffer2)) >= (Math.abs(this.getRawvalue() - buffer1))) {
                    this.setFinalvalue(buffer1);
                    bool = false;
                }
                buffer1 = buffer2;
                value = monFichier.readLine();
                monnombre = new Double(value);
                buffer2 = monnombre.doubleValue(); //conversion d'String en double
                if (buffer2 == -1) {
                    this.setFinalvalue(buffer1);
                    bool = false;
                }

            }
            monFichier.close();
            System.out.println(this.getFinalvalue());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static final File findFile(final String rootFilePath, final String fileToBeFound) {

        File rootFile = new File(rootFilePath);
        File[] subFiles = rootFile.listFiles();
        for (File file : subFiles != null ? subFiles : new File[]{}) {
            if (file.getAbsolutePath().endsWith(fileToBeFound)) {
                return file;
            } else if (file.isDirectory()) {
                File f = findFile(file.getAbsolutePath(), fileToBeFound);
                if (f != null) {
                    return f;
                }
            }
        }

        return null; // null returned in case your file is not found

    }

    /**
     * Metoda validateentryfourband ověřuje, zda byl zadán barevný kód 4 pásmového rezistoru
     */
    public boolean validateentryfourband() {
        if ((FourBandDecoder.getInstance().getColours(0) == Colours.NONE) || (FourBandDecoder.getInstance().getColours(1) == Colours.NONE) || (FourBandDecoder.getInstance().getColours(2) == Colours.NONE) || (FourBandDecoder.getInstance().getColours(3) == Colours.NONE)) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("CHYBA!!");
            alert.setHeaderText(null);
            alert.setContentText("Zadej všechny barvy!");
            alert.showAndWait();
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metoda validateentryfiveband ověřuje, zda byl zadán barevný kód 5 pásmového rezistoru
     */
    public boolean validateentryfiveband() {
        if ((FiveBandDecoder.getInstance().getColours(0) == Colours.NONE) || (FiveBandDecoder.getInstance().getColours(1) == Colours.NONE) || (FiveBandDecoder.getInstance().getColours(2) == Colours.NONE) || (FiveBandDecoder.getInstance().getColours(3) == Colours.NONE) || (FiveBandDecoder.getInstance().getColours(4) == Colours.NONE)) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("CHYBA!");
            alert.setHeaderText(null);
            alert.setContentText("Zadej všechny barvy!");
            alert.showAndWait();
            return true;

        } else {
            return false;
        }
    }

    /**
     * Metoda validateentryvalue ověřuje, zda je hodnota odporu, která má být normalizována,
     * zadaná uživatelem správná (testuje, zda se skutečně jedná o číslo a zda je mezi 1 a 1000)
     * nefunkční
     */

    public double getRawvalue() {
        return this.rawvalue;
    }


    public double getFinalvalue() {
        return this.finalvalue;
    }

    public int getSerie() {
        return serie;
    }

    public void setFinalvalue(double finalvalue) {
        this.finalvalue = finalvalue;
    }

    public void setRawvalue(double rawvalue) {
        this.rawvalue = rawvalue;
    }

    public Colours getColours(int i) {
        return this.colours[i];
    }

    public void setColours(Colours colours, int i) {
        this.colours[i] = colours;
    }
}
