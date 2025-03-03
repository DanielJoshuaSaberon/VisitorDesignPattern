package VisitorPattern;

import VisitorPattern.Visitor.ConcreteClasses.TelcoAllowance;
import VisitorPattern.Visitor.ConcreteClasses.UnliCallTextPackage;
import VisitorPattern.Visitable.Telco;
import VisitorPattern.Visitor.Methods.UsagePromo;
import VisitorPattern.Visitor.Methods.IUnliCallsTextOffer;

public class TelcoPromo {
    public static void main(String[] args) {
        Telco smart = new Telco(500.0, "Smart", false);
        Telco globe = new Telco(450.0, "Globe", true);
        Telco ditto = new Telco(400.0, "Ditto", true);

        UsagePromo promo = new TelcoAllowance();
        IUnliCallsTextOffer unli = new UnliCallTextPackage();

        System.out.println("Smart Data Usage Offer and price: " +
                smart.accept(promo, smart.getPromoPrice()));
        System.out.println("Globe Data Usage Offer and price: " +
                globe.accept(promo, globe.getPromoPrice()));
        System.out.println("Ditto Data Usage Offer and price: " +
                ditto.accept(promo, ditto.getPromoPrice()));

        System.out.println("\nSmart unlimited calls and text package: " +
                smart.accept(unli, smart.isUnliCallText()));
        System.out.println("Globe unlimited calls and text package: " +
                globe.accept(unli, globe.isUnliCallText()));
        System.out.println("Ditto unlimited calls and text package: " +
                ditto.accept(unli, ditto.isUnliCallText()));
    }
}
