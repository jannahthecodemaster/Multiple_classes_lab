import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    Artwork artwork;

    @BeforeEach
    public void setUp(){
        artwork = new Artwork("The Starry Night", "Vincent van Gogh", 1000.00);
    }

    @Test
    public void canGetTitle(){
            assertThat(artwork.getTitle()).isEqualTo("The Starry Night");
    }

    @Test
    public void canGetArtistName(){
        assertThat(artwork.getArtistName()).isEqualTo("Vincent van Gogh");
    }

    @Test
    public void canGetPrice(){
        assertThat(artwork.getPrice()).isEqualTo(1000.00);
    }

    @Test
    public void canSetPrice(){
        artwork.setPrice(1250.00);
        assertThat(artwork.getPrice()).isEqualTo(1250.00);
    }
    

}
