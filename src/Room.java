import java.util.List;
public class Room {
    String name;
    String type;
    int capacity;
    double rate;

    public Room(String name,String type,int capacity,double rate){
       this.name = name;
       this.type = type;
       this.capacity= capacity;
       this.rate= rate;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getRate() {
        return rate;
    }

    public static void main(String[] args) {
        Room pune = new Room("pune", "guestRoom", 4, 150);
        Room nipani = new Room("nipani", "premiere", 5, 200);
        Room belagavi = new Room("belagavi","guest",4,300);

        List<Room> rooms = List.of(pune,nipani,belagavi);
        double total = getPotentialRevenue(rooms);
        System.out.println(total);

    }

    public static double getPotentialRevenue(List<Room> rooms){
        double potentialRevenue = 0;
        for(int i=0;i<rooms.size(); i++){
           potentialRevenue= potentialRevenue + rooms.get(i).getRate();
        }
        return potentialRevenue;
    }
}
