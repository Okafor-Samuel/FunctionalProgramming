import SERVICES.FIFO;
import SERVICES.SalesByPriorityQueue;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("FIFO IMPLEMENTATION");
        FIFO fifo = new FIFO();
        fifo.sales();
        System.out.println();
        System.out.println("PRIORITY QUEUE IMPLEMENTATION");
        SalesByPriorityQueue salesByPriorityQueue = new SalesByPriorityQueue();
        salesByPriorityQueue.sales();

    }
}