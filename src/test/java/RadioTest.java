import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test

    public void shouldSetPrevVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.prevVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetPrevStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prevStation();


        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldSetNextStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.nextStation();


        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldSetNextVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.increaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetAnyStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.chooseStation();

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void SetNextStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);
        radio.nextStation();


        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void SetNextVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(6);
        radio.increaseVolume();

        int expected = 7;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void SetPrevVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(6);
        radio.prevVolume();

        int expected = 5;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void SetPrevStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(3);
        radio.prevStation();


        int expected = 2;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldSetPrevVolumeLimit() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.prevVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetPrevStationLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.prevStation();


        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetNextStationLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(11);
        radio.nextStation();


        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldSetNextVolumeLimit() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);
        radio.increaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetNextStation2() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);
        radio.nextStation();


        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void SetNextVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        radio.increaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void SetStationNew() {
        Radio radio = new Radio(9);

        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

}