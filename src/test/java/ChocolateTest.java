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

/*
Your task is to split the chocolate bar of given dimension n x m into small squares. Each square is of size 1x1 and unbreakable.
Implement a function that will return minimum number of breaks needed.

For example if you are given a chocolate bar of size 2 x 1 you can split it to single squares in just one break, but for size 3 x 1 you must do two breaks.

If input data is invalid you should return 0 (as in no breaks are needed if we do not have any chocolate to split). Input will always be a non-negative integer.
 */