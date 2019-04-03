import com.java.observadores.*;
import com.java.subject.Button;

public class Principal {

	public static void main(String[] args) {
		
		Button btn = new Button();
		
		Observer obs1 = new Gif();
		btn.attach(obs1);
		
		Observer obs2 = new Image();
		btn.attach(obs2);
		
		Observer obs3 = new Text();
		btn.attach(obs3);
		
		btn.click();
		
		System.out.println("-------------");
		
		btn.detach(obs2);
		
		btn.click();
	}

}
