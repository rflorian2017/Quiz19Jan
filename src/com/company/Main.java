package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //counter pe 4 biti fara tratare overflow
    public static void main1(String[] args) {
        int counter = 0;
        int repetition = 0;
        while (true) {
            System.out.println(counter);
            if (counter <= 15) {
                counter++;
            }
            if (counter == 16) {
                counter = 0;
                repetition++;
            }

            if (repetition == 3) {
                break;
            }


        }


        //afisare numere pare impare
        String par = "", impar = "";

        int nr = 0, contorpar = 0, contorimpar = 0;
        while ((contorpar != 15) || (contorimpar != 15)) {
            if (nr % 2 == 0) {
                par += nr + " ";
                contorpar++;
            } else {
                impar += nr + " ";
                contorimpar++;
            }
            nr++;
        }
        System.out.println("pare: " + par + "\n" + "Impare:" + impar);

        par = "";
        impar = "";
        for (int i = 0; i < 30; i++) {
            if (i % 2 == 0) {
                par += i + " ";
            } else {
                impar += i + " ";
            }
        }
        System.out.println("pare: " + par + "\n" + "Impare:" + impar);

        par = "";
        impar = "";
        for (int i = 0; i < 15; i++) {
            par += i * 2 + " ";
            impar += (i * 2 + 1) + " ";
        }
        System.out.println("pare: " + par + "\n" + "Impare:" + impar);
    }

    /*
    Initializare array si Afisare array de forma
    1 2 3 4
    8 7 6 5
    9 10 11 12
    16 15 14 13
     */
    public static void main2(String[] args) {
        int[][] array;
        array = new int[4][4];
        boolean direction = false;

        for (int line = 0; line < array.length; line++) {
            for (int column = 0; column < array[line].length; column++) {
                if (direction == false) {
                    array[line][column] = (column + 1) +
                            (line * array.length);
                } else {
                    array[line][column] = (line * array.length)
                            + array.length - column;
                }
            }
            direction = !direction;
        }

        for (int line = 0; line < array.length; line++) {
            for (int column = 0; column < array[line].length; column++) {
                //System.out.print(array[line][column] + " ");
            }
            //System.out.println();
        }

        int sizeOfMulti = 6;
        direction = false;
        ArrayList<ArrayList<Integer>> multiDimensionArray = new ArrayList<>();
        for (int line = 0; line < sizeOfMulti; line++) {
            ArrayList<Integer> arrayList = new ArrayList<>();

            for (int column = 0; column < sizeOfMulti; column++) {
                if (direction == false) {
                    arrayList.add((column + 1) +
                            (line * sizeOfMulti));
                } else {
                    arrayList.add((line * sizeOfMulti)
                            + sizeOfMulti - column);
                }
            }

            multiDimensionArray.add(arrayList);
            direction = !direction;
        }

        for (int i = 0; i < sizeOfMulti; i++) {
            for (int j = 0; j < sizeOfMulti; j++) {
                System.out.print(multiDimensionArray.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    //for imbricat
    public static void main3(String[] args) {


        for (int i = 0; i < 5; i++) {

            for (int k = 0; k < 2; k++) {

                for (int j = 0; j < 2; j++) {
                    System.out.println("third for: " + j);
                }

                System.out.println("second for");
            }

            System.out.println("first for");
        }
    }

    //tabla inmultirii
    public static void main4(String[] args) {
        /**
         * 2. scrieti un program care
         * printeaza tabla inmultirii
         * pentru un numar dat la tastatura
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Da-mi un numar:");
        int myNumber;
        myNumber = scanner.nextInt();
        for (int i = 1; i <= 9; i++) {
            String parteDinStangaEgal = myNumber + " x " + i;
            String semnEgal = " = ";
            String rezultat = String.valueOf((myNumber * i));
            System.out.println(parteDinStangaEgal +
                    semnEgal +
                    rezultat);
            ;
        }
        //System.out.println(myNumber);
    }
    public static void pasareasca(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti text:");
        String text = scanner.next();
        System.out.println(text);
        char[] vocals = new char[] {'a','e','i','o','u'};
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < vocals.length; j++) {
                if(vocals[j] == text.charAt(i)) {

                }
            }
        }
    }

    public static void decodeText(String[] args) {
        String textToCode = "Dupa munca si rasplata! Lucrand cel putin 10 ore suplimentar pe saptamana, pot stapani programarea!";
        String codedText = "";

        for(int i= 0; i< textToCode.length(); i++)
        {
            codedText += (char)(textToCode.charAt(i) + 10 - 7);
        }
        System.out.println(codedText);


        for (int k = 8; k <= 14; k = k+2) {
            for (int j= 1 ; j < 10 ; j = j+2 ) {
                textToCode = "";
                for (int i = 0; i < codedText.length(); i++) {
                    textToCode += (char) (codedText.charAt(i) - k + j);
                }
                System.out.println(textToCode + "\n");
            }
        }

    }

    public static void main(String[] args) {

    }
}
