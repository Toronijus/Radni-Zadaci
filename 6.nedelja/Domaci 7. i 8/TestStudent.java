package Domaci6nedelja.nedelja;

public class TestStudent {

    public static void main(String[] args) {
        Student prvi = new Student("Ivan", "Petrovic","Automatika", 65);
        Student drugi = new Student("Slobodan", "Jovanovic", "Pravni", 51);
        Student treci = new Student("Slavisa", "Petrovic", "Ekonomija", 100);

        System.out.println(drugi);
        drugi.proveraIspita();
        System.out.println("____________________");
        System.out.println(prvi);
        prvi.proveraIspita();
        System.out.println("_____________________");
        System.out.println(treci);
        treci.proveraIspita();
    }


}
