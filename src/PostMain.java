import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PostMain {
public static void main(String[] args) {
	//inicializa todo
	ApplicationContext context = new ClassPathXmlApplicationContext("context.xml"); 
	
	Usuario usuario = (Usuario)context.getBean("usuario"); //id del bean
	
	Articulo articulo  = new Articulo();
	
	//Usuario usuario = new Usuario();
	//Articulo articulo =  new Articulo();
	
	usuario.post(articulo);
}
}
