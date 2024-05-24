package com.project1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
            System.out.print("Escribe tu peso (kg) ");
            Scanner scanner = new Scanner(System.in);
            float numberWeight = scanner.nextFloat();

            System.out.print("Escribe tu tamaño en metros (m) ");
            float numberHeight = scanner.nextFloat();
            if (numberHeight > 3){
                numberHeight /= 100; 
            }
            if (numberHeight < 3) {
                byte number = 2;
                float sumNumberHeightX2 = numberHeight * number;
                float sumWightHeight =  numberWeight / sumNumberHeightX2;
                DecimalFormat decimalShort = new DecimalFormat("#.##");
                double resultShort = Double.valueOf(decimalShort.format(sumWightHeight));
                if(sumWightHeight <= 16) {
                    System.out.println("Usted tiene " + resultShort + ". Hasta 16 delgadez severa");
                }
                if(sumWightHeight >= 16 && sumWightHeight < 17) {
                    System.out.println("Usted tiene " + resultShort + ". Desde 16 hasta 17 " + "delgadez moderada");
                }
                if(sumWightHeight >= 17 && sumWightHeight < 18.5) {
                    System.out.println("Usted tiene " + resultShort + ". Desde 17 hasta 18 " + "delgadez leve");
                }
                if(sumWightHeight >= 18.5 && sumWightHeight < 25) {
                    System.out.println("Usted tiene " + resultShort + ". Desde 18.5 hasta 25 " + "peso normal");
                }
                if(sumWightHeight >= 25 && sumWightHeight < 30) {
                    System.out.println("Usted tiene " + resultShort + ". Desde 25 hasta 30 " + "sobrepeso");
                }
                if(sumWightHeight >= 30 && sumWightHeight < 35) {
                    System.out.println("Usted tiene " + resultShort + ". Desde 30 hasta 35 " + "obesidad leve");
                }
                if(sumWightHeight >= 35 && sumWightHeight < 40) {
                    System.out.println("Usted tiene " + resultShort + ". Desde 35 hasta 40 " + "obesidad moderada");
                }
                if(sumWightHeight >= 40) {
                    System.out.println("Usted tiene " + resultShort + ". Hasta 40 " + "obesidad morbida");
                }
            } 
        }
    }
