//Imran
import java.util.ArrayList;
import java.util.List;

public class Parcels {
    private List<Parcel> parcels;

    public Parcels() {
        this.parcels = new ArrayList<>();
    }

    public void add(Parcel parcel) {
        this.parcels.add(parcel);
    }

    public void remove(Parcel parcel) {
        this.parcels.remove(parcel);
    }

    public void print() {
        for (Parcel parcel : this.parcels) {
            System.out.println("Source Address: " + parcel.getSourceAddress().getHouseNumber() + " " + parcel.getSourceAddress().getStreetName() + ", " + parcel.getSourceAddress().getPostcode() + ", " + parcel.getSourceAddress().getState());
            System.out.println("Destination Address: " + parcel.getDestinationAddress().getHouseNumber() + " " + parcel.getDestinationAddress().getStreetName() + ", " + parcel.getDestinationAddress().getPostcode() + ", " + parcel.getDestinationAddress().getState());
            System.out.println("Sender: " + parcel.getSender());
            System.out.println("Receiver: " + parcel.getReceiver());
            System.out.println("Weight: " + parcel.getWeight());
            System.out.println("Status: " + parcel.getStatus());
            System.out.println();
        }
    }

    public Parcel find(String sender) {
        for (Parcel parcel : this.parcels) {
            if (parcel.getSender().equals(sender)) {
                return parcel;
            }
        }
        return null;
    }
}
