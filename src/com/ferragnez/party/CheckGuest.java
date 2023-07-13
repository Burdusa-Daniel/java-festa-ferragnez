package com.ferragnez.party;
import java.util.Scanner;
public class CheckGuest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] guests= {"Dua Lipa","Paris Hilton","Manuel Agnelli","J-Ax","Francesco Totti","Ilary Blasi","Bebe Vio","Luis","Pardis Zarei","Martina Maccherone","Rachel Zeilic"};
        System.out.println("inserisci il tuo nome ");
        String a = input.nextLine();
        boolean b= false;
        for (int i = 0; i< guests.length;i++){
            if(a.equalsIgnoreCase(guests[i])){
                //System.out.println("you are invited");
                b= true;
            }
        }
        if (b){
            System.out.println("you are invited");
        }else {
            System.out.println("you are not invited");
        }


    }
}
