package src.com.irvanma;

import java.util.ArrayList;

public class Variables {
    protected ArrayList<Character> salah = new ArrayList<Character>();
    protected ArrayList<Character> sudah = new ArrayList<Character>();
    protected String word;
    protected char character, guess[], playAgain;
    protected int count, choice, nyawa;
    protected byte lvl;
    protected boolean toggle, right, check;

    public Variables() {
        this.count = 0;
        this.nyawa = 7;
        this.toggle = true;
        this.right = false;
        this.check = true;
    }
}
