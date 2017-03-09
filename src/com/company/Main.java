package com.company;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] ar;
        ar = CreateAr();
        ShowAr(ar);
        Reverse(ar);
        System.out.println();
        ShowAr(ar);



    }


    public static int[] CreateAr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int n = scanner.nextInt();
        int[] Array1 = new int[n];
        for (int i =0; i<Array1.length; i++){
            Array1[i] = (int)(Math.random()*10);
        }
        return Array1;
    }
    public static void ShowAr(int[] array){
        for (int i:array) {
             System.out.print(i +" ");
        }
    }
    public static void Reverse(int[] array){
        for (int i=0; i<array.length/2; i++)
        {
            int a = array[i];
            array[i]=array[(array.length-1)-i];
            array[(array.length-1)-i] = a;
        }
    }
}


