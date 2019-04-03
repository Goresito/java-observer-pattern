import com.java.observadores.*;
import com.java.subject.Button;

public class Principal {

	public static void main(String[] args) {
		
		Button btn = new Button();
		
		new Gif(btn);
		new Image(btn);
		new Text(btn);
		
		btn.click();
		
		System.out.println("-------------");
		
		//btn.detach(obs2);
		new Scrollbar(btn);
		
		btn.click();
	}

}
