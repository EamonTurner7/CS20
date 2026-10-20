package SkillBuilders;

public class SpanishNumbers {
	public static void displaySpanish(int number) {

        if (number == 1) {
            System.out.println("uno");
        }
        else if (number == 2) {
            System.out.println("dos");
        }
        else if (number == 3) {
            System.out.println("tres");
        }
        else if (number == 4) {
            System.out.println("cuatro");
        }
        else if (number == 5) {
            System.out.println("cinco");
        }
        else if (number == 6) {
            System.out.println("seis");
        }
        else if (number == 7) {
            System.out.println("siete");
        }
        else if (number == 8) {
            System.out.println("ocho");
        }
        else if (number == 9) {
            System.out.println("nueve");
        }
        else if (number == 10) {
            System.out.println("diez");
        }
    }
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
            displaySpanish(i);

	}

}
}
