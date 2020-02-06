package mutable;

public class App {
    public static void main(String[] args) {
        // Two athletes are starting in the Hammer Throw World Championship
        Athlete robertChampion = new Athlete("Robert");
        Athlete johnChampion = new Athlete("John");

        // Eq aequo Robert and John threw 12 meters
        HammerThrowMutable record = new HammerThrowMutable(12);

        // Assign record to Robert and John
        robertChampion.myNewRecord(record);
        johnChampion.myNewRecord(record);

        System.out.println(robertChampion.getName()+" threw "+robertChampion.getHammerThrowMutable());
        System.out.println(johnChampion.getName()+" threw "+johnChampion.getHammerThrowMutable());

        // Ou! Mistake. Camera noticed that Robert threw 13 meters. We must change his record.
        robertChampion.myNewRecord(record.add(1));

        System.out.println();

        // Ouuuuu. Our HammerThrowMutable record is not immutable and the record has been changed for John as well :<
        System.out.println(robertChampion.getName()+" threw "+robertChampion.getHammerThrowMutable());
        System.out.println(johnChampion.getName()+" threw "+johnChampion.getHammerThrowMutable()+" [!!!]");
    }
}
