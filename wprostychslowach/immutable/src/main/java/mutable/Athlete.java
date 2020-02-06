package mutable;

class Athlete {
    private String name;
    private HammerThrowMutable hammerThrowMutable;

    public Athlete(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    HammerThrowMutable getHammerThrowMutable() {
        return hammerThrowMutable;
    }

    void myNewRecord(HammerThrowMutable hammerThrowMutable) {
        this.hammerThrowMutable = hammerThrowMutable;
    }
}
