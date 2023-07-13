public class Artwork {

    private String title;
    private String artist; //CHECK IF WE NEED AN ARRAYLIST
    private double price;
    

    public Artwork(String title, String artistName, double price){
        this.title = title;
        this.artist = artistName;
        this.price = price;
        
    }

    public String getTitle(){
    return this.title;
    }

    public String getArtistName(){
        return this.artist;
    }
    
    public double getPrice(){
    return this.price;
    }

    public void setPrice(double priceOfArtwork){
    this.price = priceOfArtwork;
    
        
    }

}
