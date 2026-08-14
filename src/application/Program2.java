package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();


        System.out.println("=== Test 1: seller findById ====");
        Department dep = departmentDao.findById(1);
        System.out.println(dep);

        System.out.println("\n=== Test 2: seller findAll ====");
        Department department = new Department(2, null);
        List<Department> list = departmentDao.findAll();
        for (Department d : list){
            System.out.println(d);
        }


    }
}
