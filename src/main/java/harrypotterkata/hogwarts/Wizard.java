package harrypotterkata.hogwarts;

public class Wizard {
    private String name;
    private House house;

    private Wizard(String name, House house) {
        this.name = name;
        this.house = house;
    }

    public static Wizard createWizardlyWizard(String name) {
        return new Wizard(name, SortingHat.pickHouseFor(name));
    }

    public String getName() {
        return name;
    }

    public House getHouse() {
        return house;
    }
}
