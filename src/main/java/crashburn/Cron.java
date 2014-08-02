package crashburn;

import com.basistech.readability.HttpPageReader;
import com.basistech.readability.PageReadException;
import com.basistech.readability.PageReader;
import com.basistech.readability.TikaCharsetDetector;

public class Cron {

	public static void main(String[] args) {
		PageReader pageReader = new HttpPageReader();
		pageReader.setCharsetDetector(new TikaCharsetDetector());
		
		try {
			String content = pageReader.readPage("http://psv.tgbus.com/");
			System.out.println(content);
		} catch (PageReadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
