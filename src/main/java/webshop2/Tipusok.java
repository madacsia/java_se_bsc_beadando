package webshop2;

public class Tipusok {
    public enum Statusz {BOOKED, IN_PROGRESS, DELIVERED, FAIlED_DELIVERED}

    public enum FizetesMod {KÉZPÉNZ, KÁRTYA, ÁTUTALÁS, UTÁNVÉT}

    public enum FizetesModBolt {KÉZPÉNZ, KÁRTYA, ÁTUTALÁS, UTÁNVÉT}

    public enum FizetesModInternet { BANKKÁRTYA, ÁTUTALÁS, UTÁNVÉT}

    public enum AtvetelMod {BOLT, HAZHOZSZALLITAS}

    public enum Hibak {
        KESZLET_TULLEPES, VEVO_URES, NINCS_KISZALLITAS, NINCS_MEGJEGYZES, KOSAR_URES;

        @Override
        public String toString(){
           switch(this) {
               case KESZLET_TULLEPES:
                   return "A rendelt mennyiség nem haladhatja meg a raktárkészletet.";
               case VEVO_URES:
                   return "A vevő adatainak kitöltése kötelező.";
               case KOSAR_URES:
                   return "A kosár üres.";
               case NINCS_KISZALLITAS:
                   return "Nincs kiszállítva.";
               case NINCS_MEGJEGYZES:
                   return "Kötelező megjegyzést írni.";
           }
            return "Kezeletlen hiba";
        }
}

}
