import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BracketBalancerTest {

    @Test
    public void testIsBalanced_TrueCases() {
        assertTrue(BracketBalancer.isBalanced("{{(){}}}"));
        assertTrue(BracketBalancer.isBalanced("({})"));
        assertTrue(BracketBalancer.isBalanced("[](){}"));
    }

    @Test
    public void testIsBalanced_FalseCases() {
        assertFalse(BracketBalancer.isBalanced("}{}{"));
        assertFalse(BracketBalancer.isBalanced("{{({}"));
        assertFalse(BracketBalancer.isBalanced("[["));
        assertFalse(BracketBalancer.isBalanced("(("));
    }

    @Test
    public void testIsBalanced_EmptyString() {
        assertTrue(BracketBalancer.isBalanced(""));
    }

    // You can add more tests as necessary!
}
