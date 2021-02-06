package services;

import repository.Store;

public class service_C {
    public void task(Store mainStore) {
        for(int i = 0; i< mainStore.getAll_subjects().size(); i++) {
            System.out.println(mainStore.getAll_subjects().get(i).getName()+","+mainStore.getAll_subjects().get(i).getName());
        }
    }
}
