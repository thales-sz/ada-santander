package domain;

import java.util.Date;

public class Rent {
  protected int id;
  protected Vehicle rentedVehicle;
  protected Person leasingPerson;
  protected Person tenantPerson;
  protected String local;
  protected Date date;
  protected int hours;

  public Person getLeasingPerson() {
    return leasingPerson;
  }

  public Vehicle getRentedVehicle() {
    return rentedVehicle;
  }

  public Person getTenantPerson() {
    return tenantPerson;
  }
}
