package entities;

public class HourlyEmployee  extends  Employee{
    private int _hours;
    private float _wage;

    public int getHours() {
        return _hours;
    }

    public void setHours(int hours) {
        if(hours < 0){
            throw new IllegalArgumentException("hours cannot be negative");
        }
        _hours = hours;
    }

    public float getWage() {
        return _wage;
    }

    public void setWage(float wage) {
        _wage = wage;
    }

    public HourlyEmployee(String firstName, String lastName, int id, int hours, float wage) {
        super(firstName, lastName, id);
        setHours(hours);
        _wage = wage;
    }

    public HourlyEmployee() {
        //super();
        setHours(0);
        _wage = 0;
    }

    @Override
    public double earnings() {
        return _hours* _wage;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", _hours=" + _hours +
                ", _wage=" + _wage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HourlyEmployee that = (HourlyEmployee) o;
        return _hours == that._hours && Float.compare(that._wage, _wage) == 0;
    }
}
