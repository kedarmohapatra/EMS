package com.example.ems.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.ems.domain.Employee;

@Repository
@Transactional
public class EmployeeDaoImpl extends GenericDaoImpl<Employee> implements EmployeeDao{

	public EmployeeDaoImpl() {
		super(Employee.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> searchEmployee(String name, String start) {
		System.err.println("dao lookup employee/manager");
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Employee.class);
		if (start != null) {
			criteria.setFirstResult(Integer.parseInt(start)).setMaxResults(5);
		} 
		List<Employee> employees = criteria.add(Restrictions.or(Restrictions.ilike("firstName", "%"+name+"%"), Restrictions.ilike("lastName", "%"+name+"%"))).addOrder(Order.asc("empId")).list();
		return employees;
	}

    @Override
    public List getManager(){
//        Query query = sessionFactory.getCurrentSession().createQuery("from Employee as emp right join emp.department.location as loc WHERE loc.locationId=1700");
        List list = sessionFactory.getCurrentSession().createCriteria(Employee.class)

                .setProjection(Projections.projectionList()

                        .add(Projections.rowCount())

                        .add(Projections.avg("salary"))

                        .add(Projections.max("commissionPct"))

                        .add(Projections.groupProperty("job"))

                )

                .list();


        return list;
    }
}
