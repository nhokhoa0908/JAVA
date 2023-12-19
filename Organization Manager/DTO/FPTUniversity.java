package DTO;

public class FPTUniversity extends University implements Role{
    String address;

    public FPTUniversity() {
    }

    public FPTUniversity(String address, String name, int size) {
        super(name, size);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "FPTU has four campuses Hanoi, HCM, DaNang, CanTho, QuyNhon";
    }

    @Override
    public void  createWorker() {
        System.out.println("“providing human resources");
    }

    

    
}
