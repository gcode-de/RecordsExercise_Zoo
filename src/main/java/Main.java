public class Main {
    public static void main(String[] args) {

        Species horseSpecies = new Species("horse", 5000);
        Owner horseOwner = new Owner("Michael", 46, "unknown");
        Animal horse = new Animal("1", "Paul",horseSpecies,12, horseOwner);

        Species catSpecies = new Species("cat", 100);
        Owner catOwner = new Owner("Anna", 23, "unknown");
        Animal cat1 = new Animal("2", "Louis",catSpecies,2, catOwner);
        Animal cat2 = new Animal("3", "Ludmilla",catSpecies,2, catOwner);

        System.out.println(horse);
        System.out.println(horse == horse);
        System.out.println(cat1);
        System.out.println(cat2);

    }
}

