//Ashraf
public class Parcel {
    private Address sourceAddress;
    private Address destinationAddress;
    private String sender;
    private String receiver;
    private Double weight;
    private String status;

    public Parcel(Address sourceAddress, Address destinationAddress, String sender, String receiver, Double weight, String status) {
        this.sourceAddress = sourceAddress;
        this.destinationAddress = destinationAddress;
        this.sender = sender;
        this.receiver = receiver;
        this.weight = weight;
        this.status = status;
    }

    public Address getSourceAddress() {
        return sourceAddress;
    }

    public void setSourceAddress(Address sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    public Address getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(Address destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

   
