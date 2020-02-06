package immutable;

final class HammerThrowImmutable {

    private final int meters;

    HammerThrowImmutable(final int meters) {
        this.meters = meters;
    }

    HammerThrowImmutable add(final int meters) {
        return new HammerThrowImmutable(this.meters+meters);
    }

    public String toString() {
        return ""+ meters;
    }
}