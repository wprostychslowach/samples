package immutable;

/* Our class cannot be extended, so our method can't be overriden */
final class HammerThrowImmutable {

    /* It's final int varaible - we can't change it after object is created */
    private final int meters;

    /* Init meters variable once. Our object can be in one state. If you pass to constructor mutable object, remember to clone it */
    HammerThrowImmutable(final int meters) {
        this.meters = meters;
    }


    /* We create new object to be immutable */
    HammerThrowImmutable add(final int meters) {
        return new HammerThrowImmutable(this.meters+meters);
    }

    public String toString() {
        return ""+ meters;
    }
}