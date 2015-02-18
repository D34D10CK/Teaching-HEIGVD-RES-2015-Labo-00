package ch.heigvd.res.lab00;

/**
 *
 * @author léonard
 */
public class Trumpet implements IInstrument {

    @Override
    public String play() {
        return "pouet";
    }

    @Override
    public int getSoundVolume() {
        return 1;
    }

    @Override
    public String getColor() {
        return "golden";
    }
}
