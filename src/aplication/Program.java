package aplication;

import boardgame.Position;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        Position pos = new Position(2, 4);
        System.out.println(pos);
    }
}
