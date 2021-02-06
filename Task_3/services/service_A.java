package services;

import model.ClassPlan;
import repository.Store;

public class service_A {

    public void task(InputService in, Store mainStore) {
        for(int i = 0; i< mainStore.getAll_subjects().size();i++) {
            System.out.println((i+1)+". "+mainStore.getAll_subjects().get(i).getName());
        }

        System.out.println("Insert dayIndex(0 - 4) hourIndex(0 - 3) courseIndex");
        int dayIndex = in.takeInt();

        while(dayIndex<0 || dayIndex>4) {
            System.out.println("Out Of Range, Please Enter dayIndex(0 - 4)");
            dayIndex = in.takeInt();
        }
        int hourIndex = in.takeInt();
        while(hourIndex<0 || hourIndex>3) {
            System.out.println("Out Of Range, Please Enter hourIndex(0 - 3)");
            hourIndex = in.takeInt();
        }
        int courseIndex = in.takeInt();

        mainStore.getClassPlan_items().add(new ClassPlan(dayIndex, hourIndex, mainStore.getAll_subjects().get(courseIndex).getName()));

        in.next();
    }
}
