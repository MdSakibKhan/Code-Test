package App;

import model.ClassPlan;
import model.subject;
import model.teacher;
import repository.Store;
import services.*;

public class main {
    public static void main(String[]args){

        CreateStore create = new CreateStore();
        create.createStore();

        Store MainStore = create.getStore();

        AddSubject_Service addSub = new AddSubject_Service();
        addSub.add_subjects(MainStore,"English Grammar","Mathematics","Physics","Chemistry","Biology");


        AddTeacher_Service addTeacher = new AddTeacher_Service();
        addTeacher.add_Teachers(MainStore,"John Smith","Lara Gilbert","Johanna Kabir","Danniel Robertson","Larry Cooper");


        boolean run = true;

        while(run) {

            PromptCommands_service promt = new PromptCommands_service();
            promt.print();

            InputService in = new InputService();

            char input = in.takeChar();

            if (input == 'A') {
                service_A a = new service_A();
                a.task(in, MainStore);
            }

            if(input =='B') {
                service_B b = new service_B();
                b.task(MainStore);
                run = false;
            }

            if (input== 'C') {
                service_C c = new service_C();
                c.task(MainStore);
                run = false;
            }

        }
    }
}
