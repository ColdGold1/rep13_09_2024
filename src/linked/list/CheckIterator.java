package linked.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class CheckIterator {

    public static void main(String[] args) {

        LinkedList<String> listOfTowns = new LinkedList<>();
//        var newListOfTowns = new LinkedList<String>();

        listOfTowns.add("Homel");
        listOfTowns.add("Grodno");
        listOfTowns.add("Mogilev");
        listOfTowns.add("Minsk");

        runTour(listOfTowns);
    }

    private static void runTour(LinkedList<String> listOfTowns){

        String previousTown = listOfTowns.getFirst();
        System.out.println("Started from " + previousTown);

        ListIterator<String> listIteratorForTowns = listOfTowns.listIterator(1);
        while (listIteratorForTowns.hasNext()){

            var currentTown = listIteratorForTowns.next();
            System.out.println("From " + previousTown + " to " + currentTown);
            previousTown = currentTown;
        }

        System.out.println("Ended at " + listOfTowns.peekLast());
    }

    private static void testIterator(LinkedList<String> listOfTowns){
        var iterator = listOfTowns.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(listOfTowns);
    }
}
