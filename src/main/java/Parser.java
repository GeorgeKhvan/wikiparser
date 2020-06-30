import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Parser {

	private static Document getPage() throws IOException {
		String text = getSearchText();
		String url = "https://ru.wikipedia.org/" + text;
		Document page = Jsoup.parse(new URL(url), 30000);
		return  page;
	}

	private static String getSearchText() {
		Scanner scanner = new Scanner(System.in);
		String searchText  = scanner.nextLine();
		return  searchText;
	}

	public static void main(String[] args) throws IOException {
   Document page = getPage();
   Element links = page.select("href[]").first();


	}
}
