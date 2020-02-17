package with.dependency.inversion.reporting;

import java.util.Date;

public class MyPeriod {
    private final Date from;
    private final Date to;

    public MyPeriod(Date from, Date to) {
        this.from = from;
        this.to = to;
    }

    public Date getFrom() {
        return from;
    }

    public Date getTo() {
        return to;
    }
}
