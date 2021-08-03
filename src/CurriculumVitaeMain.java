import java.util.Scanner;

public class CurriculumVitaeMain {
    public static void main(String[] args) {



        boolean exit = false;

        MichaelWilson ditBenIk = new MichaelWilson();
        Werkervaring michaelWerk = new Werkervaring();
        Skills michaelSkills = new Skills();

        String newLine = System.lineSeparator();
        Scanner cvScanner = new Scanner(System.in);
        do {
            System.out.println("-----------------------------------------------------------"    + newLine
                    + "Dit is het Curriculum Vitae van Michael Wilson!"                         + newLine
                    + "Kies een optie:"                                                         + newLine
                    + "1: Wie ben ik?"                                                          + newLine
                    + "2: Wat is mijn werkervaring?"                                            + newLine
                    + "3: Welke skills en diploma's heb ik?"                                    + newLine
                    + "4: Exit?"                                                     + newLine
                    + "-----------------------------------------------------------");
            switch (cvScanner.nextInt()) {
                case 1:
                    boolean goBack1 = false;
                    do {
                        System.out.println("-----------------------------------------------------------"    + newLine
                                + "Michael Wilson"                                                          + newLine
                                + "Persona extraordinaria!"                                                 + newLine
                                + "1: Waarom wil ik de ICT in?"                                             + newLine
                                + "2: Waarom dit cv?"                                                       + newLine
                                + "3: Persoonsgegevens"                                                     + newLine
                                + "4: Hobbies en interesses"                                                + newLine
                                + "5: Exit"                                                                 + newLine
                                + "-----------------------------------------------------------");
                        switch (cvScanner.nextInt()){
                            case 1:
                                ditBenIk.whyThisLineOfWork();
                                break;
                            case 2:
                                ditBenIk.whyThisCV();
                                break;
                            case 3:
                                ditBenIk.gegevens();
                                break;
                            case 4:
                                ditBenIk.hobbies();
                                break;
                            case 5:
                               goBack1 = true;
                                System.out.println("Terug naar hoofdmenu");
                                break;
                        }
                    } while(!goBack1);
                    break;

                case 2:
                    boolean goBack2 = false;
                    do {
                        System.out.println("-----------------------------------------------------------"    + newLine
                                + "Kies werkgever:"                                                         + newLine
                                + "1: Restaurant Dutch!"                                                    + newLine
                                + "2: Como & co"                                                            + newLine
                                + "3: Board.at"                                                             + newLine
                                + "4: Jub Holland"                                                          + newLine
                                + "5: Exit");
                        switch (cvScanner.nextInt()) {
                            case 1:
                                System.out.println("-----------------------------------------------------------"    + newLine
                                        + "Restaurant Dutch!"                                                       + newLine
                                        + "-----------------------------------------------------------");
                                michaelWerk.restaurantDutch();
                                break;
                            case 2:
                                System.out.println("-----------------------------------------------------------"    + newLine
                                        + "Como & co"                                                               + newLine
                                        + "-----------------------------------------------------------");
                                michaelWerk.comoCo();
                                break;
                            case 3:
                                System.out.println("-----------------------------------------------------------"    + newLine
                                        + "Board.at"                                                                + newLine
                                        + "-----------------------------------------------------------");
                                michaelWerk.boardAt();
                                break;
                            case 4:
                                System.out.println("-----------------------------------------------------------"    + newLine
                                        + "Jub Holland"                                                             + newLine
                                        + "-----------------------------------------------------------");
                                michaelWerk.jubHolland();
                                break;
                            case 5:
                                System.out.println("Terug naar hoofdmenu");
                                goBack2 = true; }
                    } while (!goBack2);
                    break;
                case 3:
                    boolean goBack3 = false;
                    do {
                        System.out.println("-----------------------------------------------------------"     + newLine
                                + "1: Programming skills"                                                    + newLine
                                + "2: Kitchen skills"                                                        + newLine
                                + "3: Snowboarding skills"                                                   + newLine
                                + "4: Talen "                                                                + newLine
                                + "5: Exit");
                        switch (cvScanner.nextInt()) {
                            case 1:
                                michaelSkills.programmingSkills();
                                break;
                            case 2:
                                michaelSkills.kitchenSkills();
                                break;
                            case 3:
                                michaelSkills.snowboardSkills();
                                break;
                            case 4:
                                michaelSkills.languageSkills();
                                break;
                            case 5:
                                goBack3 = true;
                                break;
                        }
                    } while (!goBack3);
                    break;
                case 4:
                    System.out.println("Bedankt dat je tijd hebt gemaakt voor mijn CV, vergeet niet mijn Github te checken voor andere projecten!");
                    exit = true;
                    break;
            }
        } while (!exit);
    }
}