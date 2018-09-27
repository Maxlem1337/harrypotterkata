package harrypotterkata.hogwarts;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortingHatTest {

    @Test
    public void pickHouse_ReturnsValidHouse() {
        assertThat(SortingHat.pickHouseFor("Harry Potter")).isInstanceOf(House.class);
    }
}