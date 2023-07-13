import java.util.ArrayList;

public class Gallery {

    private String name;
    private double tillAmount;

    private ArrayList<Artwork> artworks;

    public Gallery(String inputName, double tillAmount){
        this.name = inputName;
        this.artworks = new ArrayList<Artwork>();
        this.tillAmount = tillAmount;
    }
    public String getName(){
        return this.name;
    }

    public void addArtwork(Artwork newArtwork) {
        this.artworks.add(newArtwork);
    }


    public double getTillAmount(){
        return this.tillAmount;
    }

    public int getArtworkCount() {
        return this.artworks.size();
    }

    public void removeArtwork(Artwork removedArtwork) {
        this.artworks.remove(removedArtwork);
        this.tillAmount += removedArtwork.getPrice();
    }

   // public void buyArtwork(){

    }

    //for each artwork purchased
        //-1 from artwork count (-1) public int
    //decrease price from walletAmount (-=)
    //add price to tillAmount (+=)de






