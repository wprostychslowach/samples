package immutable;

public class App {
    public static void main(String[] args) {

        // Two athletes are starting in the Hammer Throw World Championship
        Athlete robertChampion = new Athlete("Robert");
        Athlete johnChampion = new Athlete("John");

        // Eq aequo Robert and John threw 12 meters
        HammerThrowImmutable record = new HammerThrowImmutable(12);

        // Assign record to Robert and John
        robertChampion.myNewRecord(record);
        johnChampion.myNewRecord(record);

        System.out.println(robertChampion.getName()+" threw "+robertChampion.getHammerThrowImmutable());
        System.out.println(johnChampion.getName()+" threw "+johnChampion.getHammerThrowImmutable());

        // Ou! Mistake. Camera noticed that Robert threw 13 meters. We must change his record.
        robertChampion.myNewRecord(record.add(1));

        System.out.println();

        // It's good. New record has been assigned to Robert. John is sad.
        System.out.println(robertChampion.getName()+" threw "+robertChampion.getHammerThrowImmutable());
        System.out.println(johnChampion.getName()+" threw "+johnChampion.getHammerThrowImmutable()+". It's OK!");
    }
}
