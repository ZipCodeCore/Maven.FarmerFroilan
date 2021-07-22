import org.junit.Assert;
import org.junit.Test;
import person.Farmer;

public class FarmerTest {
    @Test
    public void makeNoiseTest(){
        //Given
        Farmer farmer = new Farmer("Froilan");
        String expected = "Hi, I am a farmer!";

        //When
        String actual = farmer.makeNoise();

        //Then
        Assert.assertEquals(expected, actual);
    }

}
