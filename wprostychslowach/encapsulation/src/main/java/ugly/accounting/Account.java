package ugly.accounting;

import java.time.LocalDateTime;

/* No encapsulation */
final class Account {
    private State state;
    private LocalDateTime deactivationDate;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public LocalDateTime getDeactivationDate() {
        return deactivationDate;
    }

    public void setDeactivationDate(LocalDateTime deactivationDate) {
        this.deactivationDate = deactivationDate;
    }
}

