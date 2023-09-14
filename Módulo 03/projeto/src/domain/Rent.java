package domain;

import java.util.Date;

public class Rent {
  protected int id;
  protected Vehicle rentedVehicle;
  protected Person leasingPerson;
  protected Person tenantPerson;
  protected Date rentalDate;
  protected Date returnDate;

  public Person getLeasingPerson() {
    return leasingPerson;
  }

  public Vehicle getRentedVehicle() {
    return rentedVehicle;
  }

  public Person getTenantPerson() {
    return tenantPerson;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }
}
