public class TicketManager {

    private TicketRepository tickets;

    public TicketManager(TicketRepository tickets) {
        this.tickets = tickets;
    }

    public void add(Ticket ticket) {
        tickets.add(ticket);
    }

    public Ticket[] searchBy(String text) {
        Ticket[] result = new Ticket[0];
        for (Ticket ticket : tickets.findAll()) {
            if (matches(ticket, text)) {
                Ticket[] tmp = new Ticket[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = ticket;
                result = tmp;
            }
        }
        return result;
    }

    public boolean matches(Ticket ticket, String search) {

        if (ticket.getFrom().contains(search)) {
            return true;
        }
        if (ticket.getTo().contains(search)) {
            return true;
        }
        return false;
    }
}
