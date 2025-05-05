package lesson4;

public abstract class Notification {
    private String recipient;

    public Notification(String recipient){
        this.recipient = recipient;
    }

    public abstract void send();

    public void log(){
        System.out.println("AAA" + this.getRecipient());
    }

    public String getRecipient() {
        return recipient;
    }

    
}
