package VisitorPattern.Visitor.ConcreteClasses;

import VisitorPattern.Visitor.Methods.IUnliCallsTextOffer;

public class UnliCallTextPackage implements IUnliCallsTextOffer {
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        if (unliCallText == true) {
            return telcoName + " offers unlimited calls and texts.";
        }
        else {
            return telcoName + " does not offer unlimited calls and texts.";
        }
    }
}
