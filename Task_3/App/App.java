package App;

import repository.Store;
import services.*;

public class App {
    public void start(){
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

        addSub.add_subjects(MainStore, new String[]{"English Grammar", "Mathematics", "Physics", "Chemistry", "Biology"});
        addTeacher.add_Teachers(MainStore, new String[]{"John Smith", "Lara Gilbert", "Johanna Kabir", "Danniel Robertson", "Larry Cooper"});

        boolean run = true;

        promt.print();

        while(run){
            char input;
            try {
                input = in.takeChar();
            }catch (Exception e){
                System.out.println("Wrong Input Type!!!, Follow Intruction.");
                continue;
            }
            if (input == 'A') {
                a.task(in, MainStore);
                promt.print();
            }

            else if(input =='B') {
                b.task(MainStore);
                run = false;
            }

            else if (input== 'C') {
                c.task(MainStore);
                run = false;
            }
            else{
                System.out.println("Wrong Input!!!, Follow Intruction.");
                promt.print();
            }
        }
    }
}
