package fikt.edu.mk;

import java.util.Arrays;

public class covek {

    public String ime = "Arben";
    public String prezime = "Klenja";
    public String indeks= "INKI683";

    public String getime() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    @Override
    public String toString() {
        return "Student vo FIKT : "+ ime +" " +prezime+" "+indeks;
    }

    public void setime(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }



    public String getIndeks() {
        return indeks;
    }

    public void setIndeks(String indeks) {
        this.indeks = indeks;
    }


    public static class student{

        String[] predmeti = {"AS", "DLS", "MAT1", "IB", "SP"};
        String[] datumi = {"17.12.2019", "19.12.2019", "18.12.2019", "15.12.2019", "16.12.2019"};

        public int getN() {
            return m;
        }

        public String[] getPredmeti() {
            return predmeti;
        }

        public String[] getDatumi() {
            return datumi;
        }

        public void setN(int m) {
            this.m = m;
        }

        public void setPredmeti(String[] predmeti) {
            this.predmeti = predmeti;
        }

        public void setDatumi(String[] datumi) {
            this.datumi = datumi;
        }

        public int m = 0;

        @Override
        public String toString() {
            return "Predmet - " + predmeti[0 + m] + " - Datum na polaganje " + datumi[0 + m] + "\nVnesi Ocenka : ";
        }





        public student() {

        }

        public static class ocenka{

            int[] niza = new int[5];
            float prosek;

            @Override
            public String toString() {
                return "Prosekot iznesuva: "+ getProsek();
            }

            public void setniza(int[] niza) {
                niza = niza;
            }

            public int[] getniza() {
                return niza;
            }


            public float getProsek() {
                prosek = ((float)niza[0]+(float)niza[1]+(float)niza[2]+(float)niza[3]+(float)niza[4])/5;
                return prosek;
            }

        }
    }
}