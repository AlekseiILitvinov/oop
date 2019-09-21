public class Main {
	public static void main(String[] args) {
		Post post = new Post();
		//initialized with 0 values;
		System.out.println(post.id);

		post.id = 1;
		System.out.println(post.id);

		String text = "IT Academy";
		System.out.println(text);

		System.out.println(post.author);
		User vasya = new User();
		vasya.id = 1;
		vasya.name = "Василий";

		post.author = vasya; // author prop is linked to the vasya obj

		User boss = vasya;
		boss.avatarUrl = "https://hippi.ru";
		System.out.println(post.author.avatarUrl);

	}
}
