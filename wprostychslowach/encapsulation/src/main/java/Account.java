import java.time.LocalDateTime;

final class Account {
    private State state;
    private LocalDateTime deactivationDate;

    public void deactivate() {
        if(state == State.Inactive) {
            throw new RuntimeException("Cannot deactivate inactive account");
        }
        state = State.Inactive;
        deactivationDate = LocalDateTime.now();
    }
}

