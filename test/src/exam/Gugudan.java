package exam;

public class Gugudan {

	public void gugudan() {
		for(int i=1; i<10; i++) {
			for(int j = 2; j<10; j++) {
				if(i == 1) {
					System.out.print(j+ "단 \t");
					continue;
				}
				System.out.print(j + "*" + i + "=" + (j*i) + "\t");
			}
			System.out.println();
		}
	}
}
