package entities;

import javax.swing.plaf.SpinnerUI;
import java.util.Objects;

/**
 * abstract class for employee
 * @author rutov
 */
public abstract class Employee {
   protected String firstName;
   protected String lastName;
   protected int id;

   /**
    * constructor
    * @param firstName first name of employee
    * @param lastName
    * @param id
    */
   public Employee(String firstName, String lastName, int id) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.id = id;
   }

   public Employee() {
      this("plony","almony",0);
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      if (id<0){
         throw new IllegalArgumentException("id cant be <0");
      }
      this.id = id;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Employee employee = (Employee) o;
      return id == employee.id && firstName.equals(employee.firstName) && lastName.equals(employee.lastName);
   }

   @Override
   public int hashCode() {
      return Objects.hash(firstName, lastName, id);
   }

   @Override
   public String toString() {
      return "Employee{" +
              "firstName='" + firstName + '\'' +
              ", lastName='" + lastName + '\'' +
              ", id=" + id +
              '}';
   }
   public abstract double earnings();
}
