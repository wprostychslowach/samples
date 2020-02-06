package immutable;

class Athlete {
    private String name;
    private HammerThrowImmutable hammerThrowImmutable;

    public Athlete(String name) {
        this.name = name;

    }

    String getName() {
        return name;
    }

    HammerThrowImmutable getHammerThrowImmutable() {
        return hammerThrowImmutable;
    }

    void myNewRecord(HammerThrowImmutable hammerThrowImmutable) {
        this.hammerThrowImmutable = hammerThrowImmutable;
    }
}
