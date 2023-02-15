public class CocheCombustible implements ICoche{

    String tamanioTanque;

    @Override
    public String tipoCoche() {
        return "Coche Combustible";
    }

    @Override
    public String toString() {
        return "CocheCombustible{" +
                "tamanioTanque='" + tamanioTanque + '\'' +
                '}';
    }
}
