import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TicketRepositoryTest {

    public TicketRepository tickets = new TicketRepository();

    public Ticket ticket1 = new Ticket(3, 1000, "MOS", "TT", 100);
    public Ticket ticket2 = new Ticket(3, 2000, "MOS", "TT", 100);

    @BeforeEach
    public void setUp() {
        tickets.add(ticket1);
        tickets.add(ticket2);
    }


}
