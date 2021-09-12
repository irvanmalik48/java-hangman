package src.com.irvanma;

import java.io.IOException;

import src.com.irvanma.input.Input;
import src.com.irvanma.levels.Levels;

public class Game {
    public static void launch() throws IOException {
        main(null);
    }

    public static void main(String[] args) throws IOException {
        Input input = new Input();
        Levels levels = new Levels();
        Variables var = new Variables();

        levels.displayLevel();
        var.lvl = input.nextByte();

        levels.setLevel(var.lvl);
        var.choice = input.randInt(0, levels.getLength() - 1);
        var.word = levels.getLevelString(var.choice);
        var.guess = new char[var.word.length()];

        for (int i = 0; i < var.guess.length; i++)
            var.guess[i] = '_';
        
        System.out.print("\nKata yang harus kamu tebak: ");
        for (int i = 0; i < var.guess.length; i++)
            System.out.printf("%c ", var.guess[i]);

        while (var.toggle && var.nyawa != 0) {
            System.out.printf("\nSisa nyawa: %d\n", var.nyawa);
            System.out.print("Inputkan huruf: ");

            var.character = input.nextChar();
            for (int j = 0; j < var.sudah.size(); j++) {
                if (var.character == var.sudah.get(j))
                    var.check = false;
            }

            if (!var.check)
                System.out.println("\nHuruf sudah digunakan!");

            for (int i = 0; i < var.guess.length; i++) {
                if (var.character == var.word.toLowerCase().charAt(i) && var.check) {
                    var.count++;
                    var.right = true;
                    var.guess[i] = var.character;
                    var.sudah.add(var.character);   
                }
            }

            var.check = true;

            if (var.right) {
                System.out.printf("\nTebakan huruf benar, huruf yang ditebak: %c\n", var.character);
                for (int i = 0; i < var.guess.length; i++) {
                    System.out.printf("%c ", var.guess[i]);
                }
            } else {
                var.nyawa--;
                var.salah.add(var.character);
                System.out.print("\nTebakan huruf salah, berikut huruf-huruf yang salah: ");
                for (int i = 0; i < var.salah.size(); i++) {
                    if (i > 0) {
                        if (var.salah.get(i) == var.salah.get(i - 1)) {
                            // do absolutely nothing
                        } else {
                            System.out.printf("%c ", var.salah.get(i));
                        }
                    } else {
                        System.out.printf("%c ", var.salah.get(i));
                    }
                }
            }

            if (var.count == var.guess.length)
                var.toggle = false;
            var.right = false;
        }

        if (var.count == var.guess.length) {
            System.out.println("\n\nSelamat! Anda telah menebak seluruh huruf dengan benar!");
            System.out.println("Kata yang berhasil ditebak adalah: " + var.word);
            System.out.println("Sisa nyawa: " + var.nyawa);
        } else {
            System.out.println("\n\nYak, percobaan habis, game selesai, anda kalah!");
            System.out.println("Kata yang harus ditebak adalah: " + var.word);
        }

        System.out.println("\nIngin bermain lagi? (y/n)");
            var.playAgain = input.nextChar();
        
        if (var.playAgain == 'y' || var.playAgain == 'Y')
            launch();
        else {
            System.out.println("Dada!");
            System.exit(0);
        }
    }
}
