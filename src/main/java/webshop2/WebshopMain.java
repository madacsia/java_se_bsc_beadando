package webshop2;

public class WebshopMain {
    public static void main(String[] args) {
        Termek alma = new Termek("alma");
        Termek korte = new Termek("körte");

        Raktar.termekek.add(alma);
        Raktar.termekek.add(alma);
        Raktar.termekek.add(alma);
        Raktar.termekek.add(alma);
        Raktar.termekek.add(alma);
        Raktar.termekek.add(alma);
        Raktar.termekek.add(alma);
        Raktar.termekek.add(alma);

        Raktar.termekek.add(korte);
        Raktar.termekek.add(korte);
        Raktar.termekek.add(korte);
        Raktar.termekek.add(korte);

        System.out.println("raktáron induló alma :"+Raktar.keszlet(alma));
        System.out.println("raktáron induló korte :"+Raktar.keszlet(korte));

        Kosar kosar = new Kosar();
        System.out.println("termék alap:"+alma.getDb());
        kosar.kosarbaTermekDb(alma,2);
        System.out.println("kosárban alma:"+kosar.darabszam(alma));

        System.out.println("raktáron alma:"+Raktar.keszlet(alma));

        kosar.kosarbaTermekDb(alma,3);
        System.out.println("kosárban alma:"+kosar.darabszam(alma));
        System.out.println("raktáron alma:"+Raktar.keszlet(alma));

        kosar.kosarbaTermekDb(korte,1);
        System.out.println("kosárban korte:"+kosar.darabszam(korte));

        System.out.println("raktáron korte:"+Raktar.keszlet(korte));

        kosar.kosarbaTermekDb(korte,2);
        System.out.println("kosárban korte:"+kosar.darabszam(korte));
        System.out.println("raktáron korte:"+Raktar.keszlet(korte));

        kosar.kosarbolTermekTorol(korte);
        System.out.println("kosárban törlés után:"+kosar.darabszam(alma));
        System.out.println("raktáron törlés után:"+Raktar.keszlet(alma));
        System.out.println("kosárban törlés után:"+kosar.darabszam(korte));
        System.out.println("raktáron törlés után:"+Raktar.keszlet(korte));

        Raktar.keszletbolTorol("körte");
        System.out.println("raktáron törlés után2:"+Raktar.keszlet(korte));

        Vevo vevo = new Vevo("nev","lakcim","email","telefon");

        System.out.println("---------------------------Bolt");
        BoltiVasarlas boltiVasarlas = new BoltiVasarlas(vevo,kosar);
        boltiVasarlas.setFizetesMod(Tipusok.FizetesMod.KÉZPÉNZ);
        //direkt rosszat ad meg.
        //boltiVasarlas.setAtvetelMod(Tipusok.AtvetelMod.HAZHOZSZALLITAS);
        System.out.println(boltiVasarlas.getAtvetelMod().toString());
        //System.out.println(boltiVasarlas.getStatusz().toString());

        System.out.println(boltiVasarlas.getStatusz());

        System.out.println("---------------------------Internet");
        InternetesVasarlas internetesVasarlas = new InternetesVasarlas(vevo,kosar);
        System.out.println(internetesVasarlas.getStatusz());
        internetesVasarlas.setAtvetelMod(Tipusok.AtvetelMod.HAZHOZSZALLITAS);
        Futar futar = new Futar(internetesVasarlas);
        System.out.println(futar.rendeles.getStatusz());

        futar.leszallit();
        System.out.println(futar.rendeles.getStatusz());

        futar.rosszSzallit("Nem voltak otthon.");
        System.out.println(futar.rendeles.getStatusz());
        System.out.println(futar.getMegjegyzes().toString());
    }
}
