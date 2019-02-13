public class Dog extends Pet {

    private String breed;
    private Double length;
    private boolean gender;

    public Dog (String name, int age, String breed, Double length, boolean gender) {
        super(name, age);
        setBreed(breed);
        setLength(length);
        setGender(gender);
    }



    @Override
    public String toString(){
        System.out.println("\n ********* PET REGISTRATION ********\n");
        System.out.println("       /^-^\\         /^-----^\\\n" +
                "      / o o \\        V  o o  V\n" +
                "     /   Y   \\        |  Y  |\n" +
                "     V \\ v / V         \\ Q /\n" +
                "       / - \\           / - \\\n" +
                "      /    |           |    \\\n" +
                "(    /     |           |     \\     )\n" +
                " ===/___) ||           || (___\\====\n");

        return "\nNAME: " +getName() + "\nAGE: " + getAge() + "\nBREED: " + getBreed()
                + "\nLENGTH: " + getLength() + "\nGENDER: " + (getGender() ? "Female" : "Male") + "\n \n*************************************";

    }



    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {


        this.gender = gender;
    }
}
