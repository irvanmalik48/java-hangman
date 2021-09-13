package src.com.irvanma.graphic;

public class Graphic {
    public static void hangTheMan(int i) {
        if (i == 6) {
            for (int j = 0; j < 4; j++)
                System.out.println();
            System.out.println("___|___");
        } else if (i == 5) {
            for (int j = 0; j < 7; j++)
                System.out.println("   |");
            System.out.println("___|___");
        } else if (i == 4) {
            System.out.println("   ____________");
            for (int j = 0; j < 7; j++)
                System.out.println("   |");
            System.out.println("___|___");
        } else if (i == 3) {
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
            for (int j = 0; j < 3; j++)
                System.out.println("   |");
			System.out.println("___|___");
        } else if (i == 2) {
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |");
			System.out.println("___|___");
        } else if (i == 1) {
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
        } else if (i == 0) {
            System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |          _|_");
			System.out.println("   |         / | \\");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
        }
    }
}
