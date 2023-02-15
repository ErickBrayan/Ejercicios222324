public class CocheElectrico implements ICoche {

    String tipo;
    String bateria;

    @Override
    public String tipoCoche() {
        return "Coche Electrico";
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "tipo='" + tipo + '\'' +
                ", bateria='" + bateria + '\'' +
                '}';
    }
}
