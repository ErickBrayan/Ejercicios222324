public class CocheHibrido implements ICoche{


    String bateria;
    String tamanioTanque;

    @Override
    public String tipoCoche() {
        return "Coche Hibrido";
    }

    @Override
    public String toString() {
        return "CocheHibrido{" +
                "bateria='" + bateria + '\'' +
                ", tamanioTanque='" + tamanioTanque + '\'' +
                '}';
    }
}
