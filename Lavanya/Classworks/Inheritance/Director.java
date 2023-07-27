public class Director extends Admin{
    String budget;

    public Director(int eid, String eName, int salary, String dept, String budget) {
        super(eid, eName, salary, dept);
        this.budget = budget;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }
}
