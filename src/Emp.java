import javax.persistence.EntityManager;
import customTools.*;;

public class Emp {

	public static void main(String[] args) {
		EntityManager em= DBUtil.getEmFactory().createEntityManager();
		try{
			model.Employee cust =em.find(model.Employee.class, (long)100);
			System.out.println(cust.getFirstName());
		}catch(Exception e){
			System.out.println(e);
		}finally{
			em.close();
			System.out.println("cerrado!");
		}

	}

}
