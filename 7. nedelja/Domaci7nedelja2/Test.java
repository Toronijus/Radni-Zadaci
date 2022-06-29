package Domaci7nedelja2;
import java.util.ArrayList;
public class Test {


        public static void main(String[] args) {

            Planina Miroc = new Planina("Miroc",
                    "Srbija", 768);
            ArrayList<Planinar> listaPlaninara = new ArrayList<>();
            listaPlaninara.add(new RekreativniPlaninar(001, "Slobodan",
                    "Bogdanovic", 5, "Negotin", 2000));
            listaPlaninara.add(new RekreativniPlaninar(002, "Stefan", "Stefanovic", 3,
                    "Novosadski", 1500));
            listaPlaninara.add(new RekreativniPlaninar(005,"Zorica", "Stefanovic", 10,
                    "Zajecarski",800 ));
            listaPlaninara.add(new Alpinista(003, "Aleksandar", "Malovic", 10 ));
            listaPlaninara.add(new Alpinista(208, "Vuk", "Bogdanovic", 22));
            listaPlaninara.add(new Alpinista(010, "Nebojsa", "Karanovic", 15));



            System.out.println(listaPlaninara.get(1).uspesanUspon(Miroc));
            System.out.println(listaPlaninara.get(4).vratiClanarinu());
            System.out.println(listaPlaninara.get(3).toString());

            System.out.println("-------------------------");


            int sum = 0;

            for (Planinar planinar : listaPlaninara) {
                planinar.Stampaj();
                if (planinar.uspesanUspon(Miroc)) {
                    System.out.println("Uspesan uspon.");
                } else {
                    System.out.println("Nemoguc uspon.");
                }
                System.out.println("---------------------");
                sum += planinar.vratiClanarinu();

            }

            System.out.println("Zbir svih clanarina je: " + sum);







        }
    }
