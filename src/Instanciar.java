public class Instanciar {
    private String cor;
    private String motor;
    private String cambio;
    private String chassis;

    public Instanciar(String cor, String motor, String cambio, String chassis) {
        this.cor = cor;
        this.motor = motor;
        this.cambio = cambio;
        this.chassis = chassis;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMotor() {
        return motor;
    }
    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCambio() {
        return cambio;
    }
    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public String getChassis() {
        return chassis;
    }
    public void setChassis(String chassis) {
        this.chassis = chassis;
    }
}