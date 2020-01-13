import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
    public static void main(String[] args){
        // create an Empty HashMap Object to hold String key and String value pairs
        HashMap<String, String> trackListing = new HashMap<String, String>();
        trackListing.put("Country House", "A very big house in the country");
        trackListing.put("20 Dollar Nose Bleed", 
                "Have you ever wanted to disappear? / And join a monastery / Go out and preach on Manic Street? / Who will I be when I wake up next to a stranger / On a passenger plane?");
        trackListing.put("Coffee's For Closers",
                "I can't explain a thing / I want everything / To change and stay the same Oh time / Doesn't care about anyone or anything / Come together / Come apart / Only get lonely when you read the charts");
        trackListing.put("Disloyal Order Of Water Buffaloes",
                "I'm coming apart at the seams / Pitching myself for leads in other people's dreams now / Buzz, buzz, buzz / Doc, there's a hole where something was / Doc, there's a hole where something was");
        System.out.println("The Lyrics to -- Coffee's For Closers: " + trackListing.get("Coffee's For Closers"));
        Set<String> keys = trackListing.keySet();
        for(String key : keys){
            System.out.println(key + ": " + trackListing.get(key));
        }


    }

}