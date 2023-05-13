package week1.day2.assignments.mandatory;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text="We learn java basics as part of java sessions in java week1";

String[] split= text.split(" ");
for (int i = 0; i < split.length; i++) {
	int count=0;
	for (int j = i+1; j < split.length; j++) {
			
			if (split[i].equalsIgnoreCase(split[j])) {
				count++;
				break;
				
			}
		}
		
		if (count==0) {
			System.out.println(split[i]+" ");
			
		}
	}
}
	}


