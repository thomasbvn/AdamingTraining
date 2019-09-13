package fr.formation.inti.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import fr.formation.inti.entities.Employee;
import fr.formation.inti.utils.HibernateUtils;

public class EmployeeDaoImpl implements IEmployeeDao{
	private static IEmployeeDao instance;

	/*public Integer save(Employee e) {
		try {
			.begin();
		}
		em.persist();
		em.remove(e);
		//em.flush();
	}*/
	protected EntityManager em;
	public static IEmployeeDao getInstance() {
		if (instance==null) {
			instance=new EmployeeDaoImpl();
		}
		return instance;
	}
	
	private EmployeeDaoImpl{
		em=getEntityManager();
	}
	private EntityManager getEntityManager() {
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("myApp");
		if (em=null) {
			em=factory.creataeEntityManager();
		}
		return em;
	}

	@Override
	public List<Employee> getAll() {
		return em.createQUery("FROM "+Employee.class.getName()).getResultList();
	}
//        SessionFactory factory=HibernateUtils.getSessionFactory();
//        Session session =factory.getCurrentSession();
//        
//        session.getTransaction().begin();
//        boolean bool=true;
//		
//			
//			while(bool) {
//		        Employee emp=session.find(Employee.class, 4);
//				list.add(emp);
//			}
//			
//			}
//
	@Override
	public Integer save(Employee e) {
		try {
			em.getTransaction().begin();
			em.persist(e);
			System.out.println("====");
			System.out.println(e);
			//em.flush();
		}
		catch(Exception ex) {
			ex.printStackTrace();
			em.getTransaction().rollback();
		}
		return e.getEmp_id();
	}
	
	@Override
	public Employee findByID(Intger id) {
//        SessionFactory factory=HibernateUtils.getSessionFactory();
//        Session session =factory.getCurrentSession();
//        
//        session.getTransaction().begin();
////			PreparedStatement pst = con.prepareStatement(Constants.INSERT_EMPLOYEE,Statement.RETURN_GENERATED_KEYS);
////			pst.setString(1, e.getFirstName());
////			pst.setString(2, e.getLastName());
////			pst.setDate(3, new Date(e.getStartDate().getTime()));
////			
////			pst.executeUpdate();
////			ResultSet rs = pst.getGeneratedKeys();
////			
////			if(rs.next())
////				idEmp = rs.getInt(1);
//			
//			}
//
//	@Override
//	public void update(Employee e) {
//        SessionFactory factory=HibernateUtils.getSessionFactory();
//        Session session =factory.getCurrentSession();
//        
//        session.getTransaction().begin();
//	}
//	
//	@Override
//	public void delete(Employee e) {
//		Connection con = null;
//		try {
//	        SessionFactory factory=HibernateUtils.getSessionFactory();
//	        Session session =factory.getCurrentSession();
//	        
//	        session.getTransaction().begin();
//	}
//
//	@Override
//	public Employee findById(Integer id) {
//        SessionFactory factory=HibernateUtils.getSessionFactory();
//        Session session =factory.getCurrentSession();
//        
//        session.getTransaction().begin();
//        
////			PreparedStatement pst = con.prepareStatement(Constants.SELECT_EMPLOYEE_BY_ID);
////			pst.setInt(1, id);			
////			ResultSet rs = pst.executeQuery();	
//			
//			if(rs.next()) {
//				emp = new Employee();
//				emp.setEmpId(rs.getInt(1));
//				emp.setFirstName(rs.getString(2));
//				emp.setLastName(rs.getString(3));
//				emp.setStartDate(rs.getDate(4));
//}
}