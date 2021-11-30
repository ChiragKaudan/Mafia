package Mafia.src.Mafia.Controller;

public class UpdateRoundMessage implements Message {
    int phase; //0 is day, 1 night
    int rounds;

    public UpdateRoundMessage(int phase, int roundCounter) {
        this.phase = phase;
        this.rounds=roundCounter;
    }

    public int getPhase() {
        return phase;
    }

    public int getRounds() {
        return rounds;
    }
}