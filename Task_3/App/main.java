package App;

import model.*;
import repository.*;
import services.*;

public class main {
    public static void main(String[]args){

        CreateStore_service repository = new CreateStore_service();
        AddSubject_Service addSub = new AddSubject_Service();
        AddTeacher_Service addTeacher = new AddTeacher_Service();
        PromptCommands_service promt = new PromptCommands_service();
        InputService in = new InputService();

        service_A a = new service_A();
        service_B b = new service_B();
        service_C c = new service_C();

        repository.createStore();
        Store MainStore = repository.getStore();

        addSub.add_subjects(MainStore,"English Grammar","Mathematics","Physics","Chemistry","Biology");
        addTeacher.add_Teachers(MainStore,"John Smith","Lara Gilbert","Johanna Kabir","Danniel Robertson","Larry Cooper");

        boolean run = true;

        while(run) {
            promt.print();

            char input = in.takeChar();

            if (input == 'A') {
                a.task(in, MainStore);
            }

            if(input =='B') {
                b.task(MainStore);
                run = false;
            }

            if (input== 'C') {
                c.task(MainStore);
                run = false;
            }

        }
    }
}
