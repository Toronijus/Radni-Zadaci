package Domaci7nedelja2;

public class RekreativniPlaninar extends Planinar{

        private int tezinaOpreme;
        private String Okruga;
        private int Uspon;

        public RekreativniPlaninar(int id, String ime, String prezime, int tezinaOpreme,
                                   String Okruga, int Uspon) {
            super(id, ime, prezime);
            this.tezinaOpreme = tezinaOpreme;
            this.Okruga = Okruga;
            this.Uspon = Uspon;
        }

        public RekreativniPlaninar(int id, String ime, String prezime) {
            super(id, ime, prezime);
        }

        public int getTezinaOpreme() {
            return tezinaOpreme;
        }

        public String getOkruga() {
            return Okruga;
        }

        public int getUspon() {
            return Uspon;
        }

        @Override
        public void Stampaj() {
            System.out.println(toString());

        }

        @Override
        public int vratiClanarinu() {
            return 1000;
        }

        @Override
        public boolean uspesanUspon(Planina p) {
            if(Realnoprelazi () >= p.getVisina()){
                return true;
            }
            return false;
        }

        public int Realnoprelazi (){
            int realanUspon = Uspon - tezinaOpreme * 50;
            return realanUspon;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("Rekreativac, ID: ").append(getId()).append("\n");
            sb.append("Ime: ").append(getIme()).append(" ").append(getPrezime()).append("\n");
            sb.append("Okrug: ").append(getOkruga());

            return sb.toString();
        }
    }
