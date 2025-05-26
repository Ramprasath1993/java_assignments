public class Voter {
    private int age;
    private String name;
    private int voterId;

    public Voter(int voterId, String name, int age) throws Exception {
        if (age < 18) {
            throw new Exception("invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Voter ID: " + voterId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + "  valid age for voter");
    }

    public static void main(String[] args) {
        try {
            Voter voter = new Voter(101, "John Doe", 20);
            voter.display();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
