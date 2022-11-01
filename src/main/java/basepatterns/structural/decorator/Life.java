package basepatterns.structural.decorator;



public class Life {
    public static void main(String[] args) {
        Human human = new OldMan(new Adult(new Kid()));

        System.out.println(human.live());

    }


}
