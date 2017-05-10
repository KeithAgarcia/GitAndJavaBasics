/**
 * Created by Keith on 4/8/17.
 */
public class Restaurant {
    String type; //Mexican, Italin, Fast food.
    String name;
    String address;
    String number; // It's a string because they may enter other characters. ex 704-578-5872 or (704) 578 - 5872.
    int rating;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if(type.contains("Mexican")) {
            System.out.println("That food is nasty");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        if(rating < 4) {
           System.out.println("That movie sucks!");
        }
    }
}
