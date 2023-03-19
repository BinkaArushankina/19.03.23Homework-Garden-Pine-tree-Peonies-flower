package growing_plants;

public abstract class Plant {
    private static int TREE_GROW_PER_SEASON=5;
    private String displayName;
    private int height;
    private int age;

    public Plant( String displayName, int height, int age) {
        this.displayName = displayName;
        this.height = height;
        this.age = age;
    }
    public String getDisplayName(){
        return displayName;
    }
    public int getHeight(){
        return height;
    }
    public int getAge(){
        return age;
    }
    public static int getTreeGrowPerSeason(){
        return TREE_GROW_PER_SEASON;
    }
    public void year(){
        doSpring();
        System.out.println();
        doSummer();
        System.out.println();
        doAutumn();
        System.out.println();
        doWinter();
        System.out.println();
    }
    public void doSpring(){
        System.out.print(getDisplayName()+" has grown in Spring. "+getHeight());
    }
    public abstract void doSummer();
    public abstract void doAutumn();
    public abstract void doWinter();
    public String toString() {
        return  displayName;
    }
}
