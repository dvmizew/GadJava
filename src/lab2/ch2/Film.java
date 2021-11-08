package lab2.ch2;

public class Film {
    private int anAparitie;
    private String nume;
    private Actor[] actori;

    public Film(int anAparitie, String nume, Actor[] actor) {
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actori = actor;
    }

    public int getAnAparitie() {
        return anAparitie;
    }

    public String getNume() {
        return nume;
    }

    public Actor[] getActor() {
        return actori;
    }
}
