package mutable;

class HammerThrowMutable {

    private int meters;

    HammerThrowMutable(int meters) {
        this.meters = meters;
    }

    HammerThrowMutable add(int meters) {
        this.meters += meters;
        return this;
    }

    public String toString() {
        return ""+ meters;
    }
}