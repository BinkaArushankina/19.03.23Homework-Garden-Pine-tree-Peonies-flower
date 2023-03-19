package growing_plants;

public class Tree extends Plant{
    public Tree(String displayName, int height, int age){
        super(displayName, height, age);
    }
    public void doSummer(){
        System.out.print(getDisplayName()+" has grown in Summer. "+(getHeight()+getTreeGrowPerSeason()));
    }
    public void doAutumn(){
        System.out.print(getDisplayName()+" is not growing in Autumn. "+(getHeight()+getTreeGrowPerSeason()));
    }
    public void doWinter(){
        System.out.print(getDisplayName()+" is not growing in Winter. "+(getHeight()+getTreeGrowPerSeason()));
    }

}
