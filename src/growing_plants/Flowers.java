package growing_plants;

public class Flowers extends Plant{
    public Flowers(String displayName, int height, int age){
        super(displayName, height, age);
    }
    public void doSummer(){
        System.out.print(getDisplayName()+" bloom. "+(getHeight()+getTreeGrowPerSeason()));
    }
    public void doAutumn(){
        System.out.print(getDisplayName()+" cut. "+0);
    }
    public void doWinter(){
        System.out.print(getDisplayName()+" is not growing in Winter. "+0);
    }
}
