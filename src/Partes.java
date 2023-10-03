public class Partes {
    private String motor;
    private String cambio;
    private String chassis;
    private String banco;

    public Partes(String motor, String cambio, String chassis, String banco) {
        this.motor = motor;
        this.cambio = cambio;
        this.chassis = chassis;
        this.banco = banco;
    }

    public String toString() {
        return "Motor: " + motor + "\nCâmbio: " + cambio + "\nChassis: " + chassis + "\nBanco: " + banco;
    }
}
