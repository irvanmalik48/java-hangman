package src.com.irvanma.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ThreadLocalRandom;

public class Input {
    private BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public String next() throws IOException {
        return this.input.readLine();
    }

    public char nextChar() throws IOException {
        return this.input.readLine().charAt(0);
    }

    public byte nextByte() throws IOException {
        return Byte.parseByte(this.input.readLine());
    }

    public int randInt(int start, int end) {
        return ThreadLocalRandom.current().nextInt(start, end);
    }

    public void close() throws IOException {
        this.input.close();
    }
}
