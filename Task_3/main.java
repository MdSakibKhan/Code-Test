import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		subject []all_subject = new subject[5];
		
		all_subject[0] = new subject("English Grammar");
		all_subject[1] = new subject("Mathematics");
		all_subject[2] = new subject("Physics");
		all_subject[3] = new subject("Chemistry");
		all_subject[4] = new subject("Biology");
		
		teacher []all_teacher = new teacher[5];
		
		all_teacher[0] = new teacher("John Smith");
		all_teacher[1] = new teacher("Lara Gilbert");
		all_teacher[2] = new teacher("Johanna Kabir");
		all_teacher[3] = new teacher("Danniel Robertson");
		all_teacher[4] = new teacher("Larry Cooper");
		
		ArrayList<classroom> class_list = new ArrayList<classroom>();
		
		
		boolean run = true;
		
		while(run) {
		System.out.println("A. Create Routine");
		System.out.println("B. Show Routine");
		System.out.println("C. List Courses with Teachers Name");
		char inp = scan.nextLine().charAt(0);

		
		if (inp== 'C') {
			for(int i = 0; i< all_subject.length;i++) {
				System.out.println(all_subject[i].getName()+","+all_teacher[i].getName());
			}
			run = false;
		}
		
		
		if (inp == 'A') {
			for(int i = 0; i< all_subject.length;i++) {
				System.out.println((i+1)+". "+all_subject[i].getName());
			}
			System.out.println("Insert dayIndex(0 - 4) hourIndex(0 - 3) courseIndex");
			
			int dayIndex = scan.nextInt();
			while(dayIndex<0 || dayIndex>4) {
				System.out.println("Out Of Range, Please Enter dayIndex(0 - 4)");
				dayIndex = scan.nextInt();
			}
			int hourIndex = scan.nextInt();
			while(hourIndex<0 || hourIndex>3) {
				System.out.println("Out Of Range, Please Enter hourIndex(0 - 3)");
				hourIndex = scan.nextInt();
			}
			int courseIndex = scan.nextInt();
			
			class_list.add(new classroom(dayIndex, hourIndex, all_subject[courseIndex].getName()));
			
			scan.nextLine();
			}
		if(inp =='B') {
			for(classroom cls : class_list) {
				System.out.println(cls.getInfo());
			}
			run = false;
		}
		}
		

	}

}
