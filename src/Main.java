public class Main {
    public static void main(String[] args) {
        ICocheElectrico iCoche = new CocheElectrico();
        ICocheCombustible iCoche2 = new CocheCombustible();
        CocheHibrido iCoche3 = new CocheHibrido();

        System.out.println(iCoche.tipoCoche());
        System.out.println(iCoche2.tipoCoche());
        System.out.println(iCoche3.tipoCoche());
    }
}