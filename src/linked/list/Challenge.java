package linked.list;

import java.util.LinkedList;

record Place(String name, int distance) {

    @Override
    public String toString() {

        return String.format("%s(%d)", name, distance);
    }
}


public class Challenge {

    //From city to Minsk
    public static void main(String[] args) {

        LinkedList<Place> places = new LinkedList<>();
        addPlace(places, new Place("Homel", 304));
        addPlace(places, new Place("Grodno", 271));
        addPlace(places, new Place("Mogilev", 201));
        addPlace(places, new Place("Brest", 351));
        addPlace(places, new Place("Minsk", 0));

        movingForward(places);
        System.out.println("-".repeat(20));
        movingBackward(places);
    }

    private static void movingForward(LinkedList<Place> places) {
        var listIterator = places.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }

    private static void movingBackward(LinkedList<Place> places) {
        var listIterator = places.listIterator(places.size());
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }

    private static void addPlace(LinkedList<Place> places, Place place) {
        if (places.contains(place)) {
            System.out.println("Duplicate of " + place);
            return;
        }

        for (Place p : places) {
            if (place.name().equalsIgnoreCase(p.name())) {
                System.out.println("Duplicate of " + place);
                return;
            }
        }

        int insertedIndex = 0;
        for (Place p : places){
            if (place.distance() < p.distance()){
                places.add(insertedIndex,place);
                return;
            }
            insertedIndex++;
        }

        places.add(place);
    }
}
