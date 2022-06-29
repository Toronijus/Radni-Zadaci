package Domaci7nedelja2;

public abstract class Planinar {
        private int id;
        private String ime;
        private String prezime;

        public Planinar(int id, String ime, String prezime) {
            this.id = id;
            this.ime = ime;
            this.prezime = prezime;
        }

        public int getId() {
            return id;
        }

        public String getIme() {
            return ime;
        }

        public String getPrezime() {
            return prezime;
        }

        public abstract void Stampaj();

        public abstract int vratiClanarinu();

        public abstract boolean uspesanUspon(Planina p);




    }


