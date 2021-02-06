package services;

import repository.Store;

public class CreateStore {

    private Store store;

    public void createStore(){
        store = new Store();
    }

    public Store getStore() {
        return store;
    }
}
