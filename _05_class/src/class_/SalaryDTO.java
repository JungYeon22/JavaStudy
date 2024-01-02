package class_;

public class SalaryDTO {
    private String name, job;
    private int basic, extra, total, salary;
    private double rate;

    public void setData(String name, String job, int basic, int extra) {
        this.name = name;
        this.job = job;
        this.basic = basic;
        this.extra = extra;
        calc();
    }
    public void calc(){
        total = basic + extra;
        if     (total >= 5000000)   rate = 0.03;
        else if(total >= 3000000)   rate = 0.02;
        else if(total <  3000000)   rate = 0.01;
        salary = total - getTax();
    }

    public int getTax(){
        return (int)(total*rate);
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getBasic() {
        return basic;
    }

    public int getExtra() {
        return extra;
    }

    public int getTotal() {
        return total;
    }

    public int getSalary() {
        return salary;
    }

    public double getRate() {
        return rate;
    }
}
