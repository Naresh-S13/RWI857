package Association;

//Composition

class Processor{
    private String name;
    Processor(String Model){
        this.name=Model;
    }

    String getname(){
        return this.name;
    }
}

class Laptop{
    private String Name;
    private final Processor Model;
    Laptop(String s, String Name){
        Model=new Processor(s);
        this.Name=Name;
    }
    Processor getModel() {
        return this.Model;
    }
    String getName(){
        return Name;
    }
}


class Composition{
    public static void main(String[] args){
        Laptop Dell=new Laptop("Intel","Dell");
        Laptop Lenovo=new Laptop("AMD Ryzen", "Lenovo");
        System.out.println("LaptopName "+ Dell.getName()+" - "+"Processor "+Dell.getModel().getname());
        System.out.println("LaptopName "+ Lenovo.getName()+" - "+"Processor "+Lenovo.getModel().getname());
    }
}

