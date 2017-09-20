import java.io.IOException;
import java.io.InputStream;

public class RunScripts {

	public static void main(String[] args) throws IOException {
		try {
			Process p = Runtime.getRuntime().exec("cmd /c test.bat");
			InputStream is = p.getInputStream();
			
			int i = 0;
			StringBuffer sb = new StringBuffer();
			while((i = is.read()) != -1)
				sb.append((char)i);
			System.out.println(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
