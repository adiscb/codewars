import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChocolateTest {

    private static final int LENGTH = 5;
    private static final int WIDTH = 5;

    @Test
    public void should_return_needed_breaks_to_split_chocolate_given_dimensions() {
        int squares = Chocolate.breakChocolate(LENGTH, WIDTH);

        assertEquals(24, squares);
    }

    @Test
    public void should_return_0_when_input_data_is_invalid() {
        int squares = Chocolate.breakChocolate(-3, WIDTH);

        assertEquals(0, squares);
    }

}
