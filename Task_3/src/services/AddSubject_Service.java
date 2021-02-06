package services;

import model.subject;
import repository.Store;

public class AddSubject_Service {
    public void add_subjects(Store mainStore, String sub0, String sub1, String sub2, String sub3, String sub4) {
        mainStore.getAll_subjects().add(new subject(0, sub0));
        mainStore.getAll_subjects().add(new subject(1, sub1));
        mainStore.getAll_subjects().add(new subject(2, sub2));
        mainStore.getAll_subjects().add(new subject(3, sub3));
        mainStore.getAll_subjects().add(new subject(4, sub4));
    }
}
