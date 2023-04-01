package Factory;

import Factory.Animal.Animal;
import Factory.Color.Color;
import OldFactory.GetPlanFactory;
import OldFactory.Plan;

public class FactoryExample {

    public static void show(String type, String concreteType){

        FactoryProvider planFactory = new FactoryProvider();

        AbstractFactory<Animal> test;
        AbstractFactory<Color> test;



        if ("animal".equalsIgnoreCase(concreteType)){
            Animal
        }

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
