package VisitorPattern.Visitor.ConcreteClasses;

import VisitorPattern.Visitor.Methods.UsagePromo;

public class TelcoAllowance implements UsagePromo {

    @Override
    public String showAllowance(String telcoName, double money) {
        String allowanceDescription = "";

        if (money >= 500.0) {
            allowanceDescription = "Data Allowance is 15GB";
        } else if (money >= 450.0) {
            allowanceDescription = "Data Allowance is 10GB";
        } else if (money >= 400.0) {
            allowanceDescription = "Data Allowance is 8GB";
        } else {
            allowanceDescription = "Data Allowance is not available for this plan.";
        }

        return allowanceDescription + ", Price is " + money;
    }
}
