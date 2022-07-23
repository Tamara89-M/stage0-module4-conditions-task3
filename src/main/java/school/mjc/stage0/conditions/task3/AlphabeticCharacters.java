package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
            if (character == 97) {
                System.out.println("Vowel");
            } else if (character == 101) {
                System.out.println("Vowel");
            } else if (character == 105) {
                System.out.println("Vowel");
            } else if (character == 111) {
                System.out.println("Vowel");
            } else if (character == 117) {
                System.out.println("Vowel");
            } else if (character == 121) {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
