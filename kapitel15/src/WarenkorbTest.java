import warenkorb.*;
public class WarenkorbTest {
    public static void main(String[] args) {
        Warenkorb korb = new Warenkorb();
        System.out.println("leerer Warenkorb: " + korb.bestellwert());

        Artikel stift = new Artikel(1, 2.5, 4);
        Artikel heft = new Artikel(2, 10.0, 1);
        korb.add(stift);
        korb.add(heft);
        System.out.println("nach zwei Artikeln: " + korb.bestellwert());

        stift.setMenge(10);
        System.out.println("nach setMenge(10) beim Stift: " + korb.bestellwert());
    }
}
