package services;

import model.subject;
import model.teacher;
import repository.Store;

public class AddTeacher_Service {
    public void add_Teachers(Store mainStore,String teacher0, String teacher1, String teacher2,String teacher3, String teacher4) {
        mainStore.getAll_teachers().add(new teacher(0, teacher0));
        mainStore.getAll_teachers().add(new teacher(1, teacher1));
        mainStore.getAll_teachers().add(new teacher(2, teacher2));
        mainStore.getAll_teachers().add(new teacher(3, teacher3));
        mainStore.getAll_teachers().add(new teacher(4, teacher4));
    }
}
