package Domaci7nedelja2;

public class Planina {
        private String ime;
        private String drzava;
        private int visina;

        public Planina(String ime, String drzava, int visina) {
            this.ime = ime;
            this.drzava = drzava;
            this.visina = visina;
        }

        public Planina() {
            this.ime = "";
            this.drzava = "";
            this.visina = 0;
        }

        public String getIme() {
            return ime;
        }

        public String getDrzava() {
            return drzava;
        }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public void setVisina(int visina) {
        this.visina = visina;
    }

    public int getVisina() {
            return visina;
        }
    }


