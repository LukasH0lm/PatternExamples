package OldFactory;

public class FactoryExample {

    public static void show(){

        GetPlanFactory planFactory = new GetPlanFactory();

        int units = 10;
        String planName = "DomesticPlan";

        Plan p = planFactory.getPlan(planName);

        System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");
        p.getRate();
        p.calculateBill(units);

        planName = "CommercialPlan";
        p = planFactory.getPlan(planName);

        System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");
        p.getRate();
        p.calculateBill(units);

    }

}
