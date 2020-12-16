package webshop2;

public class Vevo {

    private String nev;
    private String lakcim;
    private String email;
    private String telefonszam;

    public Vevo(String nev, String lakcim, String email, String telefonszam) {
       if (nev == null || lakcim == null || email == null || telefonszam == null ||
           email.isEmpty() || telefonszam.isEmpty()) {
         throw new HibaKezeles(Tipusok.Hibak.VEVO_URES);
       }
        this.nev = nev;
        this.lakcim = lakcim;
        this.email = email;
        this.telefonszam = telefonszam;
    }

    public String getNev() {
        return nev;
    }

    public String getLakcim() {
        return lakcim;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefonszam() {
        return telefonszam;
    }
}
