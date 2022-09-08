import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TicketManagerTest {
    TicketRepository tickets = new TicketRepository();
    TicketManager manager = new TicketManager(tickets);

    public Ticket ticket1 = new Ticket(1, 1000, "mos", "dav", 100);
    public Ticket ticket2 = new Ticket(2, 2000, "ccc", "moc", 120);
    public Ticket ticket3 = new Ticket(3, 500, "mos", "dav", 90);
    public Ticket ticket4 = new Ticket(4, 2500, "dav", "ber", 75);


    @BeforeEach
    public void setUp() {
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
    }

    @Test
    public void searchAirport() {
        Ticket[] expected = {ticket4};
        Ticket[] actual = manager.searchBy("dav","ber");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchTwoAirport() {
        Ticket[] expected = {ticket3, ticket1};
        Ticket[] actual = manager.searchBy("mos","dav");

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void searchZeroAirport() {
        Ticket[] expected = {};
        Ticket[] actual = manager.searchBy("mor","dav");

        Assertions.assertArrayEquals(expected, actual);
    }

}
