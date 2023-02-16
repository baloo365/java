package 생성자;

public class 직원 {

				
				static int count;
				static int sum;
				static double avg;
				String name;
				int age;
				String gender;
				public 직원(String name, int age, String gender) {
					count++;
					sum += age;
					avg = (double) sum / count;
					this.name = name;
					this.age = age;
					this.gender = gender;
				}
				@Override
				public String toString() {
					return "직원 [name=" + name + ", age=" + age + ", gender=" + gender + "]";
				}
				
				
	
	
	

}
