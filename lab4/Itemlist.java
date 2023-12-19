package lab4;

public class Itemlist {
    final int max=100;
    Item[] list=new Item[max];
    int numOfItem;

    public Itemlist() {
        numOfItem=0;
    }
    
    public boolean addItem(Item item){
        if(numOfItem<0 ||numOfItem>=max)
            return false;
        list[numOfItem]=item;
        numOfItem++;
        return true;
    }

    public void displayAll(){
        if(numOfItem==0){
            System.out.println("the list is empty");
        }
        
        for(int i=0;i<numOfItem;i++){
            list[i].output();
        }
    }

    public Item findItem(String creator){
        for(int i=0;i<numOfItem;i++){
            if(list[i].getCreator().equals(creator))
                return list[i];
        }
        return null;
    }

    public boolean updateItem(int index){
        if(index>=0&&index<numOfItem){
            list[index].input();
            System.out.println("-----updated-----");
            return true;
        }
        else System.out.println("index is not valid");
        return false;
    }

    public boolean removeItem(int index){
        if(index>=0&& index<numOfItem){
            for(int i=index;i<numOfItem;i++){
                list[i]=list[i+1];
                
            }
            numOfItem--;
            return true;
        }
        else System.out.println("index is not valid");
        return false;
    }

    public void sortItem(){
        for(int i=0;i<numOfItem-1;i++){
            for(int j=0;j<numOfItem-i-1;j++){
                if(list[j].getValue()>list[j+1].getValue()){
                    Item tmp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=tmp;
                }
            }
        }
    }

    public void displayItemByType(String type){
        if(type.equals("vase")){
            for(int i=0;i<numOfItem;i++){
                if(list[i] instanceof Vase){
                    list[i].output();
                }
            }
        }
        else if(type.equals("statue")){
            for(int i=0;i<numOfItem;i++){
                if(list[i] instanceof Statue){
                    list[i].output();
                }
            }
        }
        else if(type.equals("painting")) {
            for(int i=0;i<numOfItem;i++){
                if(list[i] instanceof Painting){
                    list[i].output();
                }
            }
        }
        else System.out.println("type is not exist");
    }
}
