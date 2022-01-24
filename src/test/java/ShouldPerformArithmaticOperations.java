import org.testng.Assert;
import org.testng.annotations.Test;

public class ShouldPerformArithmaticOperations {

    @Test
    public void ShouldAddTwoNumbers() {
        int a = 10;
        int b = 20;
        int c = a + b;
        Assert.assertEquals(a + b, c);
    }

    @Test
    public void ShouldMinusTwoNumbers() {
        int a = 20;
        int b = 10;
        int c = a - b;
        Assert.assertEquals(a - b, c);

    }

    @Test
    public void Sh0uldMultiplyTwoNumbers() {
        int a = 20;
        int b = 10;
        int c = a * b;
        Assert.assertEquals(a * b, c);

    }

    @Test
    public void Sh0uldDivideTwoNumbers() {
        int a = 20;
        int b = 10;
        int c = a/b;
        Assert.assertEquals(a / b, c);

    }
}
