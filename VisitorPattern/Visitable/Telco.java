package VisitorPattern.Visitable;

import VisitorPattern.Visitor.Methods.*;

public class Telco implements TelcoSubscription{
    private double promoPrice;
    private String telcoName;
    private boolean unliCallText;

    public Telco(double promoPrice, String telcoName, boolean unliCallText) {
        this.promoPrice = promoPrice;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    public double getPromoPrice() {
        return promoPrice;
    }

    public void setPromoPrice(double promoPrice) {
        this.promoPrice = promoPrice;
    }



    public String getTelcoName() {
        return telcoName;
    }

    public void setTelcoName(String telcoName) {
        this.telcoName = telcoName;
    }

    public boolean isUnliCallText() {
        return unliCallText;
    }

    public void setUnliCallText(boolean unliCallText) {
        this.unliCallText = unliCallText;
    }

    @Override
    public String accept(UsagePromo promo, double price) {
        this.promoPrice = price;
        return promo.showAllowance(telcoName, promoPrice);
    }

    @Override
    public String accept(IUnliCallsTextOffer unliPackage, boolean unliCallText) {
        this.unliCallText =  unliCallText;
        return unliPackage.showUnliCallsTextOffer(telcoName, unliCallText);
    }
}
