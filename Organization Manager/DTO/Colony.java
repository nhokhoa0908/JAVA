package DTO;

public class Colony extends Organization {
    public String place;

    public Colony(){
    }

    public Colony(String place, int size) {
        super(size);
        this.place = place;
    }
    
    @Override
    public void communicateByTool() {
        System.out.println("the colony communicate by sound");
        
    }
    
    public void grow() {
        System.out.println("an annual cycle of growth that begins in spring");
    }
    
    public void reproduce() {
        System.out.println("Colony can reproduce itself through a process");
    }

    @Override
    public String toString() {
        super.toString();
        return "-Colony's place is:" + place ;
    }

    
}
