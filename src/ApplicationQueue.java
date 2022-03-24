import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Logger;

public class ApplicationQueue {
    public static void main(String[] args) {

        Logger log = Logger.getLogger("Initializer ..");

        Queue<String> fila = new LinkedList<>();

        fila.add("Maxwell");
        fila.add("I'm from ");
        fila.add("Brazilian");
        fila.add("blz");

        log.info(String.format(" first  step :  Retrieves ordered at  queue \t %s",fila.peek()));

        fila.poll();

        log.info(String.format(" second step :  return queue without first  in \t [ %s ]",fila.remove()));
        log.info(fila.toString());
        fila.remove();



        log.info(String.format(" third  step :  method peek Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty. [ %s ]", fila.peek().toString()));
    }
}
