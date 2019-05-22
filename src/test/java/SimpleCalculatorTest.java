import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SimpleCalculatorTest {

    SimpleCalculator simpleCalculator = new SimpleCalculator();

    @Test
    public void checkAdditionMethodWorks(){
        assertThat(simpleCalculator.addition(1,2)).isEqualTo(3);
    }

    @Test
    public void checkSubtractionMethodWorks(){
        assertThat(simpleCalculator.subtraction(4,3)).isEqualTo(1);
    }

    @Test
    public void checkMultiplicationMethodWorks(){
        assertThat(simpleCalculator.multiplication(3, 4)).isEqualTo(12);
    }

    @Test
    public void checkDivisionMethodWorks(){
        assertThat(simpleCalculator.division(10,5)).isEqualTo(2);
    }

    @Test
    public void checkOneNegativeAdditionMethodWorks(){
        assertThat(simpleCalculator.addition(1,-2)).isEqualTo(-1);
    }

    @Test
    public void checkOneNegativeSubtractionMethodWorks(){
        assertThat(simpleCalculator.subtraction(4,-3)).isEqualTo(7);
    }

    @Test
    public void checkOneNegativeMultiplicationMethodWorks(){
        assertThat(simpleCalculator.multiplication(3, -4)).isEqualTo(-12);
    }

    @Test
    public void checkOneNegativeDivisionMethodWorks(){
        assertThat(simpleCalculator.division(-10,5)).isEqualTo(-2);
    }

    @Test
    public void checkNegativeAdditionMethodWorks(){
        assertThat(simpleCalculator.addition(-1,-2)).isEqualTo(-3);
    }

    @Test
    public void checkNegativeSubtractionMethodWorks(){
        assertThat(simpleCalculator.subtraction(-4,-3)).isEqualTo(-1);
    }

    @Test
    public void checkNegativeMultiplicationMethodWorks(){
        assertThat(simpleCalculator.multiplication(-3, -4)).isEqualTo(12);
    }

    @Test
    public void checkNegativeDivisionMethodWorks(){
        assertThat(simpleCalculator.division(10,5)).isEqualTo(2);
    }
    @Test
    public void checkDecimalAdditionMethodWorks(){
        assertThat(simpleCalculator.addition(1.2,2.3)).isEqualTo(3.5);
    }

    @Test
    public void checkDecimalSubtractionMethodWorks(){
        assertThat(simpleCalculator.subtraction(4,3.5)).isEqualTo(0.5);
    }

    @Test
    public void checkDecimalMultiplicationMethodWorks(){
        assertThat(simpleCalculator.multiplication(3.2, 4.2)).isEqualTo(13.44);
    }

//    @Test
//    public void checkDecimalDivisionMethodWorks(){
//        assertThat(simpleCalculator.division(10.5,5.5)).isEqualTo(1.91);
//    }

    @Test
    public void checkStoreNumberInMemoryMethodWorks(){
        assertThat(simpleCalculator.addNumberInMemory(3)).isEqualTo(3);
        assertThat(simpleCalculator.addNumberInMemory(3)).isEqualTo(6);
    }

    @Test
    public void additionAndStoringNumber(){
        assertThat(simpleCalculator.addNumberInMemory(simpleCalculator.addition(1,1))).isEqualTo(2);
    }

    @Test
    public void subtractionAndStoringNumber(){
        assertThat(simpleCalculator.addNumberInMemory(simpleCalculator.subtraction(2,1))).isEqualTo(1);
    }

    @Test
    public void multiplicationAndStoringNumber(){
        assertThat(simpleCalculator.addNumberInMemory(simpleCalculator.multiplication(2,2))).isEqualTo(4);
    }

    @Test
    public void divisionAndStoringNumber(){
        assertThat(simpleCalculator.addNumberInMemory(simpleCalculator.division(4,2))).isEqualTo(2);
    }
}