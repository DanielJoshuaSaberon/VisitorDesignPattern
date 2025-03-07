# VisitorDesignPattern

# Telco Promo: Visitor Design Pattern Implementation

## Problem Scenario

Imagine you are looking for a new mobile plan for your smartphone. Three major telecommunication providers are offering enticing deals: **Smart**, **Globe**, and **Ditto**.

- **Smart**: 
  - Offers a data allowance of 15 GB for ₱500 per month.
  - However, they do not offer any free calls or texts, and you will be charged per use.

- **Globe**: 
  - Provides a data allowance of 10 GB for ₱450 per month.
  - This plan comes with unlimited calls and texts to subscribers within their network. Calls and texts to other networks are charged extra.

- **Ditto**: 
  - Offers a data allowance of 8 GB for ₱400 per month.
  - This plan includes unlimited calls and texts to all networks within the country.

You are tasked with implementing the **Visitor Design Pattern** based on the given diagram.

## Solution Implementation

The code implements the **Visitor Design Pattern** to model the telco subscription plans. Below is the code for the **TelcoPromo** class, which demonstrates how the visitor pattern works.

### Client Program

```
public class TelcoPromo {
    public static void main(String[] args) {
        // Instantiate Telco objects with appropriate values
        TelcoSubscription smart = new Telco(15, 500, "Smart", false);
        TelcoSubscription globe = new Telco(10, 450, "Globe", true);
        TelcoSubscription ditto = new Telco(8, 400, "Ditto", true);

        // Create visitor objects
        UsagePromo promo = new TelcoAllowance();
        UnliCallOffer unli = new UnliCallTextPackage();

        // Display data usage offers and prices
        System.out.println("Smart Data Usage Offer and price: " + promo.showAllowance(smart.getTelcoName(), smart.getPromoPrice()));
        System.out.println("Globe Data Usage Offer and price: " + promo.showAllowance(globe.getTelcoName(), globe.getPromoPrice()));
        System.out.println("Ditto Data Usage Offer and price: " + promo.showAllowance(ditto.getTelcoName(), ditto.getPromoPrice()));

        // Display unlimited calls and text packages
        System.out.println("\nSmart unlimited calls and text package: " +
            unli.showUnliCallsTextOffer(smart.getTelcoName(), smart.isUnliCallText()));
        System.out.println("Globe unlimited calls and text package: " +
            unli.showUnliCallsTextOffer(globe.getTelcoName(), globe.isUnliCallText()));
        System.out.println("Ditto unlimited calls and text package: " +
            unli.showUnliCallsTextOffer(ditto.getTelcoName(), ditto.isUnliCallText()));
    }
}
```

### UML Diagram
![image](https://github.com/user-attachments/assets/b7c5c76f-d08b-47fe-8378-3b77f27bcf02)
