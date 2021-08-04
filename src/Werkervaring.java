import java.util.Scanner;

public class Werkervaring {

    String newLine = System.lineSeparator();
    Scanner workScanner = new Scanner(System.in);

    public void restaurantDutch() {

        boolean exit = false;
        do {
            System.out.println("1: Uitleg");
            System.out.println("2: Terug");
            switch (workScanner.nextInt()) {
                case 1:
                    System.out.println("-----------------------------------------------------------"
                            + newLine
                            + "Hier heb ik gekookt onder leiding van Chef Gijs Verbeek."
                            + newLine
                            + "In dit fine dining restaurant ben ik begonnen als entremetier."
                            + newLine
                            + "Naar verloop van tijd ben ik overgeschakeld naar garde mangier."
                            + newLine
                            + "-----------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("-----------------------------------------------------------"
                            + newLine
                            + "Going back"
                            + newLine
                            + "-----------------------------------------------------------");
                    exit = true;
                    break;
            }
        } while (!exit);
    }

    public void comoCo() {

        boolean exit = false;
        do {
            System.out.println("1: Uitleg");
            System.out.println("2: Terug");
            switch (workScanner.nextInt()) {
                case 1:
                    System.out.println("-----------------------------------------------------------"
                            + newLine
                            + "Hier heb ik gekookt onder leiding van Chef Joost Kaptein."
                            + newLine
                            + "Como & co is een drukke zaak op een mooie locatie aan het Oosterduinse meer."
                            + newLine
                            + "Het is een officiële trouwlocatie en er worden ook veel feesten gegeven."
                            + newLine
                            + "In de keuken van Como & co moet je stevig in de schoenen staan."
                            + newLine
                            + "Hier maakte ik zeer lange dagen zonder dat er pauze tussen zat, simpelweg omdat daar geen tijd voor was."
                            + newLine
                            + "-----------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("-----------------------------------------------------------"
                            + newLine
                            + "Going back"
                            + newLine
                            + "-----------------------------------------------------------");
                    exit = true;
                    break;
            }
        } while (!exit);
    }

    public void boardAt() {

        boolean exit = false;
        do {
            System.out.println("1: Uitleg");
            System.out.println("2: Terug");
            switch (workScanner.nextInt()) {
                case 1:
                    System.out.println("-----------------------------------------------------------"
                            + newLine
                            + "Ik heb meerdere jaren van mijn leven doorgebracht in het Wunder Schöne Oostenrijk."
                            + newLine
                            + "Hier ben ik begonnen als snowboard instructeur maar na een aantal jaar ben ik meer richting de snowboardshop gegaan."
                            + newLine
                            + "In de shop deed ik veel aan repareren, onderhoud en verhuur. Vooral het repareren vond ik leuk om te doen omdat ik er erg goed in was."
                            + newLine
                            + "Na een jaar in de Saalbach shop ben ik filiaal manager geworden in Hinterglemm, hier had ik mijn eigen groep instructeurs en de shop runde ik in m'n eentje."
                            + newLine
                            + "-----------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("-----------------------------------------------------------"
                            + newLine
                            + "Going back"
                            + newLine
                            + "-----------------------------------------------------------");
                    exit = true;
                    break;
            }
        } while (!exit);
    }

    public void jubHolland() {

        boolean exit = false;
        do {
            System.out.println("1: Uitleg");
            System.out.println("2: Terug");
            switch (workScanner.nextInt()) {
                case 1:
                    System.out.println("-----------------------------------------------------------"
                            + newLine
                            + "Jub Holland is een van de grotere bloem/bloembollen bedrijven van Nederland."
                            + newLine
                            + "Hier was ik in het voorjaar en in de zomer aan het werk en hier deed ik van alles."
                            + newLine
                            + "Heftruck chauffeur, viruscontrole, leidinggevende machine operator, ontvangst en opslag goederen enzovoort."
                            + newLine
                            + "-----------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("-----------------------------------------------------------"
                            + newLine
                            + "Going back"
                            + newLine
                            + "-----------------------------------------------------------");
                    exit = true;
                    break;
            }
        } while (!exit);
    }
}
