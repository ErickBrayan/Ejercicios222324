public class Main {
    public static void main(String[] args) {
        ICoche iCoche = new CocheElectrico();
        ICoche iCoche2 = new CocheCombustible();
        ICoche iCoche3 = new CocheHibrido();

        System.out.println(iCoche.tipoCoche());
        System.out.println(iCoche2.tipoCoche());
        System.out.println(iCoche3.tipoCoche());
    }
}