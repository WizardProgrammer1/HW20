public class Main {
    public static void main(String[] args) {
        Musician musician = new Musician();
        Flute flute = new Flute();
        Guitar guitar = new Guitar();
        Piano piano = new Piano();

        musician.perform(flute);
        musician.perform(guitar);
        musician.perform(piano);
    }
}