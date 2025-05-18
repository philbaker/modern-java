record Location(double latitude, double longitude) {}

Location findTreasureIsland() {
    return new Location(40.2085, -3.713);
}

void main() {
    Location treasureIsland = findTreasureIsland();
    System.out.println(
        "Treasure island is located at " +
        treasureIsland.latitude() +
        " " +
        treasureIsland.longitude() +
        "."
    );
    // Treasure island is located at 40.2085 -3.713.
}
