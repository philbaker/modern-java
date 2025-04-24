class Location {
    double latitude;
    double longitude;
}

Location findTreasureIsland() {
    Location location = new Location();
    location.latitude = 40.2085;
    location.longitude = -3.713;
    return location;
}

void main() {
    // Methods can only ever return one type ofd thing. If you make a class
    // with mulitple fields you can use that to return more than one piece
    // of information

    Location treasureIsland = findTreasureIsland();
    System.out.println(
        "Treasure island is located at " +
        treasureIsland.latitude +
        " " +
        treasureIsland.longitude +
        "."
    );
    // Treasure island is located at 40.2085 -3.713.
}
