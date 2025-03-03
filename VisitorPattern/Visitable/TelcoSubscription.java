package VisitorPattern.Visitable;

import VisitorPattern.Visitor.Methods.*;

public interface TelcoSubscription {
    String accept(UsagePromo promo, double price);
    String accept(IUnliCallsTextOffer unliPackage, boolean unliCallText);
}
