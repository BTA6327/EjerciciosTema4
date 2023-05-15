public class SmartWatch extends SmartDevice {
    double centimetros;
    String conectividad;

    public SmartWatch() {
        super();
    }

    public SmartWatch(String marca, String modelo, String color, double centimetros, String conectividad) {
        super(marca, modelo, color);
        this.centimetros = centimetros;
        this.conectividad = conectividad;
    }

    @Override
    public String toString() {
        return "marca=" + marca +
                ", modelo=" + modelo +
                ", color=" + color +
                ", centimetros=" + centimetros +
                ", conectividad=" + conectividad;
    }
    
}
