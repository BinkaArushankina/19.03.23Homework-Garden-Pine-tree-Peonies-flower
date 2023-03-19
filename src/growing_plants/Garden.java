package growing_plants;


public class Garden {
    /*
    Садовод-любитель. Выращиваем растения в течение нескольких лет и смотрим что будет.
    Задача:
    Выращиваем деревья и цветы. Каждый из этих двух видов имеет следующие характеристики:
    displayName, height, age.  Каждый из них вырастает за сезон на разную высоту, одинаковую
    для всех деревьев и всех цветов.(static constanta rost Tree and Plant)
    Каждый сезон состоит из четырех времен года, в которые цветы и деревья  ведут себя не
    всегда одинаково.
    Для цветов:
    -сезон начинается весной и весной цветы растут
    -летом они не растут а цветут
    -осенью их срезают
    -зимой цветы не растут
    Для деревьев:
    -сезон начинается весной и весной они растут
    -летом растут
    -осенью не растут
    -зимой деревья не растут
    В классе Garden создать метод growPlants,  в  котором подробно отражен процесс роста
    двух растений в течение нескольких лет (т.е. что происходит с ними зимой,летом , весной и
    размер их в каждый сезон м какого они размера и возраста в конце.
    Пример результата работы метода growPlants:
    Growing plants for 3 years
    Pine tree has grown in Spring. 105  (public method doSpring)
    Pine tree has grown in Summer. 110  (abstract method)
    Pine tree is not growing  in Autumn. 110  (abstract method)
    Pine tree is not growing  in Winter. 110 (public method)
    .........
    Pine tree has height: 120 and is 3 years old
    Tulip has height... and is 3 years old
     */
    private static int TREE_GROW_PER_SEASON=5;
    public static void main(String[] args) {

        Tree pine = new Tree("Pine Tree", 105, 5);
        Flowers peonies = new Flowers("Peonies Flower", 0, 0);

        Plant[] plants = {pine, peonies};
        int numberOfYears = 3;

        growPlants(plants,numberOfYears);
    }
    public static void growPlants(Plant[]plants, int numberOfYears){
        int counter=0;
        int grow=(TREE_GROW_PER_SEASON*numberOfYears);
        for(Plant plant : plants) {
            plant.year();
            System.out.println();
        }
        for(int n=0; n<numberOfYears; n++) {
             counter++;
        }
        System.out.println(plants[0]+" has height "+(plants[0].getHeight()+grow)+" and is "+(plants[0].getAge()+counter)+" years old. ");
        System.out.println(plants[1]+" has height "+0+" and is "+(plants[1].getAge()+counter)+" years old. \n");
    }
    /*
Pine Tree has grown in Spring. 105
Pine Tree has grown in Summer. 110
Pine Tree is not growing in Autumn. 110
Pine Tree is not growing in Winter. 110

Peonies Flower has grown in Spring. 0
Peonies Flower bloom. 5
Peonies Flower cut. 0
Peonies Flower is not growing in Winter. 0

Pine Tree has height 120 and is 8 years old.
Peonies Flower has height 0 and is 3 years old.
     */

}
