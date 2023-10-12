public class Patient {
    String name;
    Integer age;
    String disease;
    Integer amount;
    
    public Patient(String name, Integer age, String disease, Integer amount) {
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.amount = amount;
    }
    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    public String getDisease() {
        return disease;
    }
    public Integer getAmount() {
        return amount;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public void setDisease(String disease) {
        this.disease = disease;
    }
    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    @Override
    public String toString() {
        return "Patient [name=" + name + ", age=" + age + ", disease=" + disease + ", amount=" + amount + "]";
    }
}