package services;

import model.ClassPlan;
import repository.Store;

public class service_B {

    public void task(Store mainStore) {
        if (mainStore.getClassPlan_items().size()==0){
            System.out.println("No Class Plan Recorded Yet.");
            return;
        }
        for(ClassPlan cls : mainStore.getClassPlan_items()) {
            System.out.println(cls.getInfo());
        }
    }
}
