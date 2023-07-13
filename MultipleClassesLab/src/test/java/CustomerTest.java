import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer customer;


    @BeforeEach
    public void setUp() {
        customer = new Customer("Julian Smith");

        @Test
        public void canRemove1FromArtworkCount(){

        }

        @Test
        public void canDecreaseWalletAmount(1000.00){
            assertThat(customer.getWalletAmount()).isEqualTo(4000.00);
        }
        

    }
}
