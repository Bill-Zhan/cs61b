public class DrawTriangle {
	public static void main(String[] args) {
		String star = "*"；
		for (int i = 0; i < 5; i += 1) {
			System.out.println(star.repeat(i+1));
		}
	}
}