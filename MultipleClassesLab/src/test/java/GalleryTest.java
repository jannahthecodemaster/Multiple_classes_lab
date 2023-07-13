import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {
    Gallery gallery;
    Artwork artwork;

    @BeforeEach
    public void setUp() {
        gallery = new Gallery("Tate Modern", 0.00);
        artwork = new Artwork("The Starry Night", "Vincent Van Gogh", 1000.00);
        gallery.addArtwork(artwork);

    }

    @Test
    public void canGetName(){
        assertThat(gallery.getName()).isEqualTo("Tate Modern");
    }

    @Test
    public void canAddArtworkToGallery(){
        Artwork artwork2 = new Artwork("The Last Supper","Leonardo da Vinci", 3000.00);
        gallery.addArtwork(artwork2);
        assertThat(gallery.getArtworkCount()).isEqualTo(2);
    }

    @Test
    public void canGetTillAmount(){
        assertThat(gallery.getTillAmount()).isEqualTo(0.00);
    }

    @Test
    public void canGetArtworkCount(){
        assertThat(gallery.getArtworkCount()).isEqualTo(1);
    }

    @Test
    public void canRemoveArtworkFromGallery(){
        gallery.removeArtwork(artwork);
        assertThat(gallery.getArtworkCount()).isEqualTo(0);
    }
   // @Test
   // public void canIncreaseTillAmount(1000.00){
    //    assertThat(gallery.getTillAmount()).isEqualTo(1000.00);
    }







