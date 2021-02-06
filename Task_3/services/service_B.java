package services;

import model.ClassPlan;
import repository.Store;

public class service_B {

    public void task(Store mainStore) {
        for(ClassPlan cls : mainStore.getClassPlan_items()) {
            System.out.println(cls.getInfo());
        }
    }
}
